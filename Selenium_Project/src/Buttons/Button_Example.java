package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Example {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/radio-button");
    driver.manage().window().maximize();
    WebElement button = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
    button.click();
    driver.navigate().to("http://www.leafground.com/pages/Button.html");
    WebElement home = driver.findElement(By.id("home"));
    driver.navigate().to("http://www.leafground.com/pages/Button.html");
    WebElement position = driver.findElement(By.id("position"));
    Point location = position.getLocation();
    int x = location.getX();
    int y = location.getY();
    System.out.println("location of x is : "+ x);
    System.out.println("location of y is : "+ y);
    WebElement color = driver.findElement(By.id("color"));
    String value = color.getCssValue("value");
    System.out.println("what is the color : "+value);
    
    

}
}