package week2.day1;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumXpathDay2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement getusername = driver.findElement(By.xpath("//input[@id ='username']"));
		getusername.sendKeys("DemoSalesManager");
		WebElement getpassword = driver.findElement(By.xpath("//input[@id ='password']"));
		getpassword.sendKeys("crmsfa");
		WebElement getbutton = driver.findElement(By.xpath("//input[@class ='decorativeSubmit']"));
		getbutton.click();
		WebElement getlinkbutton = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		getlinkbutton.click();
		WebElement getleadbutton = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		getleadbutton.click();
		WebElement getcreateuser = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));;
		getcreateuser.click();
		WebElement getcompanyuser = driver.findElement((By.xpath("//input[@id ='createLeadForm_companyName']")));
		getcompanyuser.sendKeys("TCS");
		WebElement getfirstuser = driver.findElement((By.xpath("//input[@id ='createLeadForm_firstName']")));
		getfirstuser.sendKeys("Raja");
		WebElement getlastuser = driver.findElement(By.xpath("//input[@id ='createLeadForm_lastName']"));
		getlastuser.sendKeys("Chatterjee");
		WebElement getlocalname = driver.findElement(By.xpath("//input[@name ='firstNameLocal']"));
		getlocalname.sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name ='departmentName']")).sendKeys("Marketing");
		driver.findElement(By.xpath("//textarea[@name ='description']")).sendKeys("This is for testing purpose");
		driver.findElement(By.xpath("//input[@id ='createLeadForm_primaryEmail']")).sendKeys("rajac384@gmail.com");
		WebElement selectoption = driver.findElement(By.xpath("//select[@id ='createLeadForm_generalStateProvinceGeoId']"));
		selectoption.click();
		Select dd = new Select(selectoption);
		dd.selectByVisibleText("New York");
		Thread.sleep(3000);
		WebElement getcreateuser1 = driver.findElement(By.xpath("//input[@class = 'smallSubmit']"));
		getcreateuser1.click();
		Thread.sleep(3000);
		System.out.println(" The page title is " +driver.getTitle());
		WebElement geteditbutton = driver.findElement(By.xpath("//div[@class ='frameSectionExtra'][1]/a[3]"));
		geteditbutton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name ='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name ='importantNote']")).sendKeys(" This is an important note");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		System.out.println(" The page title is " +driver.getTitle());
		driver.findElement(By.xpath("//a[contains( text(),'Duplicate Lead')]")).click();
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("Cognizant");
		driver.findElement(By.xpath("//input[@id ='createLeadForm_firstName']")).clear();
		driver.findElement(By.xpath("//input[@id ='createLeadForm_firstName']")).sendKeys("Rajib");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		System.out.println(" The page title is " +driver.getTitle());
		
	}
		

}


