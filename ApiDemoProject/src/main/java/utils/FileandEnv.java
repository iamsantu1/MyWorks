package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileandEnv {

	public static Map<String,String> fileandevn=new HashMap<String,String>();
	public static Properties promain=new Properties();
	public static Properties propreset=new Properties();
	
	public static Map<String,String> envAndFile()
	{
		String environment=System.getProperty("env");
		try {
			
			if(environment.equalsIgnoreCase("Dev"))
			{
				FileInputStream FisDev=new FileInputStream(System.getProperty("user.dir")+"/inputs/Div.properties");
				promain.load(FisDev);
				fileandevn.put("Serverurl",promain.getProperty("Serverurl"));
				fileandevn.put("Username",promain.getProperty("Username"));
				fileandevn.put("Password",promain.getProperty("Password"));
				fileandevn.put("portno",promain.getProperty("portno"));
			} else if(environment.equalsIgnoreCase("QA"))
			{
				FileInputStream FisDev=new FileInputStream(System.getProperty("user.dir")+"/inputs/Div.properties");
				promain.load(FisDev);
				fileandevn.put("Serverurl",promain.getProperty("Serverurl"));
				fileandevn.put("Username",promain.getProperty("Username"));
				fileandevn.put("Password",promain.getProperty("Password"));
				fileandevn.put("portno",promain.getProperty("portno"));
				
			}else if(environment.equalsIgnoreCase("staging"))
			{
				FileInputStream FisDev=new FileInputStream(System.getProperty("user.dir")+"/inputs/Div.properties");
				promain.load(FisDev);
				fileandevn.put("Serverurl",promain.getProperty("Serverurl"));
				fileandevn.put("Username",promain.getProperty("Username"));
				fileandevn.put("Password",promain.getProperty("Password"));
				fileandevn.put("portno",promain.getProperty("portno"));
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return fileandevn;
	}
	
	public static Map<String,String>getConfigReader()
	{
		if(fileandevn==null)
		{
			fileandevn=envAndFile();
		}
		return fileandevn;
		
	}
	
}
