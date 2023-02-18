package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		init();
		loginTest();
		tearDown();
		
		init();
		negLoginTest();
		tearDown();
		
		
		
		
		
		
		
		
	}
	
	public static void init() {
		// set up system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Julien\\Sep2023_Selenium\\crm\\driver\\chromedriver.exe");

		// object to evoke browser
		 driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();

		// go to web browser
		driver.get("https://techfios.com/billing/?ng=admin/");
		// maximize
		driver.manage().window().maximize();
		
		
	}
	
public static void loginTest() {
	// insert username
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	// insert password
	driver.findElement(By.id("password")).sendKeys("abc123");
	// click sign in button
	driver.findElement(By.name("login")).click();
		
		
	}

public static void negLoginTest() {
	// insert username
	driver.findElement(By.id("username")).sendKeys("demo@techfios32312.com");
	// insert password
	driver.findElement(By.id("password")).sendKeys("abc123");
	// click sign in button
	driver.findElement(By.name("login")).click();
}
public static void tearDown() {
	// close browser
	driver.close();
	
	
}

}
