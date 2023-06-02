package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

/*
Relative Locators
-Bir web elementi direk locate edemedigimiz durumlarda, o web elementi,
etrafindaki web elementlerin referansi ile tarif etmemizi saglar.
-Bir web sayfasinda benzer ozelliklere sahip web elementlerin oldugu durumlarda kullanilabilir.
-Above==>Belirtilen elementin ustunde olan elementi secer
-below==>Belirtilen elementin altinda olan elementi secer
-to left-of==>Belirtilen elementin solundakini secer
-right-of==> Belirtilen elementin saginda olan elementi secer
-near==>Belirtilen elementin yaninda/yakininda olan elementi secer.
 */
public class C03_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("web driver.chromeDriver","/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
       WebElement hybridBikes= driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
       WebElement roadBikes=driver.findElement(with(By.tagName("span")).above(hybridBikes));
       roadBikes.click();
        // sayfayı kapatın
        driver.close();
    }
}
