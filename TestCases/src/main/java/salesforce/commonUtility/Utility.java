package salesforce.commonUtility;
import java.awt.Toolkit;



import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static salesforce.commonUtility .Constants.APPLICATION_PROPERTIES_PATH;
public class Utility {
	
	
/*public static  String  getPropertyValue1(String key) throws IOException{
		String path=Constants.APPLICATION_PROPERTIES_PATH;
		
		Properties ob = new Properties();
		FileInputStream fis =  new FileInputStream(new File("src/main/resources/data.properties"));
		ob.load(fis);

		String key1 = ob.getProperty("username");
		//System.out.println("username");
		return key1;}
	
		public static void main(String[] args) throws IOException {  
			//getPropertyValue1();
   // Utility e =new Utility();  
    System.out.println(Utility.getPropertyValue1("username"));  }
}
			
	


//public class GetFromProperties{
   /*public static String  getPropertyValue(String key) throws IOException{
		String path=Constants.APPLICATION_PROPERTIES_PATH;
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
             FileInputStream fileInputStream1  = new FileInputStream("src/main/resources/data.properties");
            properties.load(fileInputStream1);
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            
            System.out.println("from properties file: " + username);
            System.out.println("from properties file: " + password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return key;
    }}*/
	/*public static String  getPropertyValue(String Key) {
		String path=Constants.APPLICATION_PROPERTIES_PATH;
	

		Properties properties = new Properties();
		//String filePath = APPLICATION_PROPERTIES_PATH;

		FileInputStream inputfile = null;
		try {
			inputfile = new FileInputStream("src/main/resources/data.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String value = null;

		try {
			try {
				properties.load(inputfile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			value = properties.getProperty("username");
			System.out.println("Property we got from the file is::" + value);
		} finally {
			try {
				inputfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return value;
	}}*/
public static String getApplicationProperty(String Key) {

	Properties properties = new Properties();
	String filePath = APPLICATION_PROPERTIES_PATH;

	FileInputStream inputfile = null;
	try {
		inputfile = new FileInputStream(filePath);
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}
	String value = null;

	try {
		try {
			properties.load(inputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		value = properties.getProperty(Key);
		System.out.println("Property we got from the file is::" + value);
	} finally {
		try {
			inputfile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	return value;}

public static void setClipboardData(String path) {
	// StringSelection is a class that can be used for copy and paste operations.
	StringSelection stringSelection = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
}
}
