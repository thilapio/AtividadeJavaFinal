
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public class formClientes extends javax.swing.JFrame {

    /**
     * Creates new form formClientes
     */
    public formClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeClienteTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailClienteTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneClienteTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enderecoClienteTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idClienteTF = new javax.swing.JTextField();
        inserirClienteBtn = new javax.swing.JButton();
        consultarClienteBtn = new javax.swing.JButton();
        atualizarClienteBtn = new javax.swing.JButton();
        excluirClienteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clientes");

        jLabel2.setText("Nome");

        jLabel3.setText("Email");

        jLabel4.setText("Telefone");

        jLabel5.setText("Endereço");

        jLabel6.setText("ID");

        inserirClienteBtn.setText("Inserir");
        inserirClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirClienteBtnActionPerformed(evt);
            }
        });

        consultarClienteBtn.setText("Consultar");
        consultarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClienteBtnActionPerformed(evt);
            }
        });

        atualizarClienteBtn.setText("Atualizar");
        atualizarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarClienteBtnActionPerformed(evt);
            }
        });

        excluirClienteBtn.setText("Excluir");
        excluirClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(nomeClienteTF)
                            .addComponent(jLabel3)
                            .addComponent(emailClienteTF)
                            .addComponent(jLabel4)
                            .addComponent(telefoneClienteTF)
                            .addComponent(jLabel5)
                            .addComponent(enderecoClienteTF, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(excluirClienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultarClienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarClienteBtn))
                    .addComponent(inserirClienteBtn))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(idClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarClienteBtn)
                    .addComponent(atualizarClienteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirClienteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoneClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inserirClienteBtn)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirClienteBtnActionPerformed
        // TODO add your handling code here:
        Clientes cliente = new Clientes();
        cliente.setNome(nomeClienteTF.getText());
        cliente.setEmail(emailClienteTF.getText());
        cliente.setTelefone(telefoneClienteTF.getText());
        cliente.setEndereco(enderecoClienteTF.getText());

        ClientesDAO clienteDAO = new ClientesDAO();
        clienteDAO.inserir(cliente);
        
        JOptionPane.showMessageDialog(this, "Cliente inserido com sucesso!");
        limparFormulario();
    }//GEN-LAST:event_inserirClienteBtnActionPerformed

    private void consultarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClienteBtnActionPerformed
        // TODO add your handling code here:
        if (idClienteTF.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe um ID para consultar.");
            return;
        }
        
        int id = Integer.parseInt(idClienteTF.getText());
        ClientesDAO clienteDAO = new ClientesDAO();
        Clientes cliente = clienteDAO.getCliente(id);

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
            limparFormulario();
        } else {
            nomeClienteTF.setText(cliente.getNome());
            emailClienteTF.setText(cliente.getEmail());
            telefoneClienteTF.setText(cliente.getTelefone());
            enderecoClienteTF.setText(cliente.getEndereco());
        }
    }//GEN-LAST:event_consultarClienteBtnActionPerformed

    private void atualizarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarClienteBtnActionPerformed
        // TODO add your handling code here:
        if (idClienteTF.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Consulte um cliente antes de atualizar.");
            return;
        }

        Clientes cliente = new Clientes();
        cliente.setIdCliente(Integer.parseInt(idClienteTF.getText()));
        cliente.setNome(nomeClienteTF.getText());
        cliente.setEmail(emailClienteTF.getText());
        cliente.setTelefone(telefoneClienteTF.getText());
        cliente.setEndereco(enderecoClienteTF.getText());

        ClientesDAO clienteDAO = new ClientesDAO();
        clienteDAO.editar(cliente);
        
        JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
        limparFormulario();
    }//GEN-LAST:event_atualizarClienteBtnActionPerformed

    private void excluirClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteBtnActionPerformed
        // TODO add your handling code here:
        if (idClienteTF.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Consulte um cliente antes de excluir.");
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este cliente?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(idClienteTF.getText());
            ClientesDAO clienteDAO = new ClientesDAO();
            clienteDAO.excluir(id);
            JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
            limparFormulario();
        }
    }//GEN-LAST:event_excluirClienteBtnActionPerformed

    private void limparFormulario() {
        idClienteTF.setText("");
        nomeClienteTF.setText("");
        emailClienteTF.setText("");
        telefoneClienteTF.setText("");
        enderecoClienteTF.setText("");
        nomeClienteTF.requestFocus(); // Move o cursor para o campo de nome
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarClienteBtn;
    private javax.swing.JButton consultarClienteBtn;
    private javax.swing.JTextField emailClienteTF;
    private javax.swing.JTextField enderecoClienteTF;
    private javax.swing.JButton excluirClienteBtn;
    private javax.swing.JTextField idClienteTF;
    private javax.swing.JButton inserirClienteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeClienteTF;
    private javax.swing.JTextField telefoneClienteTF;
    // End of variables declaration//GEN-END:variables
}
