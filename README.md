**Selenium WebDriver Automation for Juice Shop**
**Overview**
This project demonstrates automated testing of the OWASP Juice Shop application using Selenium WebDriver with Java. It includes registration, login, and basic test scenarios.

**Prerequisites**
Ensure you have the following installed:

Java Development Kit (JDK) 8 or higher
Maven build tool
ChromeDriver (or WebDriver for your preferred browser) installed and configured
Setup
Clone the repository:

**git clone 
cd your-repository
Set up ChromeDriver:

Download ChromeDriver from here and place it in src/main/resources directory or update the path in System.setProperty in your test files.

Install dependencies:

This project uses Maven to manage dependencies. Run the following command to install dependencies:

mvn clean install
Usage
Running the Tests
You can run the tests using Maven:
**mvn test
Test Files
RegistrationPage.java: Handles registration page interactions.
RegisterUserTest.java: Contains registration test cases.
LoginPage.java: Handles login page interactions.
LoginTest.java: Contains login test cases.**
JuiceShopAutomation.java: Contains broader automation scenarios.
Other relevant files as per your project structure.
**Contributing**
Contributions are welcome! If you find any issues or want to add more tests, please fork the repository and submit a pull request.

**License**
This project is licensed under the MIT License.

