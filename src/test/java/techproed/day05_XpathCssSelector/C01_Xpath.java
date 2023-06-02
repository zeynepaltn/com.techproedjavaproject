package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("web driver.chromeDriver","/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın
        //WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        // Hybrid Bikes bölümüne tıklayın
        WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        hybridBikes.click();
        // sonuc sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println(sonucYazisi.getText());
        String sonucSayisi[] = sonucYazisi.getText().split(" ");
        System.out.println(sonucSayisi[0]);
        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        //Sayfayı kapatınız
        driver.close();

    }
}
