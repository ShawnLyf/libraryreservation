/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryreservingsystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author shawnlyf
 */
public class MainMenu extends javax.swing.JFrame {
     String loginName; 

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        ImageIcon iconLogo = new ImageIcon("m.png");
        Image img=iconLogo.getImage();
        Image image = img.getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(image);
        icon.setIcon(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        usnmArea = new javax.swing.JTextField();
        usnm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pswdArea = new javax.swing.JPasswordField();
        pswdArea.setEchoChar((char) 0);
        icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Library ");

        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        usnmArea.setForeground(new java.awt.Color(204, 204, 204));
        usnmArea.setText("Enter username...");
        usnmArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnmAreaActionPerformed(evt);
            }
        });
        usnmArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usnmAreaKeyPressed(evt);
            }
        });

        usnm.setText("Username:");

        jLabel2.setText("Password:");

        pswdArea.setForeground(new java.awt.Color(204, 204, 204));
        pswdArea.setText("Enter password...");
        pswdArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswdAreaKeyPressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Show pswd");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usnm)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usnmArea, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(pswdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usnm)
                    .addComponent(usnmArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usnmAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnmAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnmAreaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String usnm=usnmArea.getText();       
        String pswd = new String(pswdArea.getPassword());
        
        loginName=usnm;
        usnmArea.setText(null);
        pswdArea.setText(null);
        boolean have=false;
        
        for(User u:Library.userList)
        {           
            if(u.getUsnm().equals(usnm)&&u.match(pswd))
            {               
                have=true;
                Library.mm.setVisible(false);
                JOptionPane.showMessageDialog(null,"Login successful!","Error",JOptionPane.PLAIN_MESSAGE);
                
                if(u instanceof Student)
                {
                    Library.sm.load(Library.bkList);
                    Library.sm.setVisible(true);                    
                    Library.sm.showName();
                }else if(u instanceof Librarian)
                {
                    Library.lm.load(Library.bkList);
                    Library.lm.setVisible(true);
                    Library.lm.showName();
                }else 
                {
                    Library.am.setVisible(true);
                    Library.am.load(Library.userList,"s");
                    Library.am.showName();
                }
                break;
            }               
        }
        
        if(!have)
        {
           JOptionPane.showMessageDialog(null,"Invalid username or password!","Error",JOptionPane.PLAIN_MESSAGE); 
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        pswdArea.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
        pswdArea.setEchoChar('*');
    }//GEN-LAST:event_jLabel1MouseReleased

    private void usnmAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnmAreaKeyPressed
        // TODO add your handling code here:
        if(usnmArea.getText().equals("Enter username..."))
        {
           usnmArea.setText(null);  
        }
       
        usnmArea.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_usnmAreaKeyPressed

    private void pswdAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswdAreaKeyPressed
        // TODO add your handling code here:
        if(new String(pswdArea.getPassword()).equals("Enter password..."))
        {
            pswdArea.setText(null);
        }
        pswdArea.setForeground(new java.awt.Color(0, 0, 0));
        pswdArea.setEchoChar('*');
    }//GEN-LAST:event_pswdAreaKeyPressed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    public  String getLoginName()
    {
        return loginName;
    }
    void setDefault()
    {
        usnmArea.setText("Enter username...");
        usnmArea.setForeground(new java.awt.Color(204, 204, 204));
     
        pswdArea.setText("Enter password...");
        pswdArea.setForeground(new java.awt.Color(204, 204, 204));
        pswdArea.setEchoChar((char) 0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pswdArea;
    private javax.swing.JLabel usnm;
    private javax.swing.JTextField usnmArea;
    // End of variables declaration//GEN-END:variables
}
