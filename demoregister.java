package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoregister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/register\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Anurag");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Mohanty");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Suman1029@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Anurag029@");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Anurag029@");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"poll-block-1\"]/ul/li[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"vote-poll-1\"]")).click();

	}

}
