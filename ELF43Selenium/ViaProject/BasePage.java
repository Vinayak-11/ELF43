package ViaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BasePage {

	// step 1: create constructor:

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Step 2:create basePage:

	@FindBy(id = "SignIn")
	private WebElement SignIn;

	@FindBy(xpath = "//span[text()='SIGN UP']")
	private WebElement SignUp;

	@FindBy(id = "emailIdSignUp")
	private WebElement EmailId;

	@FindBy(id = "nameSignUp")
	private WebElement nameTB;

	@FindBy(id = "passwordSignUp")
	private WebElement passwordTb;

	@FindBy(id = "mobileNoSignUp")
	private WebElement mobileNo;

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSignUp() {
		return SignUp;
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getNameTB() {
		return nameTB;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getSingUpDetails() {
		return singUpDetails;
	}

	@FindBy(id = "signUpValidate")
	private WebElement singUpDetails;

	@FindBy(id = "loginFacebook")
	private WebElement loginWithFaceBook;

	@FindBy(id = "loginGoogle")
	private WebElement loginwithGoogle;

	@FindBy(xpath = "//a[text()='Agent Login']")
	private WebElement agentLogin;

	@FindBy(id = "loginIdText")
	private WebElement loginIdText;

	public WebElement getLoginText() {
		return loginIdText;
	}

	public WebElement getLoginWithFaceBook() {
		return loginWithFaceBook;
	}

	public WebElement getLoginwithGoogle() {
		return loginwithGoogle;
	}

	public WebElement getAgentLogin() {
		return agentLogin;
	}

	@FindBy(id = "loginValidate")
	private WebElement loginvalidate;

	public WebElement getLoginIdText() {
		return loginIdText;
	}

	public WebElement getLoginvalidate() {
		return loginvalidate;
	}

	@FindBy(id = "passwordText")
	private WebElement passwordText;// password tb in sign-inpage

	public WebElement getPasswordText() {
		return passwordText;
	}

	@FindBy(linkText = "Corporate Login")// Corporate Login button in sign-in page
	private WebElement CorporateLogin;

	public WebElement getCorporateLogin() {
		return CorporateLogin;
	}
	@FindBy (id = "mobileIsdSignUp")private WebElement mobiledropdown;

	public WebElement getMobiledropdown() {
		return mobiledropdown;
	}

	
	
}

