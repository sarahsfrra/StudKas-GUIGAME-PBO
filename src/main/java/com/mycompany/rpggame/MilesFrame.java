/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rpggame;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author sarah
 */
public class MilesFrame extends javax.swing.JFrame {

    private Character player;
    private Character npc;
    private Character enemy;
   
    /**
     * Creates new form MILES
     */
    public MilesFrame() {
        player = new Hero("Liz",1,100);
        npc = new Hero("Selma", 1, 100);
        enemy = new Enemy("Sarah",1,100);
        
        player.setWeapon(new Weapon());
        npc.setWeapon(new Weapon());
        enemy.setWeapon(new Weapon());
        
        initComponents();
       
        labelPlayerName.setForeground(Color.WHITE);
        labelPlayerName.setText(player.getName());
        
      
        labelNpcName.setForeground(Color.WHITE);
        labelNpcName.setText(npc.getName());
        
        
        labelEnemyName.setForeground(Color.WHITE);
        labelEnemyName.setText(enemy.getName());
        
        labelPlayerHp.setForeground(Color.WHITE);
        labelPlayerHp.setText("HP : " + player.getHp());
      
        labelStatus1.setForeground(Color.WHITE);
        labelStatus2.setForeground(Color.WHITE);
        
    
        
        buttonAttack.setBackground(Color.BLACK);
        buttonAttack.setForeground(Color.WHITE);
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
        labelPlayerName = new javax.swing.JLabel();
        labelNpcName = new javax.swing.JLabel();
        labelEnemyName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelPlayerHp = new javax.swing.JLabel();
        labelNpcHp = new javax.swing.JLabel();
        labelEnemyHp = new javax.swing.JLabel();
        buttonAttack = new javax.swing.JButton();
        labelStatus1 = new javax.swing.JLabel();
        labelStatus2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPlayerName.setText("Hero1");

        labelNpcName.setText("Hero2");

        labelEnemyName.setText("Enemy");

        labelPlayerHp.setText("jLabel2");

        labelNpcHp.setText("jLabel2");

        labelEnemyHp.setText("jLabel2");

        buttonAttack.setText("ATTACK");
        buttonAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAttackActionPerformed(evt);
            }
        });

        labelStatus1.setText("                                                           -");

        labelStatus2.setText("                                                           -");

        jLabel4.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlayerName)
                            .addComponent(labelPlayerHp))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNpcName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(labelEnemyName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNpcHp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEnemyHp)))
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonAttack)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)))
                            .addGap(162, 162, 162))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(labelStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayerName)
                    .addComponent(labelNpcName)
                    .addComponent(labelEnemyName))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayerHp)
                    .addComponent(labelNpcHp)
                    .addComponent(labelEnemyHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(buttonAttack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStatus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAttackActionPerformed
        // TODO add your handling code here:
        player.attack(npc);
        npc.attack(enemy);
        enemy.attack(player);
        
        String status1 = Character.getReport(player, npc, "menyerang");
        String status2 = Character.getReport(npc,enemy,"menyerang");
        
        labelStatus1.setText(status1);
        labelStatus2.setText(status2);
      
    }//GEN-LAST:event_buttonAttackActionPerformed

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
            java.util.logging.Logger.getLogger(MilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MilesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MilesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAttack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEnemyHp;
    private javax.swing.JLabel labelEnemyName;
    private javax.swing.JLabel labelNpcHp;
    private javax.swing.JLabel labelNpcName;
    private javax.swing.JLabel labelPlayerHp;
    private javax.swing.JLabel labelPlayerName;
    private javax.swing.JLabel labelStatus1;
    private javax.swing.JLabel labelStatus2;
    // End of variables declaration//GEN-END:variables
}