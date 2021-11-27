/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI;

import com.mycompany.Business.PessoaBusiness;
import com.mycompany.Model.Projeto;
import com.mycompany.Business.ProjetoBusiness;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
/**
 *
 * @author Kelvin
 */
public class MenuPrincipalJFrame extends javax.swing.JFrame {

    private ProjetoBusiness _projetoBusiness;
    private PessoaBusiness _pessoaBusiness;
    
    private List<Projeto> _lstProjetos;
    /**
     * Creates new form MenuPrincipalJFrame
     */
    public MenuPrincipalJFrame(PessoaBusiness pessoaBusiness) {
        initComponents();
        _projetoBusiness = new ProjetoBusiness();
        _pessoaBusiness = pessoaBusiness;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProjeto = new javax.swing.JTable();
        txtFieldFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Gerenciador de Usuários");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerenciador de Projetos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Relatórios");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        tableProjeto.setAutoCreateRowSorter(true);
        tableProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Projeto", "Proprietário", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProjeto.setShowGrid(true);
        jScrollPane1.setViewportView(tableProjeto);

        txtFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFieldFiltroKeyReleased(evt);
            }
        });

        jLabel1.setText("Filtrar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRelatorio)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        _lstProjetos = _projetoBusiness.ListarEstado();
        
        carregarTabela(_lstProjetos);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProjetoJFrame menuProjetos = new ProjetoJFrame(_pessoaBusiness, this);
        menuProjetos.setLocationRelativeTo(this);
        menuProjetos.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UsuarioJFrame _usuario = new UsuarioJFrame(this);
        _usuario.setVisible(true);
        _usuario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFieldFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldFiltroKeyReleased
        // TODO add your handling code here:
        List<Projeto> lst = null;
        
        lst = _lstProjetos
                .stream()
                .filter(x -> 
                        x.getNomeProjeto().toLowerCase().contains(txtFieldFiltro.getText().toLowerCase())
                        || x.getUsuarioProprietario().toLowerCase().contains(txtFieldFiltro.getText().toLowerCase())
                        || x.getEstado().toLowerCase().contains(txtFieldFiltro.getText().toLowerCase())
                ).collect(Collectors.toList());
        
        carregarTabela(lst);
    }//GEN-LAST:event_txtFieldFiltroKeyReleased

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        ProjetoRelatorioJFrame projetoRelatorio = new ProjetoRelatorioJFrame(this);
        projetoRelatorio.setVisible(true);
        projetoRelatorio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    public void carregarTabela(List<Projeto> lst){
        DefaultTableModel model = (DefaultTableModel)tableProjeto.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[3];
        
        for (Projeto item : lst) {
            rowData[0] = item.getNomeProjeto();
            rowData[1] = item.getUsuarioProprietario();
            rowData[2] = item.getEstado();
            model.addRow(rowData);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProjeto;
    private javax.swing.JTextField txtFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
