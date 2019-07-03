/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2java2;

import javax.swing.JOptionPane;

/**
 *
 * @author farahaff
 */
public class SignUpDialog extends javax.swing.JDialog {

    /**
     * Creates new form SignUpDialog
     */
    private HELPFit hf;
    private User user;
    public SignUpDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Sign Up");
        this.setLocationRelativeTo(null);
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
        signupLbl = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        trainerPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tUserTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tPassTF = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        tFullTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tEmailTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tSpecialityCB = new javax.swing.JComboBox<>();
        tSignupBtn = new javax.swing.JButton();
        memberPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mUserTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mPassTF = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        mFullTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mEmailTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mLevelCB = new javax.swing.JComboBox<>();
        mSignupBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        signupLbl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        signupLbl.setText("Sign Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(signupLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(signupLbl)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        trainerPanel.setBackground(new java.awt.Color(44, 62, 80));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");

        tUserTF.setBackground(new java.awt.Color(108, 122, 137));
        tUserTF.setForeground(new java.awt.Color(255, 255, 255));
        tUserTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUserTFActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        tPassTF.setBackground(new java.awt.Color(108, 122, 137));
        tPassTF.setForeground(new java.awt.Color(255, 255, 255));
        tPassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPassTFActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Full Name:");

        tFullTF.setBackground(new java.awt.Color(108, 122, 137));
        tFullTF.setForeground(new java.awt.Color(255, 255, 255));
        tFullTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFullTFActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email:");

        tEmailTF.setBackground(new java.awt.Color(108, 122, 137));
        tEmailTF.setForeground(new java.awt.Color(255, 255, 255));
        tEmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailTFActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Speciality");

        tSpecialityCB.setBackground(new java.awt.Color(108, 122, 137));
        tSpecialityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your Speciality", "SPORT", "DANCE", "MMA" }));
        tSpecialityCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSpecialityCBActionPerformed(evt);
            }
        });

        tSignupBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        tSignupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2java2/signup-icon-2.png"))); // NOI18N
        tSignupBtn.setText("Sign Up");
        tSignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSignupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout trainerPanelLayout = new javax.swing.GroupLayout(trainerPanel);
        trainerPanel.setLayout(trainerPanelLayout);
        trainerPanelLayout.setHorizontalGroup(
            trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trainerPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tFullTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tUserTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tEmailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tSpecialityCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tSignupBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(tPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        trainerPanelLayout.setVerticalGroup(
            trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainerPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tUserTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tFullTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(trainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSpecialityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(tSignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Trainer", trainerPanel);

        memberPanel.setBackground(new java.awt.Color(44, 62, 80));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");

        mUserTF.setBackground(new java.awt.Color(108, 122, 137));
        mUserTF.setForeground(new java.awt.Color(255, 255, 255));
        mUserTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUserTFActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        mPassTF.setBackground(new java.awt.Color(108, 122, 137));
        mPassTF.setForeground(new java.awt.Color(255, 255, 255));
        mPassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPassTFActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name:");

        mFullTF.setBackground(new java.awt.Color(108, 122, 137));
        mFullTF.setForeground(new java.awt.Color(255, 255, 255));
        mFullTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFullTFActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");

        mEmailTF.setBackground(new java.awt.Color(108, 122, 137));
        mEmailTF.setForeground(new java.awt.Color(255, 255, 255));
        mEmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEmailTFActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Level:");

        mLevelCB.setBackground(new java.awt.Color(108, 122, 137));
        mLevelCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your level", "Beginner", "Advanced", "Expert" }));
        mLevelCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLevelCBActionPerformed(evt);
            }
        });

        mSignupBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        mSignupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2java2/signup-icon-2.png"))); // NOI18N
        mSignupBtn.setText("Sign Up");
        mSignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSignupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memberPanelLayout = new javax.swing.GroupLayout(memberPanel);
        memberPanel.setLayout(memberPanelLayout);
        memberPanelLayout.setHorizontalGroup(
            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberPanelLayout.createSequentialGroup()
                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(mUserTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mLevelCB, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mSignupBtn))))
                    .addGroup(memberPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(mFullTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        memberPanelLayout.setVerticalGroup(
            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mUserTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mFullTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLevelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addComponent(mSignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Member", memberPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mUserTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUserTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mUserTFActionPerformed

    private void mPassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPassTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mPassTFActionPerformed

    private void mFullTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFullTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mFullTFActionPerformed

    private void mEmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEmailTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mEmailTFActionPerformed

    private void mLevelCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLevelCBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mLevelCBActionPerformed

    private void mSignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSignupBtnActionPerformed
        // TODO add your handling code here:
        
        String mUsername = mUserTF.getText();
        String mPass = mPassTF.getText();
        String mFull = mFullTF.getText();
        String mEmail = mEmailTF.getText();
        String mLevel = (String) mLevelCB.getSelectedItem();
        Level level = Level.valueOf(mLevel);
        hf = ((HFGUI)this.getParent()).getHf();
        user = hf.addMember(mUsername, mPass, mFull, mEmail, level);

        JOptionPane.showMessageDialog(this, user.toString());
        this.dispose();
        //HFGUI hfgui = new HFGUI(this, true);

    }//GEN-LAST:event_mSignupBtnActionPerformed

    private void tUserTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUserTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUserTFActionPerformed

    private void tPassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPassTFActionPerformed

    private void tFullTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFullTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFullTFActionPerformed

    private void tEmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailTFActionPerformed

    private void tSpecialityCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSpecialityCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSpecialityCBActionPerformed

    private void tSignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSignupBtnActionPerformed
        // TODO add your handling code here:
        String tUsername = tUserTF.getText();
        String tPass = tPassTF.getText();
        String tFull = tFullTF.getText();
        String tEmail = tEmailTF.getText();
        String tSpeciality = (String) tSpecialityCB.getSelectedItem();
        Speciality spc = Speciality.valueOf(tSpeciality);
        hf = ((HFGUI)this.getParent()).getHf();
        user = hf.addTrainer(tUsername, tPass, tFull, tEmail, spc);
        
        JOptionPane.showMessageDialog(this, user.toString());
        this.dispose();
    }//GEN-LAST:event_tSignupBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUpDialog dialog = new SignUpDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mEmailTF;
    private javax.swing.JTextField mFullTF;
    private javax.swing.JComboBox<String> mLevelCB;
    private javax.swing.JPasswordField mPassTF;
    private javax.swing.JButton mSignupBtn;
    private javax.swing.JTextField mUserTF;
    private javax.swing.JPanel memberPanel;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JTextField tEmailTF;
    private javax.swing.JTextField tFullTF;
    private javax.swing.JPasswordField tPassTF;
    private javax.swing.JButton tSignupBtn;
    private javax.swing.JComboBox<String> tSpecialityCB;
    private javax.swing.JTextField tUserTF;
    private javax.swing.JPanel trainerPanel;
    // End of variables declaration//GEN-END:variables
}