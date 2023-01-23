package Assigmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGrowAppScript {

	public static void main(String[] args) throws InterruptedException {
		//Expected Data
		String expectedLoginPageTitle = "Grow - Login";
		String expectedHomePageTitle = "Grow - HomePage";
		String mailAddress = "vnmalagavi.003@gmail.com";
		String password = "Vnmalagavi@003";
		
		//Step1:Open the browser and enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Empty chrome browser is launched");
		driver.manage().window().maximize();
		System.out.println("Browser window is maximized");
		Thread.sleep(2000);
		driver.get("https://groww.in/");
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login Page is displayed");
		}
		else {
			System.out.println("Login Page is ot displayed");
		}
		
		//Step2: Enter valid credentials into mailAddress text field and Password Text field
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		System.out.println("Welcome To Grow popup is displayed");
		
		WebElement mailID = driver.findElement(By.id("login_email1"));
		mailID.click();
		Thread.sleep(1000);
		mailID.sendKeys("vnmalagavi.003@gmail.com");
		String validmailID = mailID.getAttribute("value");
		//driver.findElement(By.id("login_email1"))
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		if(mailAddress.equals(validmailID)) {
			System.out.println("Sucessfully mailID entered into mailAddress text field");
		}
		else {
			System.out.println("mailID is not entered into mailAddress text field / invalid mailID has been entered");
		}
		System.out.println("Welcome Back page is displayed");
		Thread.sleep(1000);
		
		WebElement Correctpassword = driver.findElement(By.id("login_password1"));
		Correctpassword.click();
		Thread.sleep(1000);
		Correctpassword.sendKeys("Vnmalagavi@003");
		String YourPassword = Correctpassword.getAttribute("value");
		if(password.equals(YourPassword)) {
			System.out.println("Entered right password");
		}
		else {
			System.out.println("Entered wrong password");
		}
		
		//Step3: Click on Submit button and Enter into Home Page
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle )) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
		

	}

}
