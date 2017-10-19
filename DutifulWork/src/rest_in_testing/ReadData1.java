package rest_in_testing;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadData1 extends Test_Property {

	
	@BeforeClass
	public void init()
	{
	}
	@Test
	public static void getdata()
	{
		String str=Test_Property.getObject("username");
		System.out.println(str);
		String str1=Test_Property.getObject("username");
		System.out.println(str1);
	}
}
