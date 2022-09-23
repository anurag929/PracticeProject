package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
	
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
	    String found="";

	    // Loop to print one by one
	    for (int j = 0; j < dd.size(); j++)
	    {
	        System.out.println(dd.get(j).getText());
	        
			String listitems = dd.get(j).getText();
	        if(listitems.equalsIgnoreCase("29"))
	        {
	        	found = listitems;
	        dd.get(j).click();
	        
	        }


	    }
	    System.out.println("Found at "+found);

	
	
	}
 
}
