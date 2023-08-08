package RbtPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public void readFile() throws IOException{
		Properties pro=new Properties();
		
		
		FileInputStream fis=new FileInputStream("D:\\sel\\details.properties");
	
	try{
		pro.load(fis);
		
		String val1=pro.getProperty("name");
		String val2=pro.getProperty("mobileNumber");
		
		System.out.println("value1 is:"+val1);
		System.out.println("value2 is:"+val2);

	}catch(IOException e){
	e.printStackTrace();
	}
	finally{
		fis.close();
	}
	}
	public static void main(String[] args) throws IOException {
		ReadPropertyFile rd=new ReadPropertyFile();
		rd.readFile();
		

	}

}
