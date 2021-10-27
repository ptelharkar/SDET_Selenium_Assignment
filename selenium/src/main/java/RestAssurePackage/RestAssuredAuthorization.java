package RestAssurePackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredAuthorization {
	static String accessToken;
	@Test
	public void main() throws JsonParseException, JsonMappingException, IOException {
		PropertyConfigurator.configure("C:\\Users\\028165744\\git\\SDET\\selenium\\src\\log4j.peoperties");
		Logger log=Logger.getLogger("devpinoyLogger");
		log.info("started");
		String sRemove="<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";
		Response resp=RestAssured
						//GIVEN
							.given()
								.baseUri("http://rest-api.upskills.in/api/rest_admin/oauth2/token/client_credentials")
								.accept(ContentType.JSON)
								.header("Authorization","Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=")
						//WHEN
							.when()
								.post();
		String sBody=resp.body().asString();
		sBody=sBody.replace(sRemove, "");
		log.info(sBody);
		ObjectMapper obj = new ObjectMapper();
		ResToken token= obj.readValue(sBody, ResToken.class);
		accessToken = token.data.access_token;
		log.info(accessToken);
		OutputStream output = new FileOutputStream("C:\\Users\\028165744\\git\\SDET\\selenium\\TestData\\accesstoken.properties");
		Properties prop = new Properties();
		prop.setProperty("aToken", accessToken);
		prop.store(output, "");
					
		log.debug("ended");
	}
}