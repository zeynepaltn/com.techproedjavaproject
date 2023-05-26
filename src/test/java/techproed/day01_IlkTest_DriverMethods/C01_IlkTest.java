package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("Web driver.chrome.driver","/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com/");

    }
}



/*
public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
    //java uygulamalarinda system ozelliklerini ayarlamak icin setProperty methodunu kullaniriz
    //setProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz
        System.out.println(System.getProperty("chromeDriver"));
    //getProperty ile "Key" degerini girerek "value" ya ulasabilirim
    WebDriver driver=new ChromeDriver();
    //ChromeDriver turunde yeni bir obje olusturduk
    driver.get("https://techproeducation.com")
    //get methodu ile string olarak girilen url'e gideriz



    }//main

}//class
 */