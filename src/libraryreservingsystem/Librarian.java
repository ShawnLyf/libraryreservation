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
public class Librarian extends User{
   
    
    Librarian(String usnm,String pswd,String name)
    {
        super(usnm,pswd,name);
    }
    
    @Override
    public String getUsnm() 
    {
	return usnm;
    }
    @Override
    public void setUsnm(String usnm) 
    {
	this.usnm = usnm;
    }
    @Override
    public String getPswd() 
    {
	return pswd;
    }
    @Override
    public void setPswd(String pswd) 
    {
	this.pswd = pswd;
    }
    @Override
    public String getName() 
    {
	return name;
    }
    @Override
    public void setName(String name) 
    {
	this.name = name;
    }
    @Override
    public boolean match(String pswd)
    {
        return this.pswd.equals(pswd);
    }  
    @Override
    public String toString()
    {
        return "l,"+usnm+","+pswd+","+name+System.getProperty("line.separator");
    }
}
