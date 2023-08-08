package Testing;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import jobseekerApi.JobseekerCRUD;
import jobserviceApi.JobserviceCRUD;

import static io.restassured.RestAssured.given;

public class ApplicationCRUD {
	
	public String getApplicationId() {
		return ApplicationId;
	}

	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}

	String ApplicationId;
	
	public static void main(String[] args) {
		
		JobserviceCRUD jobService=new JobserviceCRUD();
		String Jobid1=jobService.fun();
		
		JobseekerCRUD jc1=new JobseekerCRUD();
		
		
		System.out.println(JobseekerCRUD.jobSeekerId);
		

        //To apply for job using Post method
         String Applyjob=given().log().all().header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"jobSeekerId\": \""+jc1.getJobSeekerId()+"\",\r\n"
				+ "    \"jobId\": \""+Jobid1+"\"\r\n"
				+ "}\r\\n"
				+ "").when().post("http://localhost:8020/jobservice/jobseeker/apply/")
		.then().assertThat().statusCode(200)
		.header("Connection","close").extract().response().asString();
		System.out.println(Applyjob);
		JsonPath js=new JsonPath(Applyjob);
		String ApplicationId=js.getString("id");
		System.out.println(ApplicationId);
         
         //To get the past applications of a Jobseeker using Get Method
        String GetPastApplication=given().log().all().header("Content-Type","application/json")
 		.when().get("http://localhost:8020/jobservice/jobseeker/applications/"+jc1.getJobSeekerId())
 		.then().assertThat().statusCode(200).extract().response().asString();;
        System.out.println(GetPastApplication);

		//To get all the applications using Get Method
        String AllApplications=given().log().all().header("Content-Type","application/json")
         		.when().get("http://localhost:8020/jobservice/applications")
         		.then().assertThat().statusCode(200).extract().response().asString();;
                System.out.println(AllApplications);
		
	}

}
