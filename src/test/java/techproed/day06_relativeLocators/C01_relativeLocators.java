package techproed.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chromeDriver","/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //amazona gidelim
        driver.get("https://www.amazon.com");
        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //WebElement'leri yazisini konsola yazdiralim
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());
        System.out.println("***********************************");
        //Bikes altindaki tum linkleri(WebElement) konsola yazdiralim
        List<WebElement> linklerListesi=driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
        /*
        XPATH kullaniminda bir sayfadaki web elementlere mudahele etmek istedigimizde xpath ile
        locate aldigimizda birden fazla sonuc verebilir. [position()>=9 and position()<=15] bu kullanimla aralik belirterek istedigimiz
        web elementleri secip mudahele edebiliriz
         */
        //Lambda ile yazdiralim
        linklerListesi.forEach(t->System.out.println(t.getText()));
        System.out.println("*********************");
        //for each ile yazdiralim
        for (WebElement w:linklerListesi) {
            System.out.println(w.getText());
        }
        //Bu linklerin hepsini tiklayalim

        for (int i = 0; i < linklerListesi.size(); i++) {
            linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linklerListesi.get(i).getText());
            linklerListesi.get(i).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }

       // completeBike.click();


    }
}
