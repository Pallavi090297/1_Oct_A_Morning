package Module_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	
	@FindBy(xpath="//input[@id='email']")   private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")  private  WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")  private  WebElement login;
	
	
	
	public login1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	public void email1(String s1)
	{
		email.sendKeys(s1);
		
	}
	
	public void password(String s2)
	{
		password.sendKeys(s2);
		
	}
	
	public void login( )
	{
		login.click();
		
	}
}
