package kiemtra;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://cms.anhtester.com/login");

// fill login data
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

// click product tab
        driver.findElement(new By.ByXPath("//span[normalize-space()='Products']")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//span[normalize-space()='Category']")).click();
        Thread.sleep(2000);

// Add New category
        driver.findElement(new By.ByXPath("//span[normalize-space()='Add New category']")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//input[@id='name']")).sendKeys("Phuong Linh");
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//div[contains(text(),'No Parent')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("bs-select-1-0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("order_level")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//button[@title='Physical']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("bs-select-2-1")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//div[5]//div[1]//div[1]//div[2]")).click();
        driver.findElement(new By.ByXPath("//div[@class='aiz-uploader-all clearfix c-scrollbar-light']//div[2]//div[1]//div[1]//div[1]//img[1]")).click();
        driver.findElement(new By.ByXPath("//button[normalize-space()='Add Files']")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//div[6]//div[1]//div[1]//div[2]")).click();
        driver.findElement(new By.ByXPath("//div[10]//div[1]//div[1]//div[1]//img[1]")).click();
        driver.findElement(new By.ByXPath("//button[normalize-space()='Add Files']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("meta_title")).sendKeys("Linh");
        Thread.sleep(2000);
        driver.findElement(By.name("meta_description")).sendKeys("Linh 1");
        driver.findElement(new By.ByXPath("//button[@title='Nothing selected']")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//a[@id='bs-select-3-0']")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//button[normalize-space()='Save']")).click();
        Thread.sleep(4000);
// search
        WebElement inputSearch = driver.findElement(new By.ByXPath("//input[@id='search']"));
        inputSearch.sendKeys("Phuong Linh");
        Thread.sleep(1000);
        inputSearch.sendKeys(Keys.ENTER);

    }
}
