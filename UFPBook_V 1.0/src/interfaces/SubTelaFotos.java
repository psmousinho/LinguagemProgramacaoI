
package interfaces;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import ufpbook.*;

public class SubTelaFotos extends javax.swing.JPanel {

    private Usuario user;
    
    public SubTelaFotos(Usuario user) {
        initComponents();
        
        this.user = user;
        
        estadoInicial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameFoto = new javax.swing.JFrame();
        lblFotos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlConteudo = new javax.swing.JPanel();

        javax.swing.GroupLayout frameFotoLayout = new javax.swing.GroupLayout(frameFoto.getContentPane());
        frameFoto.getContentPane().setLayout(frameFotoLayout);
        frameFotoLayout.setHorizontalGroup(
            frameFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameFotoLayout.setVerticalGroup(
            frameFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        lblFotos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFotos.setText("Suas Fotos");

        pnlConteudo.setLayout(new java.awt.GridLayout(0, 2));
        jScrollPane1.setViewportView(pnlConteudo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFotos)
                        .addGap(0, 574, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void estadoInicial(){
        pnlConteudo.removeAll();
        
        for(File foto : user.getMural().getFotos()) {
                if(foto == null) {
                    continue;
                }
                
                ImageIcon img = new ImageIcon(foto.getPath());
                img.setImage(img.getImage().getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                
                JLabel lblImagem = new JLabel(img);
                lblImagem.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                       JFrame frame = new JFrame();
                       ImageIcon img2 = new ImageIcon(foto.getPath());
                       img2.setImage(img2.getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH));
                       JLabel lbl = new JLabel(img2);
                       frame.add(lbl);
                       frame.setSize(800, 800);
                       frame.setLocationRelativeTo(null);
                       frame.setVisible(true);
                    }
                    public void mouseEntered(MouseEvent e) {
                        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    }

                    public void mouseExited(MouseEvent e) {
                        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    }
                });
                pnlConteudo.add(lblImagem);
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame frameFoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFotos;
    private javax.swing.JPanel pnlConteudo;
    // End of variables declaration//GEN-END:variables
}