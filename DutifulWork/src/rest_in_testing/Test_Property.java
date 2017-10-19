package rest_in_testing;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class Test_Property {
static	Properties properties;
	
public static void getLoad() throws IOException
{
	properties=new Properties();
	File file=new File("E:\\DailyJob\\DutifulWork\\src\\properties_work\test1.properties");
	FileReader obj=new FileReader(file);
	properties.load(obj);
	
}
public static String getObject(String data)
{
	String data1=properties.getProperty(data);
	return data1;
}
}
