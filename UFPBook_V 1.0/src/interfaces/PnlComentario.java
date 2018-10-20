package interfaces;

import java.io.Serializable;
import ufpbook.*;

public class PnlComentario extends javax.swing.JPanel implements Serializable {
    
    private Usuario logado;
    private Postagem post;
    private Comentario coment;
    private PnlPost pnlpost;
    
    public PnlComentario(Usuario user, Postagem post, Comentario coment, PnlPost pnlpost) {
        initComponents();
        
        this.coment = coment;
        this.logado = user;
        this.post = post;
        this.pnlpost = pnlpost;
        
        lblAutor.setText(coment.getAutor().getNome());
        txtComentario.setText(coment.getTexto());
        txtComentComent.setVisible(true);
        scrollComents.setVisible(false);
        
        if(user.equals(coment.getAutor()) || pnlpost.getTelaPai().getAdmins().contains(user)) {
            btnExcluirComent.setVisible(true);
        } else {
            btnExcluirComent.setVisible(false);
        }
        
        loadComentComents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAutor = new javax.swing.JLabel();
        scrollComents = new javax.swing.JScrollPane();
        pnlComents = new javax.swing.JPanel();
        txtComentComent = new javax.swing.JTextField();
        txtComentario = new javax.swing.JTextField();
        btnComentarios = new javax.swing.JButton();
        btnComent = new javax.swing.JButton();
        btnExcluirComent = new javax.swing.JButton();

        lblAutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAutor.setText("Autor");

        pnlComents.setLayout(new javax.swing.BoxLayout(pnlComents, javax.swing.BoxLayout.Y_AXIS));
        scrollComents.setViewportView(pnlComents);

        txtComentComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComentComentActionPerformed(evt);
            }
        });

        txtComentario.setEditable(false);

        btnComentarios.setText("Comentários");
        btnComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentariosActionPerformed(evt);
            }
        });

        btnComent.setText("Comentar");
        btnComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentActionPerformed(evt);
            }
        });

        btnExcluirComent.setText("Deletar Comentário");
        btnExcluirComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirComentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComentComent)
                    .addComponent(txtComentario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirComent))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnComentarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(btnComent))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(scrollComents)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAutor)
                    .addComponent(btnExcluirComent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComentarios)
                    .addComponent(btnComent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComentComent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollComents, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentariosActionPerformed
        boolean visivel = scrollComents.isVisible();
        scrollComents.setVisible(!visivel);
        revalidate();
    }//GEN-LAST:event_btnComentariosActionPerformed

    private void txtComentComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentComentActionPerformed
        btnComent.doClick();
    }//GEN-LAST:event_txtComentComentActionPerformed

    private void btnComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentActionPerformed
        if(!txtComentComent.getText().equals("")) {
            Comentario comentario = new Comentario(logado, txtComentComent.getText());
            coment.addComentario(comentario);
            pnlComents.add(new PnlComentComent(logado, coment, comentario, this));
        }
        scrollComents.setVisible(true);
        revalidate();
    }//GEN-LAST:event_btnComentActionPerformed

    private void btnExcluirComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirComentActionPerformed
        post.getComentarios().remove(coment);
        pnlpost.loadComentarios();
    }//GEN-LAST:event_btnExcluirComentActionPerformed

    public void loadComentComents() {   
        pnlComents.removeAll();
        for(Comentario comentario : coment.getComentarios()) {
            pnlComents.add(new PnlComentComent(logado,coment, comentario, this));
        }
        pnlComents.revalidate();
    }
    
    public Mural getTelaPai() {
        return pnlpost.getTelaPai();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComent;
    private javax.swing.JButton btnComentarios;
    private javax.swing.JButton btnExcluirComent;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JPanel pnlComents;
    private javax.swing.JScrollPane scrollComents;
    private javax.swing.JTextField txtComentComent;
    private javax.swing.JTextField txtComentario;
    // End of variables declaration//GEN-END:variables
}
