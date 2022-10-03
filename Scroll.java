package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 for(int i=0;i<=5; i++)
		 {
			 Thread.sleep(3000);
			 js.executeScript("window.scrollBy(0.1000)");
		 }
		 for(int i=0;i<=5; i++) 
		 {
			 Thread.sleep(3000);
			 js.executeScript("windows.scrollBy(0,-1000)");
		 }
		}

	}


