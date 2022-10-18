package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class automation123 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();

		
		
		List<WebElement> Dates = driver.findElements(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]"));
		for(WebElement ele: Dates) 
		{
		String date = ele.getText();
		if(date.equalsIgnoreCase("29")) 
		{
		ele.click();
		break;
		}
		}
		Thread.sleep(5000);
		driver.close();
		
	}



	

}
