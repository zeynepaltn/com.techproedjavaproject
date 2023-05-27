package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chromeDriver", "/Users/isaaltun/Documents/selenium libraries/drivers/chromedriver_mac64");
        WebDriver driver=new ChromeDriver();
        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu= "+driver.manage().window().getPosition());
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari= "+driver.manage().window().getSize());
        //Browser'i max yapalim
        driver.manage().window().maximize();
        /*
        Bir websitesi'ne gittiginizde browser default olarak bir boyutta gelir ve
        acilan browsar'daki web elementlere browser maximize olmadigi icin ulasamayabiliriz.
        dolayisi ile browser'i actikdan sonra maximize yaparsak driver butun web elementleri gorur ve
        rahatlikla mudehale eder. Bu yuzden browser'i actikdan sonra ilk olarak maximize yapmamiz bizim
        web elementlere ulasmada isimizi kolaylastirir. Boylelikle fail olmamis oluruz.
         */
        //Techproed sayfasina gidelim
        driver.get("http://techproeducation.com");
        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu= "+driver.manage().window().getPosition());
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari= "+driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));//size'i istedigimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);
        //sayfayi kapatin
        driver.close();

    }
}
/*
Odev
1.Yeni bir Class olusturalim.C06_ManageWindow
2.Amazon soyfasina gidelim. https://www.amazon.com/
3.Sayfanin konumunu ve boyutlarini yazdirin
4.Sayfayi simge durumuna getirin
5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
7.Sayfayi fullscreen yapin
8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
9.Sayfayi kapatin

 */
