package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        //Techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");//get() ile ayni sey
        Thread.sleep(3000);//java kodlari bekletmek icin Thread.sleep kullanabiliriz
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        //Amazon sayfasinin basligini yazdiralim
        System.out.println("Amazon sayfa basligi: " + driver.getTitle());
        Thread.sleep(3000);
        //Techpro sayfasina geri donelim
        driver.navigate().back();
        //Sayfa basligini yazdiralim
        System.out.println("Techpro'nun sayfa basligi: "+driver.getTitle());
        Thread.sleep(3000);
        //Amazon sayfasina tekrar gidip url'i yazdiralim
        driver.navigate().forward();
        System.out.println("Amazon sayfasi url'i: "+driver.getCurrentUrl());
        //amazon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);
        //sayfayi kapatalim
        driver.close();
    }
}
/*
Odev
Yeni bir Class olusturalim.C05_NavigationMethods
Youtube ana sayfasina gidelim . https://www.youtube.com/
Amazon soyfasina gidelim. https://www.amazon.com/
Tekrar YouTube’sayfasina donelim
Yeniden Amazon sayfasina gidelim
Sayfayi Refresh(yenile) yapalim
Sayfayi kapatalim / Tum sayfalari kapatalim

 */
