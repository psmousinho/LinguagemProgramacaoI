package interfaces;

import javax.swing.JPanel;
import ufpbook.*;


public class SubTelaSolicitacoes extends javax.swing.JPanel {

    private TelaUsuario telaUsuario;
    
    public SubTelaSolicitacoes(TelaUsuario telaUsuario) {
        initComponents();
        
        this.telaUsuario = telaUsuario;
        
        estadoInicial();
    }   

    public JPanel getConteudo() {
        return pnlConteudo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlConteudo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();

        pnlConteudo.setLayout(new java.awt.GridLayout(0, 2));
        jScrollPane1.setViewportView(pnlConteudo);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Suas solicitações:");

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNumero.setText("Numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumero)
                        .addGap(0, 386, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void estadoInicial() {
        for(Usuario amigo : telaUsuario.getUser().getSolicitacoes()) {
            if(amigo == null) {
                continue;
            }
            pnlConteudo.add(new PnlAmigo(telaUsuario.getUser(), pnlConteudo, amigo, 2));
        }
        lblNumero.setText("" + pnlConteudo.getComponentCount());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    // End of variables declaration//GEN-END:variables
}
