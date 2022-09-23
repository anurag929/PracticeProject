package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");


		
	    List<WebElement> dd = driver.findElements(By.tagName("a"));
	   
	    System.out.println("Number of links = "+dd.size());
	    for(int i=0;i<dd.size();i++)
	    {
	    	WebElement a = dd.get(i);
	    	System.out.println(a.getText());	
	    }		
	}

}
