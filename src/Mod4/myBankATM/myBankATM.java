package Mod4.myBankATM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Mod4.domain.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author habatoo
 */
public class myBankATM extends javax.swing.JFrame {

    Bank bank;
    Customer currentCustomer;
    Account currentAccount;

    /**
     * Creates new form myBankATM
     */
    public myBankATM() {
        bank = Bank.getBank();

        Customer firstCustomer = new Customer("John", "Doe");
        Customer secondCustomer = new Customer("Jane", "Doe");

        SavingAccount johnSavings = new SavingAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomers(firstCustomer);
        bank.addCustomers(secondCustomer);

        this.setLocationRelativeTo(null);
        this.setSize(900, 400);

        initComponents();

        for (Component c : jPanel3.getComponents()) {
            if ((c.getClass() == JButton.class) && (((JButton) c).getText() != "ENTER")) {
                JButton currentButton = (JButton) c;
                currentButton.addActionListener((ActionEvent e) -> {
                    addDigit(e);
                });
            }
        }

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
        balanceButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        amountField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyArea = new javax.swing.JTextArea();
        statusField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("my Bank ATM");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(801, 350));
        setSize(new java.awt.Dimension(800, 350));

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        balanceButton.setText("Check account balance");
        balanceButton.setEnabled(false);
        balanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceButtonActionPerformed(evt);
            }
        });
        jPanel2.add(balanceButton);

        depositButton.setText("Make a deposit");
        depositButton.setEnabled(false);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        jPanel2.add(depositButton);

        withdrawButton.setText("Make a withdrawal");
        withdrawButton.setEnabled(false);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });
        jPanel2.add(withdrawButton);

        amountField.setToolTipText("");
        jPanel2.add(amountField);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(4, 3));

        oneButton.setText("1");
        jPanel3.add(oneButton);

        twoButton.setText("2");
        jPanel3.add(twoButton);

        threeButton.setText("3");
        jPanel3.add(threeButton);

        fourButton.setText("4");
        jPanel3.add(fourButton);

        fiveButton.setText("5");
        jPanel3.add(fiveButton);

        sixButton.setText("6");
        jPanel3.add(sixButton);

        sevenButton.setText("7");
        jPanel3.add(sevenButton);

        eightButton.setText("8");
        jPanel3.add(eightButton);

        nineButton.setText("9");
        jPanel3.add(nineButton);

        zeroButton.setText("0");
        jPanel3.add(zeroButton);

        pointButton.setText(".");
        jPanel3.add(pointButton);

        enterButton.setText("ENTER");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        jPanel3.add(enterButton);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        historyArea.setEditable(false);
        historyArea.setColumns(20);
        historyArea.setRows(5);
        jScrollPane1.setViewportView(historyArea);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        statusField.setEditable(false);
        statusField.setText("Welcome to my Bank! Enter the client ID and press ENTER...");
        getContentPane().add(statusField, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
        int customerID = 0;
        try {
            customerID = Integer.parseInt(amountField.getText());
            currentCustomer = bank.getCustomers(customerID);
            currentAccount = currentCustomer.getAccounts(0);
            historyArea.append("Customer with ID = " + customerID + " is " + currentCustomer.getLastName() + ", " + currentCustomer.getFirstName() + "\n");
            balanceButton.setEnabled(true);
            depositButton.setEnabled(true);
            withdrawButton.setEnabled(true);
            enterButton.setEnabled(false);
        } catch (Exception ex) {
            historyArea.append("ERROR: Customer not found or wrong Customer ID!\n");
        }

        amountField.setText("");
        statusField.setText("Customer: "+currentCustomer.getLastName() + ", " + currentCustomer.getFirstName());
    }//GEN-LAST:event_enterButtonActionPerformed

    private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceButtonActionPerformed
        // TODO add your handling code here:

        historyArea.append("Balance of " + currentCustomer.getFirstName() + "'s first account is $" + currentAccount.getBalance());
        if (currentAccount instanceof CheckingAccount) {
            historyArea.append(". This is a Checking Account with overdraft protection $" + ((CheckingAccount) currentAccount).getOverdraftAmount() + "\n");
        } else {
            historyArea.append(". This is a Savings Account with interest rate " + ((SavingAccount) currentAccount).getInterestRate() + "%\n");
        }
        statusField.setText("READY");
    }//GEN-LAST:event_balanceButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        // TODO add your handling code here:
        try {
            double amt = Double.parseDouble(amountField.getText());
            currentAccount.deposit(amt);
            historyArea.append("Deposit: $" + amt + ", new balance is $" + currentAccount.getBalance() + "\n");
            statusField.setText("READY");

        } catch (Exception e) {
            historyArea.append("ERROR: can't complete deposit oiperation!\n");
            statusField.setText("ERROR");
        }
        amountField.setText("");

    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
        try {
            double amt = Double.parseDouble(amountField.getText());
            if (currentAccount.withdraw(amt)) {
                historyArea.append("Deposit: $" + amt + ", new balance is $" + currentAccount.getBalance() + "\n");
                statusField.setText("READY");
            }

        } catch (OverdraftException ex) {
            historyArea.append("ERROR: Insufficient funds!\n");
        } catch (Exception e) {
            historyArea.append("ERROR: can't complete deposit oiperation!\n");
            statusField.setText("ERROR");
        }
        amountField.setText("");

    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void addDigit(ActionEvent evt) {
        // TODO add your handling code here:
        amountField.setText(amountField.getText() + ((JButton) evt.getSource()).getText());
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
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myBankATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton balanceButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JTextArea historyArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JTextField statusField;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}