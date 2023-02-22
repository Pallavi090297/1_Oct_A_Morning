package Module_Home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testca1 {
	
	public static void main ( String [] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("Webdriver.chrome.driver","E:\\java selenium\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		Thread.sleep(2000);
		
		login1 login=new login1(driver);
		
		FileInputStream    File=new FileInputStream("E:\\parametirization\\ist oct.xlsx");
		
		Sheet sh=WorkbookFactory.create(File).getSheet("Sheet2");
		
		String s1=sh.getRow(0).getCell(0).getStringCellValue();
		
		
		login.email1(s1);
		
		String s2=sh.getRow(1).getCell(0).getStringCellValue();
		
		login.password(s2);
		
		
		
		
		login.login();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
