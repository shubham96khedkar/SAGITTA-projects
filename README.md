FEATURE FILE:- First we have created a feature file and written all the test cases in it. Feature file will contain Feature, Scenario and Given(what we have that is URL), When(what actions or steps we need to perform)
and Then(used for validation) steps format. But in every Test Case we have to first login by navigating to the URL and this login step was repeating in every test case. So to solve this issue, we have used Background
keyword and mentioned the login step in it. Whenever we want to repeat certain steps again and again, we can use Background keyword. It will reduce the length of code written and ensure code reusability.

TESTBASE CLASS:- We have also created a Testbase class. Testbase class will be used to launch the chrome browser and hence all our test cases will be opened in Chrome browser.

HOOKS CLASS:- We also have Hooks class which will contain annnotations like @Before and @After. In @Before, we have mentioned launchdriver from Testbase class. Which means when we run the project, then before going in
any class, it will first launch the Chrome browser(which is inside launch driver method). In @After, we have mentioned that if the test case fails then capture the Screenshot of it and also close the driver after running
every test case.

LOGIN PAGE CLASS:- In Login page, we have implemented @FindBy and mentioned different xpath locators of various Web elements. In Login Page, we have also created a constructor for initialization purpose. In this class
we have created various methods that will be used for calling them in Login step definition class.

LOGIN STEP DEFINITION CLASS:- After that we have also created a Login step definition class. In this class, we have mapped the steps from Feature file to Login step definition class. After that we have called the methods
from Login page class to Login step definition class so that instead of writing a lengthy code, we can reuse the code. And we also have called a constructor from login page class.

TEST RUNNER CLASS:- We also have a Test Runner class. Test Runner class will have the path of Feature file and Login Step definition class.Test Runner class will run the Feature file and Login Step definition class 
together.

POM.XML FILE:- We also have one POM.XML file which will contain the required dependencies. So in POM.XML file we have added the dependencies like Selenium-java(4.18.1 version),Cucumber-java(7.15.0 version), Cucumber-TestNG
(7.12.1 version) and Extent reports(5.0.9 version).
