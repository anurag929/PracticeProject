package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MutiBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		String parent = driver.getWindowHandle();
		
		

		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		ArrayList<String> al =new ArrayList<>(allwindows);
		System.out.println(al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			driver.switchTo().window(al.get(i));
			String title= driver.getTitle();
			if(title.contains("Time Tracking"))
			{
				driver.switchTo().window(al.get(i));
				System.out.println(al.get(i));
				System.out.println(title);
			}
			
			
		}
		driver.switchTo().window(al.get(1));
		Thread.sleep(3000);
		driver.close();
	}
}
