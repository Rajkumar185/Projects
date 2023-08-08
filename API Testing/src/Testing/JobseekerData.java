package Testing;

public class JobseekerData {
	
	static String username;
	static String password;
	static String email;
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
		
		username="JobSeeker23";
		password="JobSeeker23";
		email="JobSeeker23@gmail.com";
		
		return "{\r\n"
				+ "    \"username\": \""+username+"\",\r\n"
				+ "    \"email\": \""+email+"\",\r\n"
				+ "    \"password\": \""+password+"\"\r\n"
				+ "}\r\n"
				+ "";
	}

public static String addJobseekerSigninData() {
		
	return " {\r\n"
	+ "    \"username\": \""+username+"\",\r\n"
	+ "    \"password\": \""+password+"\"\r\n"
	+ "}\r\n"
	+ "";
		
	}
	public static String updateJobseekerData() {
		JobseekerCRUD jc=new JobseekerCRUD();
		return " {\r\n"
				+ "    \"jobSeekerId\": \""+jc.getJobSeekerId()+"\",\r\n"
				+ "    \"firstName\": \"Anil\",\r\n"
				+ "    \"lastName\": \"kumar\",\r\n"
				+ "    \"userName\": \"AnilKumar\",\r\n"
				+ "    \"mobileNumber\": \"9876543210\",\r\n"
				+ "    \"email\": \""+email+"\",\r\n"
				+ "    \"qualification\": \"Btech\",\r\n"
				+ "    \"skillSet\": \"java\",\r\n"
				+ "    \"experience\": \"2years\",\r\n"
				+ "    \"summary\": \"Hardworking\",\r\n"
				+ "    \"address\": \"Warangal\"\r\n"
				+ "}\r\n"
				+ "";
	}

}
