package rest_in_testing;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class RestApiTest2
{

	
	public Response addCustomFolder(String userName, String password, String baseUrl, String caseName, String parentFlolderId, String level, String folderName, String folderType, String isLocked){
		Response response = RestAssured.given().
				header("Content-Type", "application/x-www-form-urlencoded").
				param("moduleName", "addCustomFolder").
				param("caseName", caseName).
				param("parentFolderId", parentFlolderId).
				param("level", level).
				param("folderName", folderName).
				param("folderType", folderType).
				param("isLocked", isLocked).
				authentication().preemptive().basic(userName, password)
					.when().post(baseUrl+"?addCustomFolder");
		
		return response;
	}
	
	/**
	 * 
	 * @param customFolderId
	 * @return
	 */
	public Response deleteCustomFolder(String userName, String password, String baseUrl, String caseName, String customFolderId){
		Response response = RestAssured.given().
				header("Content-Type", "application/x-www-form-urlencoded").
				param("moduleName", "deleteCustomFolder").
				param("caseName", caseName).
				param("customFolderId", customFolderId).
				authentication().preemptive().basic(userName, password)
					.when().post(baseUrl+"?deleteCustomFolder");
		
		return response;
	}

}


