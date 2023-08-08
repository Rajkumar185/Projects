package Testing;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class JobserviceCRUD {

	
	public JobserviceCRUD(String jobId) {
		super();
		this.jobId = jobId;
	}
	
	String jobId;
	
	public String fun()
	{
		RestAssured.baseURI="http://localhost:8020/";
	
    //  To post a new job using Post method
    String PostNewJob= given().log().all().header("Content-Type","application/json")
	.body(JobserviceData.addData()).when().post("jobservice/recruiter/jobpost")
	.then().assertThat().statusCode(200)
	.extract().response().asString();
	System.out.println(PostNewJob);
	
	JsonPath js=new JsonPath(PostNewJob);
	String Jobid1=js.getString("jobId");
	System.out.println(Jobid1);
  return Jobid1;
}
	public static void main(String[] args) {
	
//	RestAssured.baseURI="http://localhost:8020/";
//    //  To post a new job using Post method
//    String PostNewJob= given().log().all().header("Content-Type","application/json")
//	.body(JobserviceData.addData()).when().post("jobservice/recruiter/jobpost")
//	.then().assertThat().statusCode(200)
//	.extract().response().asString();
//	System.out.println(PostNewJob);
	// JsonPath js=new JsonPath(PostNewJob);//for parsing json
	
	 //JobserviceCURD jobService=new JobserviceCURD();
	 //jobService.Jobid1=Jobid1;
	//String Jobid1=js.getString("jobId");
	//System.out.println(Jobid1);
     
//	JobserviceCURD jobService=new JobserviceCURD(Jobid1);
//	public JobserviceCURD getJobId() {
//		return jobService;
//	}
//	
		JobserviceCRUD jobService=new JobserviceCRUD();
		String Jobid1=jobService.fun();
		
		
     //To get a specific Job by Id using Get Method
    String JobId=given().log().all().header("Content-Type","application/json")
		.when().get("jobservice/job/" + Jobid1)
		.then().assertThat().statusCode(200).extract().response().asString();;
    System.out.println(JobId);
    
    //To get all the jobs using Get method
    String AllJobs=given().log().all().header("Content-Type","application/json")
		.when().get("jobservice/alljobs")
		.then().assertThat().statusCode(200).extract().response().asString();;
    System.out.println(AllJobs);
            
        //To update a Job using put Method
        String UpdateJob= given().log().all().header("Content-Type","application/json")
        		.body(JobserviceData.updateData()).when().put("jobservice/recruiter/updatejobpost/" + Jobid1)
        		.then().assertThat().statusCode(200)
        		.extract().response().asString();
        		System.out.println(UpdateJob);
        	     
        		//To delete a job by it's Id using Delete Method
//        	    String DeleteJob=given().log().all().header("Content-Type","application/json")
//        	    		.when().delete("jobservice/recruiter/deletejobpost/" + Jobid1)
//        	    		.then().assertThat().statusCode(200).extract().response().asString();;
//        	        System.out.println(DeleteJob);

    
    

	}
	public JobserviceCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}
}
