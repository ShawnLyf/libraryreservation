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
public class Admin extends User{
    
    Admin(String usnm,String pswd,String name)
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
    public String toString()
    {
        return "a,"+usnm+","+pswd+","+name+System.getProperty("line.separator");
    }
}
    

