import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class LoginSevletTest {
	//declare Selenium WebDriver
	private WebDriver webDriver;
  @Test
  public void testLoginWithCorrectCredentials() {
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/login.jsp");
	  webDriver.findElement(By.name("email")).sendKeys("2002393C@student.tp.edu.sg");
	  webDriver.findElement(By.name("password")).sendKeys("123456");
	  webDriver.findElement(By.id("submitbtn")).submit();
	  Assert.assertEquals(webDriver.getCurrentUrl(), "http://localhost:8090/HelloWorldJavaEE/UserServlet/dashboard");
	  
  }
  
  @Test
  public void testLoginWithWrongEmail() {
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/login.jsp");
	  webDriver.findElement(By.name("email")).sendKeys("wrong@gmail.com");
	  webDriver.findElement(By.name("password")).sendKeys("12345");
	  webDriver.findElement(By.id("submitbtn")).submit();
	  Assert.assertEquals(webDriver.findElement(By.id("response")).getText(), "User does not exist");
  }
  
  @Test
  public void testLoginWithWrongPassword() {
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/login.jsp");
	  webDriver.findElement(By.name("email")).sendKeys("2002393C@student.tp.edu.sg");
	  webDriver.findElement(By.name("password")).sendKeys("wrong password");
	  webDriver.findElement(By.id("submitbtn")).submit();
	  Assert.assertEquals(webDriver.findElement(By.id("response")).getText(), "Either email or password is incorrect");
  }
  
  @BeforeTest
  public void beforeTest() {
	  String chromeDriverDir = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);
	  webDriver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  webDriver.quit();
  }

}
