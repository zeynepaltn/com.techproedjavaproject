package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
    System.setProperty("chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() sayfa basligini verir
        System.out.println("Amazon'un Sayfa Basligi: " + driver.getTitle());
        System.out.println("Amazon'un gercek url'i:  " + driver.getCurrentUrl());
        String amazonWindowHandle=driver.getWindowHandle();
        System.out.println("Amazon window handle degeri:  " + driver.getWindowHandle());
        driver.get("https://techproeducation.com");
        System.out.println("Techpro'nun Sayfa Basligi: " + driver.getTitle());
        //getCurrentUrl() gidilen sayfanin url'ini verir
        System.out.println("Techproed'in gercek url'i:  " + driver.getCurrentUrl());
        //getPageSource() Acilan sayfanin kaynak kodlarini verir
       // System.out.println("Techpro'nun kaynak kodlari: " + driver.getPageSource());
       //getWindowHandle() gidilen sayfanin handle degerini(hashcode) verir, bu handle degerini
        //sayfalar arasi gecis icin kullaniriz
        System.out.println("Techproed window handle degeri:  " + driver.getWindowHandle());

    }//main
}//class
