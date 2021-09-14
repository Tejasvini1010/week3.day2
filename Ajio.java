package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(30);
		driver.findElement(By.xpath("//input[@id='Men']/parent::div/label")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/parent::div/label")).click();
		String quantity = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The total number of bags: " +quantity);
		
		Set<String> strSet = new  TreeSet<String>();
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		for (int i = 0; i < brandList.size(); i++) {
			strSet.add(brandList.get(i).getText());
		}
		System.out.println("The brandList: " +strSet);
		System.out.println("******************The bag names********************");
		List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='name']"));
		for (WebElement webElement : bagNameList) {
			String bagName = webElement.getText();
			System.out.println(bagName);
			
		}
		}
	}

