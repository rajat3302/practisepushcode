package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo
{

	public static void main(String[] args)
	{
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.opencart.com/");
    driver.manage().window().maximize();
    
    //gettext method is used to rerturn the text elemnet 
    String productname= driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
    System.out.println(productname);
    
    
	}

}
