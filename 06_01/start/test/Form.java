import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F:/LinkedIn courses/Selenium Essential Training/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.quit();
    }
}
