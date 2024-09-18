/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ladalogikai;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author LajkóGergő(SZF_2023_
 */
public class LogikaiGui extends javax.swing.JFrame {
    String tipp;
    Random rn = new Random();
    String szoveg;
    String tippSzoveg;
    String kincs;
    public LogikaiGui() {
        initComponents();
        tipp = " ";
        szoveg = " ";
        tippSzoveg = " ";
        kincs = kincs();
    }
    
    
    private String kincs(){
        int tipp = rn.nextInt(1,4);
        if(tipp == 1){
            return "Ezüst";
        }else if(tipp == 2){
            return "Arany";
        }else if(tipp == 3){
            return "Bronz";
        }
        return " ";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FeliartLbl = new javax.swing.JLabel();
        AranKepLbl = new javax.swing.JLabel();
        EzsutKepLbl = new javax.swing.JLabel();
        BronzKepLbl1 = new javax.swing.JLabel();
        EzustLbl = new javax.swing.JLabel();
        AranyLbl1 = new javax.swing.JLabel();
        BronzLbl = new javax.swing.JLabel();
        EzustBtn = new javax.swing.JButton();
        AranyBtn = new javax.swing.JButton();
        BronzBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LeirasLbl1 = new javax.swing.JLabel();
        LeirasLbl3 = new javax.swing.JLabel();
        LeirasLbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FeliartLbl.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        FeliartLbl.setText("Kincsesláda");

        AranKepLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/arany.jpg"))); // NOI18N

        EzsutKepLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/ezust.jpg"))); // NOI18N

        BronzKepLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/bronz.jpg"))); // NOI18N

        EzustLbl.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        EzustLbl.setText("Nem én rejtem a kincset");

        AranyLbl1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        AranyLbl1.setText("Én rejtem a kincset");

        BronzLbl.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BronzLbl.setText("Az arany láda hazudik");

        EzustBtn.setBackground(new java.awt.Color(102, 102, 102));
        EzustBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EzustBtn.setForeground(new java.awt.Color(255, 255, 255));
        EzustBtn.setText("Ezüst láda");
        EzustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EzustBtnActionPerformed(evt);
            }
        });

        AranyBtn.setBackground(new java.awt.Color(204, 153, 0));
        AranyBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AranyBtn.setForeground(new java.awt.Color(255, 255, 255));
        AranyBtn.setText("Arany láda");
        AranyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AranyBtnActionPerformed(evt);
            }
        });

        BronzBtn.setBackground(new java.awt.Color(255, 102, 0));
        BronzBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BronzBtn.setForeground(new java.awt.Color(255, 255, 255));
        BronzBtn.setText("Bronz láda");
        BronzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BronzBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Mutasd hol van");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        LeirasLbl1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        LeirasLbl1.setText("A három láda közül egyik rejti a kincset, ");

        LeirasLbl3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        LeirasLbl3.setText("Tippeld meg melyik mond igazat.");

        LeirasLbl2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        LeirasLbl2.setText("de közölük az egyik hazudik.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LeirasLbl3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LeirasLbl1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LeirasLbl2)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(LeirasLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeirasLbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeirasLbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(EzustLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BronzLbl)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(AranKepLbl)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BronzKepLbl1)
                                        .addGap(51, 51, 51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(AranyBtn)
                                        .addGap(61, 61, 61))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(AranyLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(EzustBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EzsutKepLbl)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BronzBtn)
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(FeliartLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(75, 75, 75)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EzsutKepLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(FeliartLbl)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AranKepLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BronzKepLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AranyLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AranyBtn)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EzustLbl)
                    .addComponent(BronzLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EzustBtn)
                    .addComponent(BronzBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nyertE();
        tippSzoveg = "Tipped: " +tipp+ ". A kincs: " + kincs;
        JOptionPane.showMessageDialog(rootPane, szoveg + "\n" + tippSzoveg);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nyertE() {
        if(kincs == tipp){
            szoveg = "Meglelted a kincset";
        }else{
            szoveg = "Sajnos nem lelted meg a kincset";
        }
    }

    private void EzustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EzustBtnActionPerformed
        tipp = "Ezüst";
    }//GEN-LAST:event_EzustBtnActionPerformed

    private void AranyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AranyBtnActionPerformed
        tipp = "Arany";
    }//GEN-LAST:event_AranyBtnActionPerformed

    private void BronzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BronzBtnActionPerformed
        tipp = "Bronz";
    }//GEN-LAST:event_BronzBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LogikaiGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogikaiGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogikaiGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogikaiGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogikaiGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AranKepLbl;
    private javax.swing.JButton AranyBtn;
    private javax.swing.JLabel AranyLbl1;
    private javax.swing.JButton BronzBtn;
    private javax.swing.JLabel BronzKepLbl1;
    private javax.swing.JLabel BronzLbl;
    private javax.swing.JLabel EzsutKepLbl;
    private javax.swing.JButton EzustBtn;
    private javax.swing.JLabel EzustLbl;
    private javax.swing.JLabel FeliartLbl;
    private javax.swing.JLabel LeirasLbl1;
    private javax.swing.JLabel LeirasLbl2;
    private javax.swing.JLabel LeirasLbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
