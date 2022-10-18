package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class allmouse {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://countrycode.org/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	  //  WebElement button =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
	   // Actions act = new Actions(driver);
	   /*act.contextClick(button).perform();*/
	 //   act.doubleClick(button).perform();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	  //  js.executeScript("window.scrollBy(0,1000)", "");
	  //  WebElement cntry =driver.findElement(By.xpath("(//a[@href=\"/india\"])[1]"));
	   // js.executeScript("arguments[0].scrollIntoView()",cntry);
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    

		
	}

}
