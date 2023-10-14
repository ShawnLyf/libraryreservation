/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryreservingsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author shawnlyf
 */
public class Library {
    static ArrayList<User> userList=new ArrayList();
    static ArrayList<Book> bkList=new ArrayList();
    static MainMenu mm=new MainMenu();
    static StudentMenu sm=new StudentMenu();
    static AdminMenu am=new AdminMenu();
    static LibrarianMenu lm=new LibrarianMenu();
        
    public static void main(String args[]){
        load();        
        mm.setVisible(true);   
    }
    
    public  static void load(){
        String str;
        try {
            BufferedReader in = new BufferedReader(new FileReader("Accounts.txt"));
            while((str = in.readLine())!=null)
                {
                    String info[]=str.split(",");
                    if(info[0].equals("s"))
                    {
                        Student s=new Student(info[1],info[2],info[3],info[4],info[5]);
                        userList.add(s);
                    }
                    else if(info[0].equals("l"))
                    {
                        Librarian l=new Librarian(info[1],info[2],info[3]);
                        userList.add(l);
                    }  
                    else if(info[0].equals("a"))
                    {
                        Admin a=new Admin(info[1],info[2],info[3]);
                        userList.add(a);
                    }                    
                }
            in.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {			
            e.printStackTrace();
        }   
        
        String str2;
        try {
            BufferedReader in = new BufferedReader(new FileReader("Books.txt"));
    
            while((str2 = in.readLine())!=null)
                {
                    String info[]=str2.split(",");                   
                    Book b=new Book(info[0],info[1],info[2],info[3],info[4],info[5]);
                    bkList.add(b);                   
                }
                in.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {			
            e.printStackTrace();
        } 

    }

}

