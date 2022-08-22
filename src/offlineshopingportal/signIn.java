
package offlineshopingportal;

import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class signIn extends javax.swing.JFrame {
    private Object alartLablel;

    
    public signIn() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        alartLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logUserIdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logPasswordText = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        toSignupButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        alartLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(alartLabel);
        alartLabel.setBounds(300, 240, 240, 20);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 40, 0, 380);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Id :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 60, 90, 20);

        logUserIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUserIdTextActionPerformed(evt);
            }
        });
        jPanel1.add(logUserIdText);
        logUserIdText.setBounds(30, 80, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 100, 30);

        logPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logPasswordTextActionPerformed(evt);
            }
        });
        jPanel1.add(logPasswordText);
        logPasswordText.setBounds(30, 150, 240, 30);

        loginButton.setBackground(new java.awt.Color(153, 255, 153));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 102, 0));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(200, 190, 80, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("If you don't have an account please click below to sign up:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 240, 330, 30);

        toSignupButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toSignupButton.setForeground(new java.awt.Color(51, 51, 255));
        toSignupButton.setText("Sign Up");
        toSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toSignupButtonActionPerformed(evt);
            }
        });
        jPanel1.add(toSignupButton);
        toSignupButton.setBounds(440, 280, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\DatabaseProject\\pexels-crop.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 570, 420);

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 70, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toSignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toSignupButtonActionPerformed
        // TODO add your handling code here:
        signUp r = new signUp();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toSignupButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //TODO add your handling code here:
        String u = logUserIdText.getText();
        String p = logPasswordText.getText();
        boolean a = false;

        try{
            //String query = "select email, password from user where email = '"+login.getText()+"'";

            database db = new database();
            db.connectDatabase();

            ResultSet r = db.testQuery();
            while(r.next())
            {
                if(!r.getString(1).equals(u) || !r.getString(3).equals(p)){
                } else {
                    a=true;
                    //JOptionPane.showMessageDialog(this, "welcome");
                    break;
                }
            }
            if(a==true){
                //JOptionPane.showMessageDialog(this, "welcome");
                homePage h = new homePage();
                h.setVisible(true);
                this.dispose();

            }
            else

            alartLabel.setText("Invalid Password or Username !!!");

        }
        catch(Exception ex){
            System.out.println("Error in Query..");
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void logPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logPasswordTextActionPerformed

    private void logUserIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUserIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logUserIdTextActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alartLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField logPasswordText;
    private javax.swing.JTextField logUserIdText;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton toSignupButton;
    // End of variables declaration//GEN-END:variables
}
