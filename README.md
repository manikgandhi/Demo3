Selenium Test Case README
This Selenium test case performs validation of table data on a web page using TestNG.

Purpose
The purpose of this test case is to:

Navigate to a specific web page with a dynamic table.
Retrieve JSON data from a file and input it into a textarea on the web page.
Click a button to refresh the table.
Validate the table data against the expected values stored in the JSON file.
Technologies Used
Selenium WebDriver
TestNG
Java
ChromeDriver
Prerequisites
JDK installed
TestNG framework installed
Chrome browser installed
ChromeDriver compatible with the Chrome browser version
Test Case Workflow
Setup:

Ensure the ChromeDriver path is set correctly in the system properties.
Launch the Chrome browser and maximize the window.
Navigate to the target web page with the dynamic table.
Data Input:

Locate the textarea and clear any existing data.
Read JSON data from the specified file and input it into the textarea.
Table Update:

Click the button to refresh the table, updating its content.
Validation:

Retrieve table rows and columns.
Validate the data in each row against the expected values defined in the code.
Verify the data for each row: name, age, and gender.
Assertions are used to ensure the expected values match the actual values in the table.
Teardown:

Quit the WebDriver, closing the browser session.
Running the Test Case
Clone this repository or download the code.
Ensure the prerequisites are met.
Update the ChromeDriver path in the code if needed.
Place the data.json file with the test data in the project directory or update the JSON file path in the code.
Run the validateTableData() test method within your IDE or testing environment.
