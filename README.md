# Selenium Test Case: Table Data Validation

This Selenium test case performs validation of table data on a web page using TestNG.

## Purpose

The purpose of this test case is to:

- Validate the accuracy of the displayed data on a dynamic table within a web page.
- Use JSON data to assert against the table's contents.

## Prerequisites

- Java Development Kit (JDK) installed
- TestNG framework installed
- Google Chrome browser installed
- ChromeDriver compatible with your Chrome browser version

## Setup Instructions

1. **Clone the Repository:**
    ```bash
    git clone <repository_URL>
    ```

2. **Set ChromeDriver Path:**

    - Ensure the correct path to the ChromeDriver is set in the code.

3. **Install Dependencies:**

    - Ensure the TestNG framework is installed.

## Running the Test

1. **JSON Data File:**
    - Prepare a JSON file containing the test data. Ensure it's formatted correctly.

2. **Update JSON File Path:**

    - Update the `data.json` file path in the code.

3. **Run the Test:**

    - Execute the `validateTableData()` test method within your IDE or test environment.

## Test Workflow

1. The test navigates to a specific web page with a dynamic table.
2. Retrieves JSON data from a file and inputs it into a textarea on the web page.
3. Clicks a button to refresh the table.
4. Validates the table data against the expected values stored in the JSON file.

## Test Results

- Upon execution, the test verifies the table data and logs the results in the console.

## Contributing

- Contributions are welcome. Feel free to fork the repository and submit pull requests.

## Issues

- If you encounter any issues or have suggestions, please submit them via the repository's issue tracker.

## License

This project is licensed under the [MIT License](LICENSE).
