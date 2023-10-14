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
public class User {
    protected String usnm;
    protected String pswd;
    protected String name;
    
    User(String usnm,String pswd,String name)
    {
        this.usnm=usnm;
        this.pswd=pswd;
        this.name=name;
    }   
    public String getUsnm() 
    {
	return usnm;
    }
    public void setUsnm(String usnm) 
    {
	this.usnm = usnm;
    }
    public String getPswd() 
    {
	return pswd;
    }
    public void setPswd(String pswd) 
    {
	this.pswd = pswd;
    }
    public String getName() 
    {
	return name;
    }
    public void setName(String name) 
    {
	this.name = name;
    }
     public boolean match(String pswd)
    {
        return pswd.equals(this.pswd);
    }  
    @Override
    public String toString()
    {
        return "";
    }
   
}
