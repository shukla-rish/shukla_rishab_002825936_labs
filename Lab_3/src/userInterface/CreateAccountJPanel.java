/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import business.Account;
import business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    /**
     * Creates new form CreateAccountJPanel
     */

    CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeadder = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 600));

        lblHeadder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHeadder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeadder.setText("Create Account");

        lblRoutingNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRoutingNumber.setText("Routing Number:");

        lblAccountNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAccountNumber.setText("Account Number:");

        lblBankName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankName.setText("Bank Name:");

        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBalance.setText("Balance:");

        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeadder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountNumber)
                    .addComponent(lblBankName)
                    .addComponent(lblBalance))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAccountNumber, lblBalance, lblBankName, lblRoutingNumber});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAccountNumber, txtBalance, txtBankName, txtRoutingNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHeadder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnCreate)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccountNumber, lblBalance, lblBankName, lblRoutingNumber});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAccountNumber, txtBalance, txtBankName, txtRoutingNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        String balanceText = txtBalance.getText();

        if (!routingNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Routing Number should contain only numbers.");
            return;
        }

        if (!accountNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Account Number should contain only numbers.");
            return; 
        }

        if (!bankName.matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(null, "Bank Name should contain only alphabets.");
            return; 
        }

        int balance;
        try {
            balance = Integer.parseInt(balanceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Balance should be a number.");
            return; 
        }

        Account account = accountDirectory.addAccount();
        account.setRoutingNumber(routingNumber);
        account.setAccountNumber(accountNumber);
        account.setBankName(bankName);
        account.setBalance(balance);

        JOptionPane.showMessageDialog(null, "Account Created successfully!");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHeadder;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables
}
