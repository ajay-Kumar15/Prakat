package rest_in_testing;


	

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Properties;

	public class BaseClass {

		String userName;
		String password;
		String baseUrl;
		String caseName;
		public BaseClass()
		{
		    FileReader reader = null;
			try {
				reader = new FileReader("config.properites");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
		      
		    Properties p=new Properties();  
		    try {
				p.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		        
		    userName = p.getProperty("username");
		    password = p.getProperty("password");
		    baseUrl =  p.getProperty("baseUrl");
		    caseName = p.getProperty("caseName");
		}

		public String getUserName() {
			return userName;
		}

		public String getPassword() {
			return password;
		}

		public String getBaseUrl() {
			return baseUrl;
		}

		public String getCaseName() {
			return caseName;
		}

	}



