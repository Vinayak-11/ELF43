package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(); 
	}

}
