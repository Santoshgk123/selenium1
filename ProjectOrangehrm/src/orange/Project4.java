package orange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Santosh\\Downloads\\IMP\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://localhost/orangehrm/orangehrm-5.6/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    System.out.println("Login functionality");
	    {
	        driver.findElement(By.name("username")).sendKeys("admin");
	        }
	    {
	        driver.findElement(By.name("password")).sendKeys("Benkuriakose2$");
	        }
	    {
	    	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    }
	    
	    System.out.println("Navigating to PIM");
	    {driver.findElement(By.linkText("PIM")).click();
	    
	    }
	    { driver.findElement(By.linkText("Add Employee")).click();
	    
	    }

	    System.out.println("Entering employee details");
	    { driver.findElement(By.name("firstName")).sendKeys("Stephen");
	    
	    }
	    {driver.findElement(By.name("lastName")).sendKeys("S");
	    
	    }
	    
	    {driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	    }
	        
	    {
	            driver.close();
	            }

	}
	}

