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
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddCustomer {
	@Test
	public void main() throws JsonParseException, JsonMappingException, IOException {
		PropertyConfigurator.configure("C:\\Users\\028165744\\git\\SDET\\selenium\\src\\log4j.peoperties");
		Logger log=Logger.getLogger("devpinoyLogger");
		log.info("started");
		File custDataFile= new File ("C:\\Users\\028165744\\git\\SDET\\selenium\\TestData\\Customer.json");
		Properties prop = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\028165744\\git\\SDET\\selenium\\TestData\\accesstoken.properties");
		prop.load(input);
		String respToken = prop.getProperty("aToken");
		Response resp=RestAssured
						//GIVEN
							.given()
								.baseUri("http://rest-api.upskills.in/api/rest_admin/customers")
								.accept(ContentType.JSON)
								.contentType(ContentType.JSON)
								.header("Authorization","Bearer "+respToken)
								.body(custDataFile)
						//WHEN
							.when()
								.post();
		String sBody=resp.body().asString();
		log.info(sBody);
		log.debug("ended");
	}
}
