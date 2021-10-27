package RestAssurePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

public class getCustomerDetails {
	@Test
	public void main() throws JsonParseException, JsonMappingException, IOException {
		PropertyConfigurator.configure("C:\\Users\\028165744\\git\\SDET\\selenium\\src\\log4j.peoperties");
		Logger log=Logger.getLogger("devpinoyLogger");
		log.info("started");
		Properties prop = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\028165744\\git\\SDET\\selenium\\TestData\\accesstoken.properties");
		prop.load(input);
		String respToken = prop.getProperty("aToken");
		Response resp=RestAssured
						//GIVEN
							.given()
								.baseUri("http://rest-api.upskills.in/api/rest_admin/customergroups/limit/6/page/1")
								.accept(ContentType.JSON)
								.contentType(ContentType.JSON)
								.header("Authorization","Bearer "+respToken)
								
						//WHEN
							.when()
								.get();
		String sBody=resp.body().asString();
		log.info(sBody);
		log.debug("ended");
	}
}
