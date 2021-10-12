package training.selenium.Day3;

import org.testng.annotations.Test;

public class TestNG_1 {
	@Test(dependsOnMethods="testMethod2")
	public void testMethod1() {
		System.out.println("Inside My Test ng method testMethod 1 ");
	}
	
	@Test()
	public void testMethod2() {
		System.out.println("Inside My Test ng method testMethod 2");
	}

	@Test(priority = 1)
	public void testMethod3() {
		System.out.println("Inside My Test ng method testMethod 3");
	}
	/*
	 * @BeforeSuite public void beforeSuite() {
	 * System.out.println("Inside Before Suite"); }
	 * 
	 * @AfterSuite public void afterSuite() {
	 * System.out.println("Inside After Suite"); }
	 * 
	 * @BeforeTest public void beforeTest() {
	 * System.out.println("Inside Before Test"); }
	 * 
	 * @AfterTest public void afterTest() { System.out.println("Inside After Test");
	 * }
	 * 
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("Inside Before Class"); }
	 * 
	 * @AfterClass public void afterClass() {
	 * System.out.println("Inside After Class"); }
	 * 
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("Inside Before Method"); }
	 * 
	 * @AfterMethod public void afterMethod() {
	 * System.out.println("Inside After Method"); }
	 */	
	
}
