package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chromeDriver","/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        Thread.sleep(2000);
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(2000);
        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButonu =driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("Delete butonu gorunur");
        }else System.out.println("Delete butonu gorunur degil");
        Thread.sleep(2000);

        //Delete butonuna basin
        deleteButonu.click();
        Thread.sleep(2000);
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.cssSelector("h3"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove gorunur");
        }else System.out.println("Add/Remove gorunmuyor");

        Thread.sleep(2000);
        //Sayfayı kapatın
        driver.close();
        /*
        \\\\\\\\\\\\\Xpath versus CssSelector///////////
        -Xpath text ile calisir fakat cssSelector text ile calismaz
        -Xpath index'e gore arama yapabilir ve daha fazla komninasyona sahiptir.
        cssSelector index'e gore arama yapamaz fakat daha hizli calisir
         */
    }
}
