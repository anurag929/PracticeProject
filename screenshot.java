package Practice;

import java.io.File;

import org.apache.commons.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");	
		
		File file = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File trg =new File("C:\\Users\\ANURAG\\Pictures\\Screenshots\\lol.png");
		FileUtils.copyFile(file,trg);
	}

}
