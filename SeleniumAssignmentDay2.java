package week2.day2;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignmentDay2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		WebElement getusername = driver.findElement(By.xpath("//input[@id ='email']"));
		getusername.sendKeys("kumar.testleaf@gmail.com");
		WebElement getpassword = driver.findElement(By.xpath("//input[@id ='password']"));
		getpassword.sendKeys("leaf@12");
		WebElement getbutton = driver.findElement(By.xpath("//button[@class = 'btn btn-primary']"));
		getbutton.click();
		
		Thread.sleep(3000);
		System.out.println(" The page title is " +driver.getTitle());
		WebElement logOut = driver.findElement(By.xpath("//a[contains (text(), 'Log Out')]"));
		logOut.click();
		Thread.sleep(3000);
		driver.close();
		
	
	}
		

}


