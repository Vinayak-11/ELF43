package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LauchEmptyEdgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	}
}
