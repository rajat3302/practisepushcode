package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHrmLoginTest 
{

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshro\\OneDrive\\Desktop\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		// in latest version we not need to write upper statement 
		
		
		// 1)launch browser
	//	ChromeDriver driver= new ChromeDriver(); 
		
		WebDriver driver= new ChromeDriver(); // by this you launch any browser
		driver.manage().window().maximize();
		
		//2) open the url on browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000); // wait 5 sec 
		//3) provid username
		
	//	WebElement txtusername =driver.findElement(By.name("username")); // identify web elemnt 
		//txtusername.sendKeys("admin"); // pass the arguments on web elemnt 
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// 4) paasword - admin123
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// 5) login button 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		//6) verify the title of the webpage 

         String act_title=driver.getTitle();
         String exp_title= "OrangeHRM";
         
         if(act_title.equals(exp_title))
        		 {
        	      System.out.println("testpassed");
        		 }
         else
         {
        	 System.out.println("failed");
         }
         
         //after succesful login validate label 
         
         String act_label=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
         String exp_label="Dashboard";
         if(act_label.equals(exp_label))
         {
        	 System.out.println("test passed");
         }
         else
         {
        	 System.out.println("test fsiled ");
         }
          //7)close browser
         driver.quit();
		
			
	}

}
