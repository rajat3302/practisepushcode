package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{

	public static void main(String[] args) 
	{
      
      WebDriver driver= new ChromeDriver();
      
      
      //open app
      
      driver.get("https://www.testingbaba.com/");
      driver.manage().window().maximize();
      
  
      driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
      driver.findElement(By.className("search")).sendKeys("Automation testing");
      
      // link tesxt
      
      driver.findElement(By.linkText("Course")).click();
      
      // finding no. of slider
      
      List<WebElement> sliders= driver.findElements(By.className(""));
      System.out.println("no.of sliders:"+sliders.size());
      
      // total no. of images in home page 
      
      List<WebElement> images = driver.findElements(By.tagName("img"));
      System.out.println("total no. of images:"+images.size());

	}

}
