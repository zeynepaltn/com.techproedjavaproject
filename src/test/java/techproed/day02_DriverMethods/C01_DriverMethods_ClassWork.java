package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        //amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //sayfa basliginin amazon icerdigini test edelim
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //Url'in htttps://www.amazon.com oldugunu test edelim
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("test PASSED");
        }else System.out.println("Test FAILED->"+actualUrl);
        //sayfayi kapatalim
        driver.close();

        /*
        ODEV
        Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.

         */

    }//main
}//class
