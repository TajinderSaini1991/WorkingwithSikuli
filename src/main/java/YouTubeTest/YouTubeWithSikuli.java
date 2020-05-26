package YouTubeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeWithSikuli {
	public static void main(String[] args) throws FindFailed, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimTaj\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=DC5wtYGQ7XE");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Screen s = new Screen();
		Pattern skipAd = new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\skipAd.png");
        s.wait(skipAd,2000);
		s.click();
		
		
		Pattern trial = new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\trial.png");
        s.wait(trial,2000);
		s.click();
		
		Pattern pauseimage = new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\Pause.png");
        s.wait(pauseimage, 1000);
        s.click();
        
        Pattern settings = new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\Settings.png");
        s.wait(settings, 2000);
        s.click();
        
   
        
        Pattern quality = new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\quality.png");
       s.wait(quality,1000);
        s.click();
        
        
        Pattern pixels = new Pattern("C:\\Users\\SimTaj\\workspace\\SikuliPictures\\pixels.png");
        s.wait(pixels, 1000);
        s.click();
        Thread.sleep(2000);
        driver.close();
	}
}