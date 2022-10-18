package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ANURAG\\\\Downloads\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/tools/forex");
	//WebElement Frame1 = driver.findElement(By.xpath("/html/body/iframe[1]"));
	//driver.switchTo().frame(Frame1);
	List<WebElement> Rowelements =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr"));
	System.out.println(Rowelements.size());
	int row =Rowelements.size();
	List<WebElement> Collelements =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr/td"));
	System.out.println(Collelements.size());
	int col =Collelements.size();	
	 
	for (int i=1;i<=row;i++)
	{
		for (int j=1;j<=2;j++)
		{  
			
				
		      System.out.println(	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			
			
		}
		System.out.println();
	}
		
	driver.quit();
	}

}
