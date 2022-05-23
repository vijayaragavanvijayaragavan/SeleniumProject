package ScreenShot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Type_Screenshot {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		//TakesScreenshot screenshot = (TakesScreenshot) driver;
		//File source = screenshot.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\vijay\\Desktop\\screen.png");
		//FileHandler.copy(source, destination);
		WebElement target = driver.findElement(By.xpath("//button[text()='Alert Box']"));
        target.click();
        
        Robot robot = new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(screenSize);
        BufferedImage sourcefile = robot.createScreenCapture(rectangle);
        File destinationfile = new File ("C:\\Users\\vijay\\Desktop\\screen.png");
        ImageIO.write(sourcefile, "png", destinationfile);
		
	}

}
