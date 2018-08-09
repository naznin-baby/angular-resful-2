/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailwayTickets;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Mohin
 */
public class ActionPage extends javax.swing.JFrame {

    /**
     * Creates new form ActionPage
     */
    public ActionPage() {
        initComponents();
    }
     public void close(){
      WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBTrain = new javax.swing.JComboBox<>();
        jCBClass = new javax.swing.JComboBox<>();
        jCBTime = new javax.swing.JComboBox<>();
        jCBAdult = new javax.swing.JComboBox<>();
        jCBChild = new javax.swing.JComboBox<>();
        bAction = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Your Option"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Train Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Class");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Time");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Adult");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Child");

        jCBTrain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mohanagor Probhati", "Joyontika Express" }));

        jCBClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "First Class" }));

        jCBTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:30AM", "7:30PM" }));

        jCBAdult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jCBChild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        bAction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bAction.setText("Action");
        bAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Payment Option");

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Card", "Cash" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bAction)
                                .addGap(75, 75, 75)
                                .addComponent(bCancel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAction)
                    .addComponent(bCancel))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
       close();
        Home h=new Home();
        h.setVisible(true);
        
    }//GEN-LAST:event_bCancelActionPerformed

    private void bActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionActionPerformed
       close(); 
       String tn = jCBTrain.getSelectedItem().toString();
       String cn = jCBClass.getSelectedItem().toString();
       String ad= jCBAdult.getSelectedItem().toString();
         String ch= jCBChild.getSelectedItem().toString();
        System.out.println(tn);
          System.out.println(ch);
    
        Final f=new Final();
        f.jtxtTrain.setText(tn);
         f.jtxtClass.setText(cn);
         f.jtxtAdult.setText(ad);
         f.jtxtChild.setText(ch);  
        f.setVisible(true);
          
    
        double tax=15.78;
        double MilesK20=320.23;
        double MilesK30=360.98;
        double totalCost,eco=3.85,fclass=5.60;
        if (  jCBChild.getSelectedItem().equals("2")&&jCBAdult.getSelectedItem().equals("1")&& ( jCBTrain.getSelectedItem().equals("Mohanagor Probhati")) &&(jCBClass.getSelectedItem().equals("Standard"))){
            totalCost=(tax*MilesK20)/100;
        String sTax=String.format("$%.2f",totalCost);
        f.jtxtVat.setText(sTax);
        String subTotal=String.format("$%.2f",MilesK20);
        f.jtxtFare.setText(subTotal);
        String Total=String.format("$%.2f",MilesK20+totalCost+140*2);
       f.jtxtTotal.setText(Total);
    
    }
          else if (  jCBChild.getSelectedItem().equals("1")&&jCBAdult.getSelectedItem().equals("2")&& ( jCBTrain.getSelectedItem().equals("Mohanagor Probhati")) &&(jCBClass.getSelectedItem().equals("Standard"))){
            totalCost=(tax*MilesK20)/100;
        String sTax=String.format("$%.2f",totalCost);
        f.jtxtVat.setText(sTax);
        String subTotal=String.format("$%.2f",MilesK20*2);
        f.jtxtFare.setText(subTotal);
        String Total=String.format("$%.2f",MilesK20*2+totalCost);
       f.jtxtTotal.setText(Total);
        
    } 
               else if (  jCBChild.getSelectedItem().equals("1")&&jCBAdult.getSelectedItem().equals("1")&& ( jCBTrain.getSelectedItem().equals("Mohanagor Probhati")) &&(jCBClass.getSelectedItem().equals("First Class"))){
            totalCost=(tax*MilesK30)/100;
        String sTax=String.format("$%.2f",totalCost);
        f.jtxtVat.setText(sTax);
        String subTotal=String.format("$%.2f",MilesK30*2);
        f.jtxtFare.setText(subTotal);
        String Total=String.format("$%.2f",MilesK30*2+totalCost);
       f.jtxtTotal.setText(Total);
        
    } 
            else if (  jCBChild.getSelectedItem().equals("2")&&jCBAdult.getSelectedItem().equals("2")&& ( jCBTrain.getSelectedItem().equals("Mohanagor Probhati")) &&(jCBClass.getSelectedItem().equals("Standard"))){
            totalCost=(tax*MilesK20*2)/100;
        String sTax=String.format("$%.2f",totalCost);
        f.jtxtVat.setText(sTax);
        String subTotal=String.format("$%.2f",MilesK20*2);
        f.jtxtFare.setText(subTotal);
        String Total=String.format("$%.2f",MilesK20*2+totalCost+140*2);
       f.jtxtTotal.setText(Total);
        
    } 
        
        else if (  jCBChild.getSelectedItem().equals("1")&&jCBAdult.getSelectedItem().equals("1")&& ( jCBTrain.getSelectedItem().equals("Mohanagor Probhati")) &&(jCBClass.getSelectedItem().equals("Standard"))){
            totalCost=(tax*MilesK20)/100;
        String sTax=String.format("$%.2f",totalCost);
        f.jtxtVat.setText(sTax);
        String subTotal=String.format("$%.2f",MilesK20);
        f.jtxtFare.setText(subTotal);
        String Total=String.format("$%.2f",MilesK20+totalCost);
       f.jtxtTotal.setText(Total);
       
        
    }//GEN-LAST:event_bActionActionPerformed
    //    private void train(){
   // String Train =jCBTrain.getSelectedItem().toString();*/
        }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
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
            java.util.logging.Logger.getLogger(ActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAction;
    private javax.swing.JButton bCancel;
    public javax.swing.JComboBox<String> jCBAdult;
    public javax.swing.JComboBox<String> jCBChild;
    private javax.swing.JComboBox<String> jCBClass;
    private javax.swing.JComboBox<String> jCBTime;
    private javax.swing.JComboBox<String> jCBTrain;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}