import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gabas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.manage().window().maximize();
        driver.navigate().to("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        
        try {
            Thread.sleep(2000); // Adding a 2-second delay after navigating to the webpage
            
            driver.findElement(By.xpath("/html/body/div/div[3]/details")).click();
            Thread.sleep(1000); // Adding a 1-second delay after clicking on the details
            
            driver.findElement(By.xpath("//textarea[@id='jsondata']")).clear();
            String jsondata = "[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, {\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, {\"name\": \"Sara\", \"age\" : 42, \"gender\": \"female\"}, {\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, {\"name\": \"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]\r\n";
            
            driver.findElement(By.xpath("//textarea[@id='jsondata']")).sendKeys(jsondata);
            Thread.sleep(1000); // Adding a 1-second delay after entering JSON data
            
            driver.findElement(By.xpath("//button[@id='refreshtable']")).click();
            Thread.sleep(5000); // Adding a 5-second delay after clicking the button
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        driver.quit();
        }
    }
}
