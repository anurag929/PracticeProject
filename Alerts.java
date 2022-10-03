package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String alertMsg = driver.switchTo().alert().getText();
		System.out.print(alertMsg);
		Thread.sleep(3000);
		alert.accept();
		driver.quit();
		
		
	

	}

}
