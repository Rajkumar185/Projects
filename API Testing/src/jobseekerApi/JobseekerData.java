package jobseekerApi;

public class JobseekerData {
	
	static String username="user91";
	static String password="user091";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	
	public static String addSignUpData() {
		
		
		return "{\r\n"
				+ "    \"username\": \""+username+"\",\r\n"
				+ "    \"email\": \"user091@gmail.com\",\r\n"
				+ "    \"password\": \""+password+"\"\r\n"
				+ "}\r\n"
				+ "";
	}

public  String addSigninData() {
		
		return "{\r\n"
				+ "    \"Username\": \""+username+"\",\r\n"
				+ "    \"Password\": \""+password+"\"\r\n"
				+ "}\r\n"
				+ "";
		
	}
	public static String updateData() {
		JobseekerCRUD jc=new JobseekerCRUD();
		return " {\r\n"
				+ "    \"jobSeekerId\": \""+jc.getJobSeekerId()+"\",\r\n"
				+ "    \"firstName\": \"Rajkumar\",\r\n"
				+ "    \"lastName\": \"pittala\",\r\n"
				+ "    \"userName\": \"RajkumarPittala\",\r\n"
				+ "    \"mobileNumber\": \"9876543210\",\r\n"
				+ "    \"email\": \"pittalarajkumar185@gmail.com\",\r\n"
				+ "    \"qualification\": \"Btech\",\r\n"
				+ "    \"skillSet\": \"Sdet\",\r\n"
				+ "    \"experience\": \"2  years\",\r\n"
				+ "    \"summary\": \"Hard working\",\r\n"
				+ "    \"address\": \"Hyderabad\"\r\n"
				+ "}\r\n"
				+ "";
	}

}
