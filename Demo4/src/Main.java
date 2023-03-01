import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/#");

        driver.findElement(By.id("log-in")).click();
        //1. Back
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);

        //2. Forward
        driver.navigate().forward();
        Thread.sleep(5000);


        //3. Refresh
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();
    }
}