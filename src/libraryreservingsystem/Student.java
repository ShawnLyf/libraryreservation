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
public class Student extends User{
   
    String degree;
    String course;
    
    Student(String usnm,String pswd,String name,String degree,String course)
    {
        super(usnm,pswd,name);
        this.degree=degree;
        this.course=course;
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
    public String getDegree() 
    {
	return degree;
    }
    public void setDegree(String degree) 
    {
	this.degree = degree;
    }
    public String getCourse() 
    {
	return course;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }  
    @Override
    public boolean match(String pswd)
    {
        return this.pswd.equals(pswd);
    }     
    @Override
    public String toString()
    {
        return "s,"+usnm+","+pswd+","+name+","+degree+","+course+System.getProperty("line.separator");
    }
}
