package Temp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookTest1 {
	@Test
	public void Facebook() {
		System.out.println("From Two Test cases - Google");
		String projectpath = System.getProperty("user.dir");
		System.out.println("Path"+projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
//		Click to login button
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
}
