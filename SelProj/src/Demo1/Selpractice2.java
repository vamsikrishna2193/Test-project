package Demo1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;  
  
public class Selpractice2 {
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ABC//Desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		// Handling alerts
	
		//driver.manage().deleteAllCookies();
/*		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Hyd");
		List<WebElement> wb= driver.findElement(By.className("autoComplete")).findElements(By.tagName("li"));
		System.out.println(wb.size()); 
		for (int i = 0; i <wb.size(); i++) 
		 {
			 String str=wb.get(i).getText();
			System.out.println(str);          
			  
		} */
		
	/*	driver.get("https://www.facebook.com");(D)
	
		Select slct=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement> month=slct.getOptions();
		System.out.println(month.size());
		slct.selectByVisibleText("Sept");
		
		Select slct1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		List<WebElement> day=slct1.getOptions();
		System.out.println(day.size());
		*/
// BootstrapDropdownORjQueryDropdown(D)--how to slct individual checkboxes and print all checkboxes//
		
	/*	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
		List<WebElement> bslist = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//li//a//label//input[@type = 'checkbox']"));
		for (int i = 0; i < bslist.size(); i++)
	{
			if (!bslist.get(i).isSelected())
			{
				bslist.get(i).click();  */
	//BrokEN url's
	/*	driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			String url = links.get(i).getAttribute("href");
			HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
			http.connect();
			String msg = http.getResponseMessage();
			http.disconnect();
			System.out.println(url+" ---> "+msg);
		}   */
		
	/*	driver.get("http://toolsqa.com/iframe-practice-page/");
		 
		 //Switch by Index
		Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 driver.quit(); */
		
	/*	driver.navigate().to("http://www.SoftwareTestingMaterial.com");

        System.out.println(driver.manage().window().getSize());

        //Create object of Dimensions class

        Dimension d = new Dimension(480,620);

        //Resize the current window to the given dimension

        driver.manage().window().setSize(d);

        System.out.println(driver.manage().window().getSize()); */
		driver.get("www.google.com");

     } 


	}


