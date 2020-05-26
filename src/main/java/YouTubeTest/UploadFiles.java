package YouTubeTest;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFiles {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimTaj\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
		  String uploadfile= "C:\\Users\\SimTaj\\Pictures\\Camera Roll\\pixels.png";
		Screen s = new Screen();
		Pattern choosefile= new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\choosefile.png");
		s.wait(choosefile,2000);
		s.click();
		
		
		Thread.sleep(3000);
		Pattern filetextbox= new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\filename.png");
		s.wait(filetextbox,2000);
		s.type(filetextbox,uploadfile);
		
		Pattern open= new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\open.png");
		s.wait(open,2000);
		s.click();
		
	 Thread.sleep(2000);
	 driver.close();
	

	}

}
