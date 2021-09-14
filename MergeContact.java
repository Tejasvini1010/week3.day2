package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title1 = "My Home | opentaps CRM";
		String hometitle = driver.getTitle();
		if (title1.equals(hometitle))
			System.out.println("In home page");
		else
			System.out.println("Not in home page");
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
		/*
		 * Set<String> windowHandles1 = driver.getWindowHandles(); List<String>
		 * windowHandlesList1 = new ArrayList<String>(windowHandles1);
		 * driver.switchTo().window(windowHandlesList1.get(1));
		 * driver.findElement(By.xpath(
		 * "//table[@class='x-grid3-row-table']/tbody/tr/td[2]/div/a")).click();
		 * 
		 */
		 
	}

}
