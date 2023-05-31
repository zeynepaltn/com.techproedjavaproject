package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//tum web elementleri rahatca gormek icin bunu da surekli yapalim
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com/");
        // aramakutusunu locate ediniz ve Nutella aratınız
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        /*
       Eger bir web elementi birden fazla kullanmayacaksaniz bir web elemente assign etmeyebilirsiniz.
        */
       aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
       Thread.sleep(2000);
        // sayfayı kapatınız
        driver.close();

    }
}
