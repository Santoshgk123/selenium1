package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Project {
	
	public static void main(String[] args) {
		
	public static WebDriver driver;
   
    public static void openBrowser()
    {
    System.setProperty("webdriver.gecko.driver","C:\\Users\\Santosh\\Downloads\\IMP\\geckodriver-v0.26.0-win64\\geckodriver.exe");
    driver=new FirefoxDriver();
    }
    public static void navigate()
    
    {
        driver.get("http://localhost/orangehrm/orangehrm-5.6/web/index.php/pim/addEmployee");
    }
	
    public static void input_username()
    {
    driver.findElement(By.name("username")).sendKeys("admin");
    }
     
    public static void input_Password()
    {
    driver.findElement(By.name("password")).sendKeys("Benkuriakose2$");
    }
    
    public static void click_login()
    {
    driver.findElement(By.name("submit")).click();
    
    @Test
    public static void verify_login()
    {
    String pageTitle = driver.getTitle();
    
    }
    
    }
    public static void closebrowser()
    {
    driver.quit();
    }
	}
	
	
}
