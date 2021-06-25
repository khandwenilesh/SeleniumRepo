import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		/* driver.findElement(By.id("email")).sendKeys("khandwenilesh@gmail.com"); 
		driver.findElement(By.name("pass")).sendKeys("November2013");
		
		driver.findElement(By.name("login")).click();  */
		
		//Thread.sleep(4000);
		//driver.get("http://www.yahoo.com");
		//driver.navigate().back();
		
		//driver.close();
		//driver.quit();
		
		
		//System.out.println(driver.getPageSource());
	}

}
