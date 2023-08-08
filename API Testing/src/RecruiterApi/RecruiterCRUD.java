package RecruiterApi;

import static io.restassured.RestAssured.given;

import ApplicationApi.ApplicationCRUD;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class RecruiterCRUD {
	public static String RecruiterId;
	public static String getRecruiterId() {
		return RecruiterId;
	}
	public static void setRecruiterId(String recruiterId) {
		RecruiterId = recruiterId;
	}
     
	public static void main(String[] args) {
		//String RecruiterId;
		RecruiterData rd=new RecruiterData();
		
		ApplicationCRUD Api=new ApplicationCRUD();
		
	//RestAssured.baseURI="http://localhost:7171/";
	//Signup
	String SignUp= given().log().all().header("Content-Type","application/json")
						.body(rd.addSignUpData()).when().post("http://localhost:7171/api/auth/recruiter/signup")
						.then().assertThat().statusCode(200)
						.extract().response().asString();
						System.out.println(SignUp);
						JsonPath js=new JsonPath(SignUp);//for parsing json
						String RecruiterIdd=js.getString("recruiterId");
						RecruiterId = RecruiterIdd;
						System.out.println(RecruiterId);
	 //SignIn
	 String SignIn= given().log().all().header("Content-Type","application/json")
						.body(rd.addSigninData()).when().post("http://localhost:7171/api/auth/recruiter/signin")
						.then().assertThat().statusCode(200)
						.extract().response().asString();
						System.out.println(SignIn);
						
	 //To update the profile of recruiter
	 String Updateprofile= given().log().all().header("Content-Type","application/json")
					.body(rd.updateData()).when().put("http://localhost:7673/recruiter/updateprofile")
				    .then().assertThat().statusCode(200)
				    .extract().response().asString();
					 System.out.println(Updateprofile);
	 //For getting all the recruiters
     String AllRecruiter=given().log().all().header("Content-Type","application/json")
					.when().get("http://localhost:7673/recruiter/all")
					.then().assertThat().statusCode(200).extract().response().asString();
					System.out.println(AllRecruiter);
	 //For getting a recruiter by his name
	 String RecruiterName=given().log().all().header("Content-Type","application/json")
					.when().get("http://localhost:7673/recruiter/"+rd.getUsername())
					.then().assertThat().statusCode(200).extract().response().asString();;
			    	 System.out.println(RecruiterName);
//	 //delete recruiter by name
//	 String DeleteRecruiter=given().log().all().header("Content-Type","application/json")
//					.when().delete("http://localhost:7673/recruiter/delete/"+rd.getUsername())
//					.then().assertThat().statusCode(200).extract().response().asString();;
//					 System.out.println(DeleteRecruiter);
     //To get the applicants of a recruiter
//	 String RecruiterApplicants=given().log().all().header("Content-Type","application/json")
//					.when().get("http://localhost:8020/jobservice/recruiter/applications/"+RecruiterId)
//					.then().assertThat().statusCode(200).extract().response().asString();;
//				    System.out.println(RecruiterApplicants);
     //To accept the application
//     String AcceptApplication= given().log().all().header("Content-Type","application/json")
//					 .when().put("http://localhost:8020/jobservice/recruiter/application/accept/"+Api.getApplicationId())
//					.then().assertThat().statusCode(200)
//					  .extract().response().asString();
//					  System.out.println(AcceptApplication);
//     //To Reject the application
//     String RejectApplication= given().log().all().header("Content-Type","application/json")
//					 .when().put("http://localhost:8020/jobservice/recruiter/application/reject/"+Api.getApplicationId())
//			   		.then().assertThat().statusCode(200)
//				    .extract().response().asString();
//				     System.out.println(RejectApplication);		  
							    
	}

}
