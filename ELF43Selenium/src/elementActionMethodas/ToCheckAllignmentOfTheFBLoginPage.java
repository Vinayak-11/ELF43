package elementActionMethodas;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAllignmentOfTheFBLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement EmailElement = driver.findElement(By.id ("email"));
		WebElement PasswordElement = driver.findElement(By.id("pass"));
		
		Point emailTextBoxlocation = EmailElement.getLocation();
		Point passwordTextBoxlocation = PasswordElement.getLocation();
		Dimension emailTextBoxSize = EmailElement.getSize();
		Dimension passwordTextBoxSize = PasswordElement.getSize();
		
		int xlocationOfemailTextBox = emailTextBoxlocation.getX();
		int xlocationOfPasswordTextBox = passwordTextBoxlocation.getX();
		int xlocationPlusWidthOfemailTextBox = emailTextBoxSize.getWidth()+xlocationOfemailTextBox;
		int xlocationPlusWidthOfpasswordTextBox = passwordTextBoxSize.getWidth()+xlocationOfPasswordTextBox;
		
		//Left allignment check
		if(xlocationOfemailTextBox==xlocationOfPasswordTextBox)
			System.out.println("email textBox and password textBox alligned properly towards left");
		else
			System.out.println("email textBox and password textBox not alligned properly towards left");
		
		//Right allignment check
		if(xlocationPlusWidthOfemailTextBox==xlocationPlusWidthOfpasswordTextBox)
			System.out.println("email textBox and password textBox alligned properly towards right");
		else
			System.out.println("email textBox and password textBox alligned properly towards right");
			
		
		System.out.println(xlocationOfemailTextBox);
		System.out.println(xlocationOfPasswordTextBox);
		System.out.println(xlocationPlusWidthOfemailTextBox);
		System.out.println(xlocationPlusWidthOfpasswordTextBox);
		
		
		//driver.quit();

	}

}
