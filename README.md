# Demo3
Basic automation demo done using java with selenium. 
# Selenium Java Automation for Dynamic Table Interaction

This project showcases a basic automation script using Selenium WebDriver in Java to interact with a web page featuring dynamic tables.

## Prerequisites

- Java Development Kit (JDK)
- Selenium WebDriver Java bindings
- ChromeDriver

## Setup Instructions

1. **Clone Repository**:
    ```bash
    git clone https://github.com/your-username/selenium-dynamic-table-automation.git
    ```
   
2. **Download ChromeDriver**:
   - Download ChromeDriver from [here](https://chromedriver.chromium.org/downloads) and place it in a directory.
   - Update the path to ChromeDriver in the `System.setProperty` line of `Testcase1.java`:
     ```java
     System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");
     ```

3. **Import Project in Eclipse**:
   - Open Eclipse IDE.
   - Choose `File` -> `Open Projects from File System`.
   - Browse and select the cloned project folder.

4. **Run the Automation Script**:
   - Open `Testcase1.java` in Eclipse.
   - Right-click on the file and select `Run As` -> `Java Application`.

## Description

This script navigates to a webpage with a dynamic table, performs interactions like clicking, inputting JSON data into a textarea, and triggering a button click.

## Structure

- `Testcase1.java`: Contains the main automation script.
- `README.md`: Instructions and information about the project.

## References

- [Selenium Documentation](https://www.selenium.dev/documentation/en/)
- [ChromeDriver Documentation](https://chromedriver.chromium.org/documentation)

Feel free to modify and enhance the script as per your requirements.
