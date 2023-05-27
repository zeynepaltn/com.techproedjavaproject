package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("web driver.chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    /*
    implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
    maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
    belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
    fail verir.
    Thread.sleep java kodlarini bizim belirttigimiz sure kadar bekler. 30 sn beklemesini blirtirsem 30 sn bekler
    ve alt satira gecer.
     */
        String techproUrl="https://techproeducation.com";
        String amazonUrl="https://amazon.com";
        //techproed sayfasina gidelim
        driver.get(techproUrl);
        //amazona gidelim
        driver.get(amazonUrl);
        //techproed'e geri donelim
        driver.navigate().back();
        //sayfa basliginin techpro icerdigini test edelim
        String actualTitle= driver.getTitle();
        String arananKelime="Techpro";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED "+actualTitle);
        //tekrar amazona gidelim ve sayfa basliginin amazon icerdigini test edelim
        driver.navigate().forward();
        //string assign etmeden de yapabiliriz
        if(driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //sayfayi kapatiniz
        driver.close();

//driver.quit() acik olan tum browser'lari kapatir

    }
}

/*
Odev
Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin


odev-2
Yeni bir class olusturalim (Homework)
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
https://www.walmart.com/ sayfasina gidin.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
Tekrar “facebook” sayfasina donun
Sayfayi yenileyin
Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin


 */






// implicitly wait;bir sayfadaki tüm web elementlerin oluşmasını max süre dolana kadar bekler
//elementlerin görünür hale gelmesini bekler ve daha sonra işlemlerini gerçekleştirir.