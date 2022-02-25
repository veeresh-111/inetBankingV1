package com.inetBanking.Utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	public Properties p;
	public ReadConfig() 
	{
	try
	{
	FileInputStream fis=new FileInputStream("./Configuration/config.properties");
      p=new Properties();
	  p.load(fis); 
	}catch(Exception e)
	{
		System.out.println("exception is " + e.getMessage());
	}
}
	public String geturl()
	{
		String baseurl=p.getProperty("baseurl");
		//System.out.println(baseurl);
	     return baseurl;
	}
	public String getusername()
	{
		String username=p.getProperty("username");
		//System.out.println(username);
		return username;
	}
	public String getpassword()
	{
		String password=p.getProperty("password");
		//System.out.println(password);
		return password;
	}

}
