package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	public class OnlineReg {
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Mansi\\SANKET JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://registration.deccansociety.org/Registration/Apply/MHC");
		Thread.sleep(3000);
		
		/*driver.findElement(By.id("btnLinkRegister")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("registrationUserName")).sendKeys("wpsanket");
		Thread.sleep(3000);
		driver.findElement(By.id("registrationPassword")).sendKeys("wpsanket");
		Thread.sleep(3000);
		driver.findElement(By.id("registrationConfirmPassword")).sendKeys("wpsanket");
		Thread.sleep(3000);
		driver.findElement(By.id("registrationMobileNumber")).sendKeys("9518757807");
		Thread.sleep(3000);
		driver.findElement(By.id("registrationEmail")).sendKeys("sanket.warudkar@mastersofterp.co.in");
		Thread.sleep(3000);
		driver.findElement(By.id("btnRegister")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("btnLinkLogin")).click(); */
		
		driver.findElement(By.id("Email")).sendKeys("wpsanket");
		Thread.sleep(1000); 
		driver.findElement(By.id("Password")).sendKeys("wpsanket");
		driver.findElement(By.id("btnStudLogin")).click();
		driver.findElement(By.id("btnAccept")).click();
		Thread.sleep(8000);
		
		//new Select(driver.findElement(By.id("ddlCourseLevel"))).selectByVisibleText("UNDER GRADUATE");
		
		Select dropdown = new Select(driver.findElement(By.id("ddlCourseLevel")));
		dropdown.selectByVisibleText("UNDER GRADUATE");
		Thread.sleep(3000);
		driver.findElement(By.id("btnContinue")).click();
		Thread.sleep(8000);
		Select dropdown1 = new Select(driver.findElement(By.id("ddlTitle")));
		dropdown1.selectByVisibleText("MR.");
		driver.findElement(By.id("txtlastName")).sendKeys("Warudkar");
		Thread.sleep(3000);
		driver.findElement(By.id("txtfirstName")).sendKeys("Sanket");
		driver.findElement(By.id("txtmobileNo")).sendKeys("9518757807");
		Thread.sleep(3000);
		
	Select dropdown2 = new Select(driver.findElement(By.id("ddlGender")));
	dropdown2.selectByVisibleText("Male");
		Thread.sleep(3000);
		  //Select dropdown3 = new Select(driver.findElement(By.id("ddlGender"));
		  //dropdown3.selectByVisibleText("Female");
		  driver.findElement(By.id("btnContinue")).click();
		  driver.findElement(By.id("txtChildNo")).sendKeys("2");
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtfatherName")).sendKeys("Ramesh");
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtExtraCurricularActivites")).sendKeys("table tennis");
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtFatherEmailID")).sendKeys("sanket.warudkar@mastersofterp.co.in");	
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtMotherEMailID")).sendKeys("sanket.warudkar@mastersofterp.co.in");	
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtMothermobileno")).sendKeys("9518757807");
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtFatherMobNo")).sendKeys("8087117027");
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtWorkExperience")).sendKeys("5");
		  Thread.sleep(3000);
		  System.out.println("my name is Shao Kahn");
		  driver.findElement(By.id("btnSubmit")).click();
		  System.out.println("my name is Shao Kahn");
		  Thread.sleep(3000);

	driver.close(); 
		
	}

}
