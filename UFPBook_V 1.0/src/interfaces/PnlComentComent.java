package interfaces;

import java.io.Serializable;
import ufpbook.*;

public class PnlComentComent extends javax.swing.JPanel implements Serializable {

    private Usuario user;
    private Comentario comentPai;
    private Comentario comentario;
    private PnlComentario pnlComentario;
    
    public PnlComentComent(Usuario user, Comentario cometPai, Comentario comentario, PnlComentario pnlComentario) {
        initComponents();
        
        this.user = user;
        this.comentPai = cometPai;
        this.comentario = comentario;
        this.pnlComentario = pnlComentario;
        
        lblAutor.setText(comentario.getAutor().getNome() + ":");
        txtTexto.setText(comentario.getTexto());
        txtTexto.setEditable(false);
        
        if(user.equals(comentario.getAutor()) || pnlComentario.getTelaPai().getAdmins().contains(user)) {
            btnExcluirComent.setVisible(true);
        } else {
            btnExcluirComent.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTexto = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        btnExcluirComent = new javax.swing.JButton();

        lblAutor.setText("Autor");

        btnExcluirComent.setText("Deletar comentário");
        btnExcluirComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirComentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTexto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(btnExcluirComent)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirComent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirComentActionPerformed
        comentPai.getComentarios().remove(comentario);
        pnlComentario.loadComentComents();
    }//GEN-LAST:event_btnExcluirComentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirComent;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
