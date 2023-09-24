package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathpractise 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		// self select the current node 
		
		String text=driver.findElement(By.xpath("//a[contains(text(),'Paras Defence')]")).getText();
		System.out.println("self:"+text);// Paras defence 
		
		//Parent - Selects the parent of the current node (always One)
		
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Paras Defence')]/parent::td")).getText(); 
		System.out.println("parenttext:"+text1);// print paras defence bcoz parent have no text 
		
		

		//Child - Selects all children of the current node (One or many)
		
	List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Paras Defence')]/ancestor::tr/child::td"));
    System.out.println("list of child elements:"+childs.size()); // print size  of child elemnt - 5 , also given the element index after td in xpath

    
  //Ancestor - Selects all ancestors (parent, grandparent, etc.) 
    
   String text2 =driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/ancestor::tr")).getText();
   System.out.println("Anscetor:"+text2);
   
   
 //Descendant - Selects all descendants (children, grandchildren, etc.
   
  List<WebElement> child2=driver.findElements(By.xpath("//a[contains(text(),'Paras Defence')]/ancestor::tr/descendant::*"));
   
   System.out.println("list of child2 elements:"+child2.size());
   
 //Following -Selects everything in the document after the closing tag of the current node
   
  List<WebElement> childs3=driver.findElements(By.xpath("//a[contains(text(),'Kotak Mahindra Bank')]/ancestor::tr/following::tr"));
   System.out.println("folowing elemnets are:"+childs3.size());
   
 //Following-sibling : Selects all siblings after the current node
   
  List<WebElement> followingsiblings =driver.findElements(By.xpath("//a[contains(text(),'Bombay Burmah')]/ancestor::tr/following-sibling::tr"));
   
   System.out.println("all siblings:"+followingsiblings.size());
   
   
   
  //Preceding - Selects all nodes that appear before the current node in the document
   
   
  List<WebElement> precedings=driver.findElements(By.xpath("//a[contains(text(),'Sterlite Technologie')]/ancestor::tr/preceding::tr"));
   
   System.out.println("all preceding:"+precedings.size());
   
   
 //preceding-sibling - Selects all siblings before the current node
   
   List<WebElement> presibling =driver.findElements(By.xpath("//a[contains(text(),'Sterlite Technologie')]/ancestor::tr/preceding-sibling::tr"));
   
   System.out.println("all preceding siblings:"+presibling.size());
   driver.quit();
   
   

	}

}
