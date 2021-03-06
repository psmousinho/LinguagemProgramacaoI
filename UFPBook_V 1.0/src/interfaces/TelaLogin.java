package interfaces;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import javax.swing.ImageIcon;
import ufpbook.*;

public class TelaLogin extends javax.swing.JPanel {

   private RedeSocial redesocial;
    
    public TelaLogin(RedeSocial redesocial) {
        initComponents();
        
        this.redesocial = redesocial;
        
        // Localiza o ícone de pessoa, redimensiona e adiciona na tela.
        File arqImg = new File("brasao.png");
        ImageIcon icon = new ImageIcon(arqImg.getPath());
        icon.setImage(icon.getImage().getScaledInstance(280, 350, Image.SCALE_SMOOTH));
        lblImagem.setIcon(icon); 
    }
                

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblUfpbook = new javax.swing.JLabel();
        txtNomeL = new javax.swing.JTextField();
        txtSenhaL = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblNomeL = new javax.swing.JLabel();
        lblSenhaL = new javax.swing.JLabel();
        lblErroL = new javax.swing.JLabel();
        pnlRegistro = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        lblIncreva = new javax.swing.JLabel();
        lblNomeR = new javax.swing.JLabel();
        txtNomeR = new javax.swing.JTextField();
        lblSenhaR1 = new javax.swing.JLabel();
        lblSenhaR2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblErroR = new javax.swing.JLabel();
        txtSenhaR1 = new javax.swing.JPasswordField();
        txtSenhaR2 = new javax.swing.JPasswordField();

        lblUfpbook.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblUfpbook.setText("Ufpbook");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblNomeL.setText("Nome:");

        lblSenhaL.setText("Senha:");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblUfpbook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblSenhaL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErroL)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(txtSenhaL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblErroL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin)
                            .addComponent(lblNomeL)
                            .addComponent(lblSenhaL)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUfpbook)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblIncreva.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblIncreva.setText("Inscreva-se:");

        lblNomeR.setText("Nome");

        lblSenhaR1.setText("Senha");

        lblSenhaR2.setText("Confirmar Senha");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncreva)
                            .addComponent(lblNomeR)
                            .addComponent(lblSenhaR1)
                            .addComponent(txtNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenhaR2)
                            .addComponent(lblErroR)
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSenhaR2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtSenhaR1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblIncreva)
                .addGap(50, 50, 50)
                .addComponent(lblNomeR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenhaR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenhaR2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErroR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       Usuario user = redesocial.login(txtNomeL.getText(), txtSenhaL.getPassword());
        if(user != null){
            TelaPrincipal.PainelPrincipal.add("usuario", new TelaUsuario(redesocial, user));
            CardLayout layout = (CardLayout)TelaPrincipal.PainelPrincipal.getLayout();
            layout.show(TelaPrincipal.PainelPrincipal, "usuario");
            
            limparTela();
        }
        else {
            lblErroL.setText("Erro ao logar!");
        }   
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(Arrays.equals(txtSenhaR1.getPassword(), txtSenhaR2.getPassword())) {
            if(txtNomeR.getText() != null) {
                if(redesocial.registro(txtNomeR.getText(), txtSenhaR1.getPassword())) {
                    Usuario user = redesocial.login(txtNomeR.getText(), txtSenhaR1.getPassword());
                    
                    TelaPrincipal.PainelPrincipal.add("usuario", new TelaUsuario(redesocial, user));
                    CardLayout layout = (CardLayout)TelaPrincipal.PainelPrincipal.getLayout();
                    layout.show(TelaPrincipal.PainelPrincipal, "usuario");
                    
                    limparTela();
                } else {
                    lblErroR.setText("Nome inválido.");
                }
            } else {
                lblErroR.setText("Digite um nome.");
            }
        } else {
            lblErroR.setText("As senhas não são iguais!");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
       
    private void limparTela(){
    lblErroL.setText(null);
    lblErroR.setText(null);
    txtNomeR.setText(null);
    txtSenhaL.setText(null);
    txtSenhaR1.setText(null);
    txtSenhaR2.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblErroL;
    private javax.swing.JLabel lblErroR;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblIncreva;
    private javax.swing.JLabel lblNomeL;
    private javax.swing.JLabel lblNomeR;
    private javax.swing.JLabel lblSenhaL;
    private javax.swing.JLabel lblSenhaR1;
    private javax.swing.JLabel lblSenhaR2;
    private javax.swing.JLabel lblUfpbook;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTextField txtNomeL;
    private javax.swing.JTextField txtNomeR;
    private javax.swing.JPasswordField txtSenhaL;
    private javax.swing.JPasswordField txtSenhaR1;
    private javax.swing.JPasswordField txtSenhaR2;
    // End of variables declaration//GEN-END:variables
}
