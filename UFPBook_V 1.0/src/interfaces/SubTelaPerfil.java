
package interfaces;

import ufpbook.*;

public class SubTelaPerfil extends javax.swing.JPanel {

    private Usuario user;
    private RedeSocial redesocial;
    
    public SubTelaPerfil(RedeSocial redesocial, Usuario user) {
        initComponents();
        
        this.redesocial = redesocial;
        this.user = user;
        
        txtNome.setText(user.getNome());
        txtBio.setText(user.getDescricao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPerfil = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblBio = new javax.swing.JLabel();
        JScrolPane = new javax.swing.JScrollPane();
        txtBio = new javax.swing.JTextArea();
        btnEditar = new javax.swing.JToggleButton();
        lblErro = new javax.swing.JLabel();

        lblPerfil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPerfil.setText("Seu Perfil:");

        lblNome.setText("Nome:");

        txtNome.setEditable(false);

        lblBio.setText("Biografia:");

        txtBio.setEditable(false);
        txtBio.setColumns(20);
        txtBio.setRows(5);
        JScrolPane.setViewportView(txtBio);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblPerfil)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBio)
                            .addComponent(txtNome)
                            .addComponent(JScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErro)
                    .addComponent(btnEditar))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerfil)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(btnEditar.isSelected()) {
            txtNome.setEditable(true);
            txtBio.setEditable(true);
        } else {
            if((txtNome.getText() == null || redesocial.getUsuarios().keySet().contains(txtNome.getText()))
                && !user.getNome().equals(txtNome.getText())){
                lblErro.setText("Nome Invalido");
                btnEditar.doClick();
            }   
            else{
                if(lblErro.getText() != null){
                    lblErro.setText(null);
                }
                txtNome.setEditable(false);
                redesocial.getUsuarios().remove(user.getNome());
                user.setNome(txtNome.getText());
                redesocial.getUsuarios().put(user.getNome(),user);
            }
            
            if(txtBio.getText() == null){
                txtBio.setText("Nada a Declarar");
            }
            
            txtBio.setEditable(false);
            user.setDescricao(txtBio.getText());
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrolPane;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JLabel lblBio;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JTextArea txtBio;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
