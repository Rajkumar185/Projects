package Testing;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import jobserviceApi.JobserviceData;

public class JobseekerCRUD {
	
	public static String jobSeekerId;
	public static String getJobSeekerId() {
		return jobSeekerId;
	}

	public static void setJobSeekerId(String jobSeekerId) {
		jobSeekerId = jobSeekerId;
	}
	public static void main(String[] args) {
		
		JobseekerData jd=new JobseekerData();
		
		
	// signup using Post Method
	String Signup= given().log().all().header("Content-Type","application/json")
		.body(jd.addSignUpData()).when().post("http://localhost:7171/api/auth/signup")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println(Signup);
		JsonPath js=new JsonPath(Signup);//for parsing json
		String JobSeekerIds=js.getString("jobSeekerId");
		jobSeekerId=JobSeekerIds;
		System.out.println(jobSeekerId);
		
	//Sign in using Post Method
		String JobseekerSignIn= given().log().all().header("Content-Type","application/json")
				.body(jd.addJobseekerSigninData()).when().post("http://localhost:7171/api/auth/signin")
				.then().assertThat().statusCode(200)
				.extract().response().asString();
				System.out.println(JobseekerSignIn);
				
				//To update the profile using Put Method
				
				 String Updateprofile= given().log().all().header("Content-Type","application/json")
							.body(jd.updateJobseekerData()).when().put("http://localhost:7672/jobseeker/updateprofile")
						    .then().assertThat().statusCode(200)
						    .extract().response().asString();
							 System.out.println(Updateprofile);
		
					
	//For Getting all the Job seekers using Get Method
	String AllJobs=given().log().all().header("Content-Type","application/json")
					.when().get("http://localhost:7672/jobseeker/all")
					.then().assertThat().statusCode(200).extract().response().asString();
				   System.out.println(AllJobs);
	    
	//Job seeker by his name using Get Method
//	String JobSeekerName=given().log().all().header("Content-Type","application/json")
//					.when().get("http://localhost:7672/jobseeker/"+jd.getUsername())
//					.then().assertThat().statusCode(200).extract().response().asString();
//					 System.out.println(JobSeekerName);
		
					    //To update the profile using Put Method
//	String UpdateJobseekerProfile= given().log().all().header("Content-Type","application/json")
//					  .body(jd.updateJobseekerData()).when().put("http://localhost:7672/jobseeker/updateprofile")
//					  .then().assertThat().statusCode(200)
//					  .extract().response().asString();
//					  System.out.println(UpdateJobseekerProfile);
	
					        		
    
					        		
	//delete user by name using Delete Method		        		
//	 String DeleteUser=given().log().all().header("Content-Type","application/json")
//					.when().delete("http://localhost:7672/jobseeker/delete/"+jd.getUsername())
//					.then().assertThat().statusCode(200).extract().response().asString();
//					 System.out.println(DeleteUser);
	}

}
