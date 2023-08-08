package jobserviceApi;

import RecruiterApi.RecruiterCRUD;

public class JobserviceData {
	public static String addData() {
		
		RecruiterCRUD rc=new RecruiterCRUD();
		
		
		return "{\"jobTitle\" :  \"Java full stack developer\",\r\n"
				+ "\"jobDescription\": \"Expected to have knowledge on both frontend and backend technologies\",\r\n"
				+ "\"location\": \"Hyderabad\",\r\n"
				+ "\"jobType\": \"Full type\",\r\n"
				+ "\"experience\": \"2 years\",\r\n"
				+ "\"salary\": \"10LPA\",\r\n"
				+ "\"qualification\": \"Btech\",\r\n"
				+ "\"vacancies\": \"30\",\r\n"
				+ "\"recruiterId\": \""+rc.getRecruiterId()+"\",\r\n"
				+ "\"companyName\": \"Persistent\"\r\n"
				+ "}\r\n"
				+ "";
		
	}
	public static String updateData() {
		
		return "{\r\n"
				+ "    \"jobTitle\": \"React developer\",\r\n"
				+ "    \"jobDescription\": \"Expected to have knowledge on both frontend and backend technologies\",\r\n"
				+ "    \"location\": \"Hyderabad\",\r\n"
				+ "    \"jobType\": \"Full type\"\r\n"
				+ "}\r\n"
				+ "";
		
	}

}
