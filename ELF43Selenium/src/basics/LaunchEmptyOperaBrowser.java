package basics;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchEmptyOperaBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver", "./Drivers/operadriver.exe");
		OperaDriver driver = new OperaDriver();
	}

}
