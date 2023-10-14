/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryreservingsystem;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author shawnlyf
 */
public class StudentMenu extends javax.swing.JFrame {

    ArrayList<Book> tempList=new ArrayList();
    boolean input=false;
    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bookBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type somthing...");
        searchArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchAreaMouseReleased(evt);
            }
        });
        searchArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchAreaKeyReleased(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        bookBt.setText("Book");
        bookBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBtMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Student System");

        loginLabel.setForeground(new java.awt.Color(0, 153, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel.setText("login as,click to log off");
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookBt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(loginLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookBt))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookBtMouseClicked
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.PLAIN_MESSAGE);
        String title=searchArea.getText();
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");
        boolean have=false;
        if(title.equals("Type someting..."))
        {
             JOptionPane.showMessageDialog(null,"Type something to search!","Error",JOptionPane.PLAIN_MESSAGE);
        }else
        {
            for(Book b: Library.bkList)
            {

                if(b.getTitle().equals(title))
                {
                    have=true;
                    if(b.getStatus().equals("available"))
                    {
                        JOptionPane.showMessageDialog(null,"Booked!","Error",JOptionPane.PLAIN_MESSAGE);
                        b.setStatus("rented");
                        b.setBorrower(Library.mm.getLoginName());

                        if(input==false)
                        {
                            load(Library.bkList);
                        }
                        else
                        {
                            load(tempList);
                        }
                        write();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Book already rented!","Error",JOptionPane.PLAIN_MESSAGE);

                        if(input==false)
                        {
                            load(Library.bkList);
                        }
                        else
                        {
                            load(tempList);
                        }
                    }
                    break;
                }

            }
            if(!have)
            {
                JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.PLAIN_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_bookBtMouseClicked

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) table.getModel();  
        int selectedRowIndex=table.getSelectedRow();
        
        searchArea.setText(model.getValueAt(selectedRowIndex,1).toString());
        searchArea.setForeground(new java.awt.Color(0, 0, 0));
        
        
    }//GEN-LAST:event_tableMouseReleased

    private void searchAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAreaKeyReleased
        // TODO add your handling code here:
        searchKey();
        input=true;
        load(tempList);
    }//GEN-LAST:event_searchAreaKeyReleased

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        // TODO add your handling code here:
        Library.sm.setVisible(false);
        Library.mm.setVisible(true);
        Library.mm.setDefault();
    }//GEN-LAST:event_loginLabelMouseClicked

    private void searchAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchAreaMouseReleased
        // TODO add your handling code here:
        searchArea.setForeground(new java.awt.Color(0, 0, 0));
        searchArea.setText(null);
    }//GEN-LAST:event_searchAreaMouseReleased

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
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
        
        
    }
    
    void showName()
    {
        loginLabel.setText("Login as "+Library.mm.getLoginName()+",Log off");
        ImageIcon iconLogo = new ImageIcon("s.png");
        Image img=iconLogo.getImage();
        Image image = img.getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(image);
        icon.setIcon(i);
        
    }
    
    void load(ArrayList<Book> list)
    {
        DefaultTableModel model=(DefaultTableModel) table.getModel(); 
        model.setRowCount(0);
        for(Book b:list)
        {
            Object dataRow[] = new Object[]
            { 
                b.getISBN(),
                b.getTitle(),
                b.getAuthor(),
                b.getLocation(),
                b.getStatus()
            };
            model.addRow(dataRow);           
        }
    }
    void searchKey(){
        tempList.clear();
        String result=searchArea.getText();
        for(Book b: Library.bkList)
        {
            if(b.getAuthor().contains(result)||b.getISBN().contains(result)||b.getTitle().contains(result)||b.getLocation().contains(result))
            {
                tempList.add(b);
            }           
        }
    }
    void write()
    {
        try 
        {
            Writer wt=new BufferedWriter(new FileWriter("Books.txt"));                               
            for (Book b : Library.bkList) 
            {
                wt.write(b.getISBN()+","+b.getTitle()+","+b.getAuthor()+","+b.getLocation()+","+b.getStatus()+","+b.getBorrower()+System.getProperty("line.separator"));
            }                
            wt.close();
            
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {			
            e.printStackTrace();
        } 
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBt;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField searchArea;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}