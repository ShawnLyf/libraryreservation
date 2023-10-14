/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryreservingsystem;
/**
 *
 * @author shawnlyf
 */
public class Book {
    String ISBN;
    String title;
    String author;
    String location;
    String status;
    String borrower;
    
    Book(String ISBN,String title,String author,String location,String status,String borrower)
    {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
        this.location=location;
        this.status=status;
        this.borrower=borrower;
    }
    
    public String getISBN() 
    {
        return ISBN;
    }
    public void setISBN(String iSBN) 
    {
        ISBN = iSBN;
    }
    public String getAuthor() 
    {
        return author;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    public String getStatus() 
    {
        return status;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }
    public String getBorrower() 
    {
        return borrower;
    }
    public void setBorrower(String borrower) 
    {
        this.borrower = borrower;
    }
  
}
