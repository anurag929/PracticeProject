package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoVote {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();

		
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		day.selectByIndex(2);
		  //Get all options
	    List<WebElement> dd = day.getOptions();

	    //Get the length
	    System.out.println(dd.size());

	    // Loop to print one by one
	    for (int j = 0; j < dd.size(); j++)
	    {
	        System.out.println(dd.get(j).getText());

	    }

	}

}
