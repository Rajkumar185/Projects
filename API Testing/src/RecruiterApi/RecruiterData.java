package RecruiterApi;

public class RecruiterData {
	
	static String username;
	static String password;
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
		
		
		username="kumar123";
		password="kumar123";
		
		
		return " {\r\n"
				+ "    \"username\": \""+username+"\",\r\n"
				+ "    \"email\": \"kumar123@gmail.com\",\r\n"
				+ "    \"password\": \""+password+"\"\r\n"
				+ "}\r\n"
				+ "";
	}
//	public static String addSigninData() {
//		
//		return " {\r\n"
//				+ "    \"username\": \"Vijaykumar123\",\r\n"
//				+ "    \"password\": \"Vijaykumar123\"\r\n"
//				+ "}\r\n"
//				+ "";
//		
//	}
public static String addSigninData() {
		
		return " {\r\n"
				+ "    \"username\": \""+username+"\",\r\n"
				+ "    \"password\": \""+password+"\"\r\n"
				+ "}\r\n"
				+ "";
		
	}
	public  String updateData() {
		RecruiterCRUD rc=new RecruiterCRUD();
		System.out.println(rc.getRecruiterId()+"--"+RecruiterCRUD.getRecruiterId());
		return " {\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    \"recruiterId\":\""+rc.getRecruiterId()+"\",\r\n"
				+ "    \"firstName\": \"Rajkumar\",\r\n"
				+ "    \"lastName\": \"Pittala\",\r\n"
				+ "    \"mobileNumber\": \"9876543210\",\r\n"
				+ "    \"userName\": \""+username+"\"\r\n"
				+ "}\r\n"
				+ "";
	}

}
