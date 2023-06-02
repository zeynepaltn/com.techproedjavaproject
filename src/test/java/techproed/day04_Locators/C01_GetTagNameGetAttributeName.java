package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetTagNameGetAttributeName {
    public static void main(String[] args) {
        System.setProperty("web driver.chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //"https://www.amazon.com" sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //Arama kutusunun tagName'inin input oldugunu test ediniz.
        String actuelTagName = aramaKutusu.getTagName();//actuel gercek demek
        //gercek tagName i test eder

        String expectedTagName ="input";//beklenen tagname in bu oldugunu test eder

        if (actuelTagName.equals(expectedTagName)){//actuelTagName, expectedTagName'e esit midir?
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //Arama kutusunun name attribute'ünün degerinin "field-keywords" oldugunu test edin
        String actuelAttribute = aramaKutusu.getAttribute("name");//Attribute degerini test eder

        String expectedAttribute = "field-keywords";//beklenen attribute degeridir

        if (actuelAttribute.equals(expectedAttribute)){//actuelAttribute, expectedAttribute'e esit midir?
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //Sayfayi kapatin
        driver.close();

    }
}
