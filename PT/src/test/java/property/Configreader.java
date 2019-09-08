package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader 
{
	
	Properties OR;
	
	FileInputStream fis;
	
	File src;
	
	public Configreader() throws IOException
	{
          OR = new Properties();
		
		src = new File("./Resources/OR.properties");
		
		fis = new FileInputStream(src);
		
		OR.load(fis);
	}





public String GetApplicatonURL()
{
	
	return 	OR.getProperty("URL");
	

	
}
}