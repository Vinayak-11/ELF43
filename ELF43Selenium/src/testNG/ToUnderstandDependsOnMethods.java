package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethods {
	@Test(dependsOnMethods="register")
	public void createAccount() {
		Reporter.log("FROM CREATE ACCOUNT", true);
	}

	@Test(dependsOnMethods={"createAccount","register"})
	public void modifyAccount() {
		int i=1/10;
		Reporter.log("FROM MODIFY ACCOUNT", true);
	}

	@Test
	public void register() {
		Reporter.log("FROM REGISTER ACCOUNT", true);
	}

	@Test(dependsOnMethods="createAccount")
	public void amountTransfer() {
		Reporter.log("FROM EDIT CONTACT", true);
	}

	@Test(dependsOnMethods={"createAccount","modifyAccount"})
	public void deleteAccount() {
		Reporter.log("FROM DELETE CONTACT", true);
	}
}
