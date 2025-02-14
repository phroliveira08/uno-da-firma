/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI;

import com.mycompany.Business.PessoaBusiness;
import com.mycompany.Model.Pessoa;
//import com.mycompany.DataAccess.PessoaDataAccess;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Henrique
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    private UsuarioJFrame _usuario;
    private String _finalidadeTela;
    private Pessoa _pessoa;
    private PessoaBusiness _pessoaBusiness;

    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarUsuario(UsuarioJFrame usuario) {
        initComponents();
        this._usuario = usuario;
        _pessoa = new Pessoa();
        _finalidadeTela = "Cadastrar";
    }

    public CadastrarUsuario(String finalidadeTela, Pessoa pessoa) {
        initComponents();
        _pessoaBusiness = new PessoaBusiness();
        this._finalidadeTela = finalidadeTela;
        this._pessoa = pessoa;
    }

    public CadastrarUsuario(String finalidadeTela) {
        initComponents();
        _pessoaBusiness = new PessoaBusiness();
        this._finalidadeTela = finalidadeTela;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro de Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Telefone:");

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail:");

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cargo:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Username:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Senha:");

        jTextField1.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome Completo:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Validar Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(limpar)
                        .addGap(18, 18, 18)
                        .addComponent(Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(voltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(Salvar)
                    .addComponent(limpar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        if (_finalidadeTela.equals("Atualizar")) {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        } else {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
        }
    }//GEN-LAST:event_limparActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        //setVisible(false);
        _usuario.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        Pessoa pessoa = new Pessoa();
        String nome, telefone, email, cargo, username, senha, validarSenha;
        boolean validacao;
        if (_finalidadeTela.equals("Atualizar")) {
            pessoa.setNomeCompleto(jTextField1.getText());
            pessoa.setTelefone(jTextField2.getText());
            pessoa.setEmail(jTextField3.getText());
            pessoa.setCargo(jTextField4.getText());
            username = _pessoa.getUsername();
            pessoa.setUsername(username);
            //System.out.println(username);
            _pessoaBusiness.AtualizarPessoa(pessoa);
            JOptionPane.showMessageDialog(null, "Usuario Alterado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            nome = jTextField1.getText();
            telefone = jTextField2.getText();
            email = jTextField3.getText();
            cargo = jTextField4.getText();
            username = jTextField5.getText();
            senha = jPasswordField1.getText();
            validarSenha = jPasswordField2.getText();
            if (username.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os Campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os Campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else if (telefone.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os Campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os Campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else if (senha.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os Campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else if (validarSenha.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os Campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else if (senha.equals(validarSenha)) {
                _pessoaBusiness = new PessoaBusiness();
                validacao = _pessoaBusiness.cadastrarPessoa(nome, username, email, senha, telefone, cargo);
                if (validacao == false) {
                    JOptionPane.showMessageDialog(null, "Este usuario já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario Cadastrado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senhas incompativeis, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (_finalidadeTela.equals("Atualizar")) {
            Salvar.setText("Atualizar");
            this.setTitle("Atualizar Usuario");
            jLabel3.setText("Atualizar Usuario");
            String nome = _pessoa.getNomeCompleto();
            String telefone = _pessoa.getTelefone();
            String email = _pessoa.getEmail();
            String cargo = _pessoa.getCargo();
            String username = _pessoa.getUsername();
            String senha = _pessoa.getSenha();
            jTextField1.setText(nome);
            jTextField2.setText(telefone);
            jTextField3.setText(email);
            jTextField4.setText(cargo);
            jTextField5.setEnabled(false);
            jTextField5.setText(username);
            jPasswordField1.setEnabled(false);
            jPasswordField1.setText(senha);
            jPasswordField2.setEnabled(false);
            jPasswordField2.setText(senha);
        } else{
            this.setTitle("Cadastrar Usuario");
        }
    }//GEN-LAST:event_formWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton limpar;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
