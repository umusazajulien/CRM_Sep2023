package variousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	 WebDriver driver;
	 
	 @BeforeClass
	 public static void beforeClass() {
		 
		 System.out.println("before class");
	 }

	 @AfterClass
	 public static void afterClass() {
		 
		 System.out.println("after class");
	 }

	 @Before
	public  void init() {
		// set up system property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Julien\\Sep2023_Selenium\\crm\\driver\\chromedriver.exe");

		// object to evoke browser
		 driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();

		// go to web browser
		driver.get("https://techfios.com/billing/?ng=admin/");
		// maximize
		driver.manage().window().maximize();
		
		
	}
	
	@Test
public  void loginTest() {
	// insert username
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	// insert password
	driver.findElement(By.id("password")).sendKeys("abc123");
	// click sign in button
	driver.findElement(By.name("login")).click();
		
		
	}

//@Test	
public  void negLoginTest() {
	// insert username
	driver.findElement(By.id("username")).sendKeys("demo@techfios32312.com");
	// insert password
	driver.findElement(By.id("password1")).sendKeys("abc123");
	// click sign in button
	driver.findElement(By.name("login")).click();
}

@After
public  void tearDown() {
	// close browser
	driver.close();
	
	
}

}
