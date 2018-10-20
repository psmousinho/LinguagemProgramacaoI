package interfaces;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import ufpbook.Grupo;
import ufpbook.Usuario;

public class PnlGrupo extends javax.swing.JPanel {

    private TelaUsuario telausuario;
    private Grupo grupo;
    private boolean bool;
    private SubTelaGrupos subTela;
    
    public PnlGrupo(TelaUsuario telausuario,SubTelaGrupos subTela, Grupo grupo, boolean bool) {
        initComponents();
        
        this.telausuario = telausuario;
        this.grupo = grupo;
        this.bool = bool;
        this.subTela = subTela;
        
        lblNome.setText("Nome: " + grupo.getNome());
        lblMembros.setText("Membros: " + grupo.getPessoas().size());
        
        if(bool) {
            btnEsquerda.setText("Sair do grupo");
        } 
        else if(grupo.getSolicitacoes().contains(telausuario.getUser())) {
            btnEsquerda.setText("Solicitação enviada");
            btnEsquerda.setEnabled(false);
            btnDireita.setVisible(false);
        } 
        else {
            btnEsquerda.setText("Entrar no grupo");
            btnDireita.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDireita = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblMembros = new javax.swing.JLabel();

        btnDireita.setText("Página do Grupo");
        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });

        btnEsquerda.setText("Sair do Grupo");
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblMembros.setText("Membros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblMembros))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEsquerda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMembros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDireita)
                    .addComponent(btnEsquerda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaActionPerformed
        telausuario.getPnlConteudo().add("Grupo",new SubTelaMural(telausuario,grupo));   
        CardLayout layout = (CardLayout) telausuario.getPnlConteudo().getLayout();
        layout.show(telausuario.getPnlConteudo(), "Grupo");
    }//GEN-LAST:event_btnDireitaActionPerformed

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaActionPerformed
            if(bool){
                int i = JOptionPane.showConfirmDialog(null ,"Tem certeza que deseja sair?", "Saída",JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    grupo.removePessoa(telausuario.getUser());
                    subTela.estadoInicial();
                    subTela.revalidate();
                } 
            } else {
                grupo.addSolicitacao(telausuario.getUser());
                btnEsquerda.setText("Solicitação enviada");
                btnEsquerda.setEnabled(false);
                
            }
    }//GEN-LAST:event_btnEsquerdaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JLabel lblMembros;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
