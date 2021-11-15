/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI;

import com.mycompany.Business.PessoaBusiness;
import com.mycompany.Business.ProjetoBusiness;
import com.mycompany.Model.Pessoa;
import com.mycompany.Model.Projeto;

/**
 *
 * @author Familia
 */
public class CadastrarProjetoJFrame extends javax.swing.JFrame {

    private PessoaBusiness _pessoaBusiness;
    private ProjetoBusiness _projetoBusiness;
    /**
     * Creates new form CadastrarProjetoJFrame
     */
    public CadastrarProjetoJFrame(PessoaBusiness pessoaBusiness) {
        initComponents();
        _pessoaBusiness = pessoaBusiness;
        _projetoBusiness = new ProjetoBusiness();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmarjButton = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        descricaojLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaojTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmarjButton.setText("Cadastrar");
        confirmarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarjButtonActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        nomejLabel.setText("Nome:");

        descricaojLabel.setText("Descrição:");

        descricaojTextArea.setColumns(20);
        descricaojTextArea.setRows(5);
        jScrollPane1.setViewportView(descricaojTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(cancelarjButton)
                        .addGap(41, 41, 41)
                        .addComponent(confirmarjButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomejLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descricaojLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaojLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarjButton)
                    .addComponent(confirmarjButton))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarjButtonActionPerformed
        // TODO add your handling code here:
        Projeto novoProjeto = new Projeto();
        String nome = nomejTextField.getText();
        String descricao = descricaojTextArea.getText();
        Pessoa pessoa = _pessoaBusiness.getPessoaLogada();
        String username = pessoa.getUsername();
        novoProjeto.setNomeProjeto(nome);
        novoProjeto.setDescricao(descricao);
        novoProjeto.setUsuarioProprietario(username);
        _projetoBusiness.Adicionar(novoProjeto);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_confirmarjButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JButton confirmarjButton;
    private javax.swing.JLabel descricaojLabel;
    private javax.swing.JTextArea descricaojTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    // End of variables declaration//GEN-END:variables
}
