package jobseekerApi;

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
    String SignIn= given().log().all().header("Content-Type","application/json")
					.body(jd.addSigninData()).when().post("http://localhost:7171/api/auth/signin")
					.then().assertThat().statusCode(400)
					.extract().response().asString();
					System.out.println(SignIn);
					
	//For Getting all the Job seekers using Get Method
	String AllJobs=given().log().all().header("Content-Type","application/json")
					.when().get("http://localhost:7672/jobseeker/all")
					.then().assertThat().statusCode(200).extract().response().asString();;
				   System.out.println(AllJobs);
	    
	//Job seeker by his name using Get Method
	String Job=given().log().all().header("Content-Type","application/json")
					.when().get("http://localhost:7672/jobseeker/"+jd.getUsername())
					.then().assertThat().statusCode(200).extract().response().asString();;
					 System.out.println(Job);
		
						    
    //To update the profile using Put Method
	String UpdateProfile= given().log().all().header("Content-Type","application/json")
					  .body(jd.updateData()).when().put("http://localhost:7672/jobseeker/updateprofile")
					  .then().assertThat().statusCode(200)
					  .extract().response().asString();
					  System.out.println(UpdateProfile);
					        		
    
					        		
	//delete user by name using Delete Method		        		
//	 String DeleteUser=given().log().all().header("Content-Type","application/json")
//					.when().delete("http://localhost:7672/jobseeker/delete/"+jd.getUsername())
//					.then().assertThat().statusCode(200).extract().response().asString();
//					 System.out.println(DeleteUser);
	}

}
