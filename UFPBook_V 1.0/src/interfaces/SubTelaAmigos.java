package interfaces;

import ufpbook.*;

public class SubTelaAmigos extends javax.swing.JPanel {

    private RedeSocial redesocial;
    private TelaUsuario telausuario;
    
    public SubTelaAmigos(RedeSocial redesocial,TelaUsuario telausuario) {
        initComponents();
        
        this.redesocial = redesocial;
        this.telausuario = telausuario;
        
        // Carrega todos os amigos do usuário.
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

        frameBloqueados = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlBloqueados = new javax.swing.JPanel();
        lblBloqueados = new javax.swing.JLabel();
        pnlAmigos = new javax.swing.JPanel();
        lblAmigos = new javax.swing.JLabel();
        txtProcurarA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlConteudoA = new javax.swing.JPanel();
        pnlProcurar = new javax.swing.JPanel();
        lblProcurar = new javax.swing.JLabel();
        txtProcurarP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlConteudoP = new javax.swing.JPanel();
        btnBloqueados = new javax.swing.JButton();

        frameBloqueados.setResizable(false);

        pnlBloqueados.setLayout(new javax.swing.BoxLayout(pnlBloqueados, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(pnlBloqueados);

        lblBloqueados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout frameBloqueadosLayout = new javax.swing.GroupLayout(frameBloqueados.getContentPane());
        frameBloqueados.getContentPane().setLayout(frameBloqueadosLayout);
        frameBloqueadosLayout.setHorizontalGroup(
            frameBloqueadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(frameBloqueadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBloqueados)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        frameBloqueadosLayout.setVerticalGroup(
            frameBloqueadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameBloqueadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBloqueados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblAmigos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAmigos.setText("Seus Amigos:");

        txtProcurarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcurarAActionPerformed(evt);
            }
        });

        pnlConteudoA.setLayout(new javax.swing.BoxLayout(pnlConteudoA, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlConteudoA);

        javax.swing.GroupLayout pnlAmigosLayout = new javax.swing.GroupLayout(pnlAmigos);
        pnlAmigos.setLayout(pnlAmigosLayout);
        pnlAmigosLayout.setHorizontalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlAmigosLayout.createSequentialGroup()
                        .addGroup(pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtProcurarA))
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAmigosLayout.setVerticalGroup(
            pnlAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAmigos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProcurarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        lblProcurar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProcurar.setText("Procure Novos Amigos:");

        txtProcurarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcurarPActionPerformed(evt);
            }
        });

        pnlConteudoP.setLayout(new javax.swing.BoxLayout(pnlConteudoP, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(pnlConteudoP);

        javax.swing.GroupLayout pnlProcurarLayout = new javax.swing.GroupLayout(pnlProcurar);
        pnlProcurar.setLayout(pnlProcurarLayout);
        pnlProcurarLayout.setHorizontalGroup(
            pnlProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcurarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProcurarLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(pnlProcurarLayout.createSequentialGroup()
                        .addGroup(pnlProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProcurar)
                            .addComponent(txtProcurarP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE))))
        );
        pnlProcurarLayout.setVerticalGroup(
            pnlProcurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcurarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProcurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProcurarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBloqueados.setText("Pessoas Bloqueadas");
        btnBloqueados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloqueadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBloqueados))
                    .addComponent(pnlProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBloqueados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(pnlProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProcurarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcurarAActionPerformed
        pnlConteudoA.removeAll();
        for(Usuario amigo : telausuario.getUser().getPessoas()) {
           if(amigo.getPessoas().contains(telausuario.getUser()) && amigo.getNome().startsWith(txtProcurarA.getText())) {
                pnlConteudoA.add(new PnlAmigo(telausuario, pnlConteudoA, telausuario.getUser(),amigo, 0));
            }
        }
        pnlConteudoA.revalidate();
    }//GEN-LAST:event_txtProcurarAActionPerformed

    private void txtProcurarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcurarPActionPerformed
        pnlConteudoP.removeAll();
        for(String nome  : redesocial.getUsuarios().keySet()) {
            Usuario user = redesocial.getUsuarios().get(nome);
            if(!user.getBloqueados().contains(telausuario.getUser()) &&
                    !user.equals(telausuario.getUser()) &&
                    nome.startsWith(txtProcurarP.getText()) &&
                    !telausuario.getUser().getPessoas().contains(user)) {
                pnlConteudoP.add(new PnlAmigo(telausuario, pnlConteudoP, telausuario.getUser(), user, 1));
            }
        }
        pnlConteudoP.revalidate();
    }//GEN-LAST:event_txtProcurarPActionPerformed

    private void btnBloqueadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloqueadosActionPerformed
        pnlBloqueados.removeAll();
        int count = 0;
        for(Usuario usuario : telausuario.getUser().getBloqueados()) {
           pnlBloqueados.add(new PnlAmigo(telausuario.getUser(), pnlBloqueados, usuario, 3));
           count++;
        }
        lblBloqueados.setText("Pessoas bloqueadas: " + count);
        frameBloqueados.setSize(300, 500);
        frameBloqueados.setLocationRelativeTo(null);
        frameBloqueados.setVisible(true);    
    }//GEN-LAST:event_btnBloqueadosActionPerformed

    public void estadoInicial(){
        pnlConteudoA.removeAll();
        pnlConteudoP.removeAll();
        for(Usuario amigo : telausuario.getUser().getPessoas()) {
            if(amigo.getPessoas().contains(telausuario.getUser())) {
                pnlConteudoA.add(new PnlAmigo(telausuario, pnlConteudoA, telausuario.getUser(), amigo, 0));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBloqueados;
    private javax.swing.JFrame frameBloqueados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblBloqueados;
    private javax.swing.JLabel lblProcurar;
    private javax.swing.JPanel pnlAmigos;
    private javax.swing.JPanel pnlBloqueados;
    private javax.swing.JPanel pnlConteudoA;
    private javax.swing.JPanel pnlConteudoP;
    private javax.swing.JPanel pnlProcurar;
    private javax.swing.JTextField txtProcurarA;
    private javax.swing.JTextField txtProcurarP;
    // End of variables declaration//GEN-END:variables
}