/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pest.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author panka
 */
public class AddSC extends javax.swing.JFrame {

    /**
     * Creates new form AddSC
     */
    public AddSC() {
        initComponents();
    }
    String tbData[] = new String[8];
        DefaultTableModel tbModel;
         int click=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logIn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        testL = new javax.swing.JLabel();
        JCB1 = new javax.swing.JComboBox<>();
        JCB2 = new javax.swing.JComboBox<>();
        JCB3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTabel = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("SOIL TEST LABORATORIES");

        logIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pest/management/system/images/back.png"))); // NOI18N
        logIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logIn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(225, 225, 225))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(175, 206, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JCB1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maharastra" }));

        JCB2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amravati", "Bhandara", "Buldhana", "Chandrapur", "Dhule", "Gadchiroli", "Gondia", "Hingoli", "Jalgaon", "Jalna", "Kolhapur", "Pune", "Sambhajinagar", " ", " ", " " }));
        JCB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB2ActionPerformed(evt);
            }
        });

        JCB3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        JCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Display Labs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        productTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lab Name", "District", "City", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(JCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(105, 105, 105)
                .addComponent(JCB3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(testL)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(testL)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logIn1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_logIn1ActionPerformed

    private void JCB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB2ActionPerformed
        String dist;

        dist=(String) JCB2.getSelectedItem();
        switch(dist)
        {
             case "Kolhapur":
                           String str[]={"Gadhinglaj","Kagal","Karvir","Shirol","Kolhapur"};
                           DefaultComboBoxModel mod=new DefaultComboBoxModel(str);
                           JCB3.setModel(mod);
                           break;
                    case "Pune":
                            String str1[]={"Baramati","Pune","Bhor","Daund","Indapur"};
                           DefaultComboBoxModel mod1=new DefaultComboBoxModel(str1);
                           JCB3.setModel(mod1);
                           break;
                    case "Ahmednagar":
                            String str2[]={"Ahmednagar","Nevasa","Rahta","Rahuri","Sangamner"};
                           DefaultComboBoxModel mod2=new DefaultComboBoxModel(str2);
                           JCB3.setModel(mod2);
                           break;
                    case "Amravati":
                            String str3[]={"Amravati"};
                           DefaultComboBoxModel mod3=new DefaultComboBoxModel(str3);
                           JCB3.setModel(mod3);
                           break;
                     case "Sambhajinagar":
                            String str4[]={"Sambhajinagar","Ambejogai","Ashti","Beed","Dharur"};
                           DefaultComboBoxModel mod4=new DefaultComboBoxModel(str4);
                           JCB3.setModel(mod4);
                           break;
                    case "Bhandara":
                            String str5[]={"Bhandara","Sakori"};
                           DefaultComboBoxModel mod5=new DefaultComboBoxModel(str5);
                           JCB3.setModel(mod5);
                           break;
                    case "Gadchiroli":
                         String str6[]={"Gadchiroli"};
                           DefaultComboBoxModel mod6=new DefaultComboBoxModel(str6);
                           JCB3.setModel(mod6);
                           break;
                    case "Gondiya":
                         String str7[]={"Gondiya"};
                           DefaultComboBoxModel mod7=new DefaultComboBoxModel(str7);
                           JCB3.setModel(mod7);
                           break;
                    case "Hingoli":
                         String str8[]={"Hingoli,kalamnur"};
                           DefaultComboBoxModel mod8=new DefaultComboBoxModel(str8);
                           JCB3.setModel(mod8);
                           break;
                    case "Jalgoan":
                         String str9[]={"Chalisgoan,chopda"};
                           DefaultComboBoxModel mod9=new DefaultComboBoxModel(str9);
                           JCB3.setModel(mod9);
                           break;
        }
        //jComboBox2= new JComboBox(cities);
    }//GEN-LAST:event_JCB2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(click>=1){
            tbModel.setRowCount(0);
        }
        
         Connection con = CommonDb.getConnection();
        try{
                 Statement stmt = con.createStatement();
                  PreparedStatement pr = con.prepareStatement("select * from soil_centers where SC_district=? and SC_city=?");
                pr.setString(1, (String) JCB2.getSelectedItem());
                pr.setString(2, (String) JCB3.getSelectedItem());
            ResultSet rs = pr.executeQuery();
                
                
            while(rs.next()){
                String name = rs.getString("SC_name");
                String dist = rs.getString("SC_district");
                String city = rs.getString("SC_city");
                String mob = rs.getString("Mobile");
         
//                tbData[1]=  { id, product, pest, crop, trap,duration,cost,per_acre};
                    tbData[0]=name;
                    tbData[1]=dist;
                    tbData[2]=city;
                    tbData[3]=mob;
                    

                 tbModel = (DefaultTableModel)productTabel.getModel();
                tbModel.addRow(tbData);
               // System.out.println("Rest of the code"+id);
                click++;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCB3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB1;
    private javax.swing.JComboBox<String> JCB2;
    private javax.swing.JComboBox<String> JCB3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logIn1;
    private javax.swing.JTable productTabel;
    private javax.swing.JLabel testL;
    // End of variables declaration//GEN-END:variables
}
