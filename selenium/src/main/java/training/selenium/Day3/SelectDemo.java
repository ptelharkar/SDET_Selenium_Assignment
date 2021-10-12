package training.selenium.Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hello selenium");
    // 1.specify your webdriver path
    // FF=gecko
    // FirefoxDriver
    // IE=ie
    // InternetExplorerDriver
    System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\028165744\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
    WebDriver wd = new ChromeDriver();
    wd.manage().window().maximize();
   
    Thread.sleep(2000);
    // Navigating to URL
    wd.get("https://artoftesting.com/samplesiteforselenium");
    Thread.sleep(5000);
    WebElement selectDD = wd.findElement(By.id("testingDropdown"));
    Select sel = new Select(selectDD);
    sel.selectByIndex(2);//Manual Testing
    sel.selectByValue("Database");//Database by value
    sel.selectByVisibleText("Automation Testing");//Automation Testing by visible text
    List<WebElement> listSearch = sel.getOptions();
    for(WebElement we:listSearch) {
        System.out.println(we.getText());
        System.out.println(we.getAttribute("value"));
    }
    wd.quit();
    System.out.println("selenium Closed");
  }
}
