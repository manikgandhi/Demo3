import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import java.io.BufferedReader;

public class Testcase1 {

	@Test
	public void validateTableData() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gabas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch website
		driver.manage().window().maximize();
		driver.navigate().to("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");

		try {
			Thread.sleep(2000); // Adding a 2-second delay after navigating to the webpage

			driver.findElement(By.xpath("/html/body/div/div[3]/details")).click();
			Thread.sleep(1000); // Adding a 1-second delay after clicking on the details

			driver.findElement(By.xpath("//textarea[@id='jsondata']")).clear();

			String jsonFilePath = "C:\\Users\\gabas\\eclipse-workspace\\Demo_Test\\data.json";
			String jsonData = readJSONFile(jsonFilePath);
			driver.findElement(By.xpath("//textarea[@id='jsondata']")).sendKeys(jsonData);
			Thread.sleep(1000); // Adding a 1-second delay after entering JSON data

			driver.findElement(By.xpath("//button[@id='refreshtable']")).click();
			Thread.sleep(5000); // Adding a 5-second delay after clicking the button

			assertTableData(driver);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

	private static void assertTableData(WebDriver driver) {
		// Locate the table
		WebElement table = driver.findElement(By.id("dynamictable"));

		// Get all the rows in the table
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

			String name = columns.get(0).getText();
			int age = Integer.parseInt(columns.get(1).getText());
			String gender = columns.get(2).getText();

			// Verify the data with the stored test data
			switch (i) {
			case 1:
				System.out.println("\nVerifying Bob's data...");
				Assert.assertEquals(name, "Bob");
				Assert.assertEquals(age, 20);
				Assert.assertEquals(gender, "male");
				System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
				System.out.println("**********Verification Done**********");
				break;
			case 2:
				System.out.println("\nVerifying George's data...");
				Assert.assertEquals(name, "George");
				Assert.assertEquals(age, 42);
				Assert.assertEquals(gender, "male");
				System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
				System.out.println("**********Verification Done**********");
				break;
			case 3:
				System.out.println("\nVerifying Sara's data...");
				Assert.assertEquals(name, "Sara");
				Assert.assertEquals(age, 42);
				Assert.assertEquals(gender, "female");
				System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
				System.out.println("**********Verification Done**********");
				break;
			case 4:
				System.out.println("\nVerifying Conor's data...");
				Assert.assertEquals(name, "Conor");
				Assert.assertEquals(age, 40);
				Assert.assertEquals(gender, "male");
				System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
				System.out.println("**********Verification Done**********");
				break;
			case 5:
				System.out.println("\nVerifying Jennifer's data...");
				Assert.assertEquals(name, "Jennifer");
				Assert.assertEquals(age, 42);
				Assert.assertEquals(gender, "female");
				System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
				System.out.println("**********Verification Done**********");
				break;
			default:
				break;
			}
		}
	}

	private String readJSONFile(String filePath) {
		StringBuilder jsonData = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				jsonData.append(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonData.toString();
	}
}
