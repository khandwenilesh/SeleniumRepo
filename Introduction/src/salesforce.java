import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hello");  --- csss
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[contains(@id ,'order')]")).sendKeys(("	1257945872"));
		

		
		//driver.findElement(By.id("username")).sendKeys("Hello");
		
		//driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("nilesh");
		
		
	}

}
