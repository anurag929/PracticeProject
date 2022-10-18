package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img")).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		ArrayList<String> al =new ArrayList<>(allwindows);
		System.out.println(al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			driver.switchTo().window(al.get(i));
			String title= driver.getTitle();
		
				System.out.println(al.get(i));
				System.out.println(title);
				driver.switchTo().window(al.get(i));
				
			
			
			
		}
		driver.switchTo().window(al.get(1));
		Thread.sleep(3000);
		driver.close();

	}

}
