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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
/**
 *
 * @author shawnlyf
 */
public class AdminMenu extends javax.swing.JFrame {

    ArrayList<User> tempList=new ArrayList();
    int radioBt=1;
    boolean input=false;
    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        studentBt = new javax.swing.JRadioButton();
        librarian = new javax.swing.JRadioButton();
        createBt = new javax.swing.JButton();
        deleteBt = new javax.swing.JButton();
        deleteBt.setVisible(false);
        editBt = new javax.swing.JButton();
        editBt.setVisible(false);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchArea = new javax.swing.JTextField();
        usnmArea = new javax.swing.JTextField();
        pswdArea = new javax.swing.JTextField();
        nameArea = new javax.swing.JTextField();
        degreeArea = new javax.swing.JTextField();
        courseArea = new javax.swing.JTextField();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Name", "Degree", "Course"
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

        buttonGroup1.add(studentBt);
        studentBt.setSelected(true);
        studentBt.setText("Student");
        studentBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtActionPerformed(evt);
            }
        });

        buttonGroup1.add(librarian);
        librarian.setText("Librarian");
        librarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianActionPerformed(evt);
            }
        });

        createBt.setText("Create");
        createBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBtMouseClicked(evt);
            }
        });

        deleteBt.setText("Delete");
        deleteBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtMouseClicked(evt);
            }
        });

        editBt.setText("Edit");
        editBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Admin System");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Login as ,Log off");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type somthing...");
        searchArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchAreaMousePressed(evt);
            }
        });
        searchArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchAreaKeyReleased(evt);
            }
        });

        usnmArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usnmAreaMouseReleased(evt);
            }
        });

        pswdArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pswdAreaMouseReleased(evt);
            }
        });

        nameArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nameAreaMouseReleased(evt);
            }
        });
        nameArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameAreaActionPerformed(evt);
            }
        });

        degreeArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                degreeAreaMouseReleased(evt);
            }
        });
        degreeArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeAreaActionPerformed(evt);
            }
        });

        courseArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                courseAreaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usnmArea, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pswdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchArea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(degreeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createBt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(studentBt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(librarian))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentBt)
                            .addComponent(librarian)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pswdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(degreeArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usnmArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createBt))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editBt)
                        .addComponent(deleteBt)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtActionPerformed
        // TODO add your handling code here:
        load(Library.userList,"s"); 
        radioBt=1;
        deleteBt.setVisible(false);
        editBt.setVisible(false);
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");
        input=false;
        degreeArea.setVisible(true);
        courseArea.setVisible(true);
        DefaultTableModel model=(DefaultTableModel) table.getModel();  
        model.setColumnCount(5);
        load(Library.userList,"s");
        
        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn degreeC = tcm.getColumn(3);
        TableColumn courseC= tcm.getColumn(4);
        degreeC.setHeaderValue( "Degree" );
        courseC.setHeaderValue( "Course" );
        th.repaint();
        
    }//GEN-LAST:event_studentBtActionPerformed

    private void librarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianActionPerformed
        // TODO add your handling code here:
        
        radioBt=2;
        deleteBt.setVisible(false);
        editBt.setVisible(false);
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");
        input=false;
        degreeArea.setVisible(false);
        courseArea.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) table.getModel();  
        model.setColumnCount(3);
        
        load(Library.userList,"l");

       

    }//GEN-LAST:event_librarianActionPerformed

    private void searchAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAreaKeyReleased
        // TODO add your handling code here:
        if(radioBt==1)
        {
            searchKey("s");
        }
        else if(radioBt==2)
        {
            searchKey("l");
        }
        input=true;
        deleteBt.setVisible(false);
        editBt.setVisible(false);
          
    }//GEN-LAST:event_searchAreaKeyReleased

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) table.getModel();  
        
        int selectedRowIndex=table.getSelectedRow();
        if(radioBt==1)
        {
            usnmArea.setText(model.getValueAt(selectedRowIndex,0).toString());
            pswdArea.setText(model.getValueAt(selectedRowIndex,1).toString());
            nameArea.setText(model.getValueAt(selectedRowIndex,2).toString());
            degreeArea.setText(model.getValueAt(selectedRowIndex,3).toString());
            courseArea.setText(model.getValueAt(selectedRowIndex,4).toString());
        }else if(radioBt==2)
        {
            usnmArea.setText(model.getValueAt(selectedRowIndex,0).toString());
            pswdArea.setText(model.getValueAt(selectedRowIndex,1).toString());
            nameArea.setText(model.getValueAt(selectedRowIndex,2).toString());
            degreeArea.setText(null);
            courseArea.setText(null);
        }
        deleteBt.setVisible(true);
        editBt.setVisible(true);
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");
    }//GEN-LAST:event_tableMouseReleased

    private void editBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtMouseClicked
        // TODO add your handling code here:
        String usnm =usnmArea.getText();
        String pswd =pswdArea.getText();
        String name =nameArea.getText();
        String degree=degreeArea.getText();
        String course=courseArea.getText();
        
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");
        
        if(radioBt==1)
        {
            if(!usnm.equals("")&&!pswd.equals("")&&!name.equals("")&&!degree.equals("")&&!course.equals(""))
            {
                for(User u:Library.userList)
                {
                    if(u.getUsnm().equals(usnm))
                    {
                        u.setName(name);
                        u.setPswd(pswd);
                        u.setName(name);
                        ((Student) u).setDegree(degree);
                        ((Student) u).setCourse(course);
                        break;
                    }   
                }
                if(input==false)
                {
                    load(Library.userList,"s");
                }
                else
                {
                        
                    load(tempList,"s");
                }       
                write();
                JOptionPane.showMessageDialog(null," Account updated!","Error",JOptionPane.PLAIN_MESSAGE);
                
            }else
            {
                 JOptionPane.showMessageDialog(null,"Invalid input!","Error",JOptionPane.PLAIN_MESSAGE);                
            }          
        }else 
        if(radioBt==2)
        {
            if(!usnm.equals("")&&!pswd.equals("")&&!name.equals("")&&degree.equals("")&&course.equals(""))
            {
                for(User u:Library.userList)
                {
                    if(u.getUsnm().equals(usnm))
                    {
                        u.setName(name);
                        u.setPswd(pswd);
                        u.setName(name);
                        break;
                    }   
                }
                if(input==false)
                {
                    load(Library.userList,"l");
                }
                else
                {                       
                    load(tempList,"l");
                }  
                write();
                JOptionPane.showMessageDialog(null," Account updated!","Error",JOptionPane.PLAIN_MESSAGE);
                
            }else
            {
                JOptionPane.showMessageDialog(null,"Invalid input!","Error",JOptionPane.PLAIN_MESSAGE);                
            }     
        }
        input=false;
    }//GEN-LAST:event_editBtMouseClicked

    private void createBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtMouseClicked
        // TODO add your handling code here:
        String usnm =usnmArea.getText();
        String pswd =pswdArea.getText();
        String name =nameArea.getText();
        String degree=degreeArea.getText();
        String course=courseArea.getText();
        
        boolean have=false;
        
        if(radioBt==1)
        {
            if(!usnm.equals("")&&!pswd.equals("")&&!name.equals("")&&!degree.equals("")&&!course.equals(""))
            {
                for(User u:Library.userList)
                {
                    if(u.getUsnm().equals(usnm))
                    {
                        JOptionPane.showMessageDialog(null,"Username already exist!","Error",JOptionPane.PLAIN_MESSAGE);
                        have=true;
                        clearAreas();
                        break;        
                    }
                    
                }
                if(!have)
                {                  
                    Student s=new Student(usnm,pswd,name,degree,course);
                    Library.userList.add(s);
                    load(Library.userList,"s"); 
                    write();
                    JOptionPane.showMessageDialog(null,"Student Account Created!","Error",JOptionPane.PLAIN_MESSAGE);
                }
                
            }else
            {
                 JOptionPane.showMessageDialog(null,"Invalid input!","Error",JOptionPane.PLAIN_MESSAGE);                
            }          
        }else 
        if(radioBt==2)
        {
            if(!usnm.equals("")&&!pswd.equals("")&&!name.equals("")&&degree.equals("")&&course.equals(""))
            {
                for(User u:Library.userList)
                {
                    if(u.getUsnm().equals(usnm))
                    {
                        JOptionPane.showMessageDialog(null,"Username already exist!","Error",JOptionPane.PLAIN_MESSAGE);
                        have=true;
                        clearAreas();
                        break;        
                    }      
                }
                if(!have)
                {
                    Librarian l=new Librarian(usnm,pswd,name);                  
                    Library.userList.add(l);
                    load(Library.userList,"l");
                    write();
                    JOptionPane.showMessageDialog(null,"Librarian Account Created!","Error",JOptionPane.PLAIN_MESSAGE);
                }
                
            }else
            {
                JOptionPane.showMessageDialog(null,"Invalid input!","Error",JOptionPane.PLAIN_MESSAGE);                
            }     
        }  
            searchArea.setForeground(new java.awt.Color(204, 204, 204));
            searchArea.setText("Type someting...");
            input=false;
    }//GEN-LAST:event_createBtMouseClicked

    private void deleteBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtMouseClicked
        // TODO add your handling code here:
        String usnm =usnmArea.getText();
        
        
        for(User u: Library.userList)
        {
            if(u.getUsnm().equals(usnm))
            {   
                JOptionPane.showMessageDialog(null,"User deleted!","Error",JOptionPane.PLAIN_MESSAGE);
                Library.userList.remove(u);
                tempList.remove(u);
                clearAreas();
                
                if(radioBt==1)
                {
                    if(input==false)
                    {
                        load(Library.userList,"s");
                    }
                    else
                    {
                        
                        load(tempList,"s");
                    }
                        
                }
                else if(radioBt==2)
                {
                    if(input==false)
                    {
                        load(Library.userList,"l");
                    }
                    else
                    {
                        
                        load(tempList,"l");
                    }
                    
                }
                write();
                break;                    
            }
                   
        }
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");     
        input=false; 
    }//GEN-LAST:event_deleteBtMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        clearAreas();
        studentBt.setSelected(true);
        Library.am.load(Library.userList,"s");
        searchArea.setForeground(new java.awt.Color(204, 204, 204));
        searchArea.setText("Type someting...");
        input=false;
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Library.am.setVisible(false);
        Library.mm.setVisible(true);
        Library.mm.setDefault();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void searchAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchAreaMousePressed
        // TODO add your handling code here:
        searchArea.setForeground(new java.awt.Color(0, 0, 0));
        searchArea.setText(null);
        
    }//GEN-LAST:event_searchAreaMousePressed

    private void usnmAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usnmAreaMouseReleased
        // TODO add your handling code here:
         usnmArea.setText(null);
    }//GEN-LAST:event_usnmAreaMouseReleased

    private void pswdAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswdAreaMouseReleased
        // TODO add your handling code here:
         pswdArea.setText(null);
    }//GEN-LAST:event_pswdAreaMouseReleased

    private void nameAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameAreaMouseReleased
        // TODO add your handling code here:
         nameArea.setText(null);
    }//GEN-LAST:event_nameAreaMouseReleased

    private void degreeAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degreeAreaMouseReleased
        // TODO add your handling code here:
        degreeArea.setText(null);
    }//GEN-LAST:event_degreeAreaMouseReleased

    private void courseAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseAreaMouseReleased
        // TODO add your handling code here:
         courseArea.setText(null);
    }//GEN-LAST:event_courseAreaMouseReleased

    private void degreeAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeAreaActionPerformed

    private void nameAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAreaActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }
    void load (ArrayList<User> list,String t)
    {
        DefaultTableModel model=(DefaultTableModel) table.getModel(); 
        model.setRowCount(0);
        if(t.equals("s"))
        {           
            for(User u:list)
            {
                if(u instanceof Student)
                {
                    Student s=(Student)u;
                    Object dataRow[];
                dataRow = new Object[]
                {
                    s.getUsnm(),
                    s.getPswd(),
                    s.getName(),
                    s.getDegree(),
                    s.getCourse()  
                };
                model.addRow(dataRow);
                }                   
            }
        }
        else if(t.equals("l"))
        {
            for(User u:list)
            {
                if(u instanceof Librarian)
                {
                    Librarian l=(Librarian)u;
                    Object dataRow[];
                dataRow = new Object[]
                {
                    l.getUsnm(),
                    l.getPswd(),
                    l.getName()                    
                };
                model.addRow(dataRow);
                }                   
            }
        }
    }
    void searchKey(String t){
        tempList.clear();
        String result=searchArea.getText();
        if(t.equals("s"))
        {   
            for(User u: Library.userList)
            {
                if(u instanceof Student)
                {
                    Student s=(Student)u;
                    if(s.getUsnm().contains(result)||s.getPswd().contains(result)||s.getName().contains(result)||s.getDegree().contains(result)||s.getCourse().contains(result))
                    {
                       tempList.add(u);
                       load(tempList,"s");                      
                    }
                }        
            }
        }else if(t.equals("l"))
        {
            for(User u: Library.userList)
            {
                if(u instanceof Librarian)
                {
                    Librarian l=(Librarian)u;
                    if(l.getUsnm().contains(result)||l.getPswd().contains(result)||l.getName().contains(result))
                    {
                       tempList.add(l);
                       load(tempList,"l");                      
                    }
                }        
            }
        }
        
    }
    void clearAreas()
    {
        usnmArea.setText(null);
        pswdArea.setText(null);
        nameArea.setText(null);
        degreeArea.setText(null);
        courseArea.setText(null);
    }
    void write()
    {
        try 
        {
            Writer wt=new BufferedWriter(new FileWriter("Accounts.txt"));                               
            for (User u : Library.userList) 
            {
                wt.write(u.toString());
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
    void showName(){
        jLabel2.setText("Lohin as "+Library.mm.getLoginName()+",Log off");
        ImageIcon iconLogo = new ImageIcon("a.png");
        Image img=iconLogo.getImage();
        Image image = img.getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(image);
        icon.setIcon(i);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField courseArea;
    private javax.swing.JButton createBt;
    private javax.swing.JTextField degreeArea;
    private javax.swing.JButton deleteBt;
    private javax.swing.JButton editBt;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton librarian;
    private javax.swing.JTextField nameArea;
    private javax.swing.JTextField pswdArea;
    private javax.swing.JTextField searchArea;
    private javax.swing.JRadioButton studentBt;
    private javax.swing.JTable table;
    private javax.swing.JTextField usnmArea;
    // End of variables declaration//GEN-END:variables
}
