package Module_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {
	
	//pom1
	
	@FindBy(id="email")  private WebElement Email;
	
	@FindBy(id="password") private WebElement password;
	
	@FindBy(name="submit") private WebElement login;
	
	
	public loginpage1(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	public void EnterEmail(String em)
	{
		Email.sendKeys(em);
		
	}
	
	public void EnterPassword(String password1)
	{
		password.sendKeys(password1);
		
	}
	
	public void login1()
	{
		login.click();
		
	}
	
	
	

}
