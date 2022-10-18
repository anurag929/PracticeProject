package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class daytime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.xpath("//input[@id=\"datePickerMonthYearInput\"]")).click();
	    driver.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click();
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[45]")).click();
		Thread.sleep(3000);




	}

}
