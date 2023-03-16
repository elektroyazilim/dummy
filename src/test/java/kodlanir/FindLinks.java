package kodlanir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindLinks {


    @Test
    public void findLinks() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        for (WebElement iframe : iframes) {

            driver.switchTo().frame(iframe);
            System.out.println(driver.findElements(By.tagName("a")).size());
        }

    }

    @Test
    public  void findLinksOnFooter()
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement footer = driver.findElement(By.id("gf-BIG"));

        List<WebElement> aLinks = footer.findElements(By.tagName("a"));
        System.out.println(aLinks.size()); //20

        footer.findElement(By.cssSelector("div#gf-BIG li>a")); //16

    }

    @Test
    public  void findLinksOnFooterFirstColumn()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> aLinks = driver.findElements(By.cssSelector("div#gf-BIG td:nth-child(1) li>a"));
        System.out.println(aLinks.size());

        for(WebElement link : aLinks)
        {
            System.out.println(link.getAttribute("href"));
        }
    }

    @Test
    public  void openLinksInNewTab()
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> aLinks = driver.findElements(By.cssSelector("div#gf-BIG td:nth-child(1) li>a"));
        System.out.println(aLinks.size());

        for(WebElement link : aLinks)
        {
            String twoKeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
            link.sendKeys(twoKeys);
        }
    }
}
