
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
                "/Users/pavannerella/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://www.youtube.com/");
        System.out.println("Browser launched successfully!");

        // Close browser
        driver.quit();
    }
}