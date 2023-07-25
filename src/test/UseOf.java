package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UseOf {


    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "Driver/Chrome Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/md_mu/OneDrive/Desktop/hw.html");

        System.out.println(driver.getTitle());


      //  Selenium WebDriver to locate elements by Static locators in the provided HTML document:

       // Find the "About Me" section by ID.

        driver.findElement(By.id("about"));

//                Find the “About Me”paragraph section by Class.

        driver.findElement(By.linkText("about me"));
//
//        Find the email input field in the contact form by name.

//
//                Find the "Send Message" button in the contact form by CSS class name.

//
//        Find the first project link in the list of projects by link text.

//
//                Find the "My Projects" section by tag name.

//
//        Find the link named “firstlink”by PartialLinked.




       /* Locate elements by Absolute and Relative XPath in the provided HTML document using Selenium WebDriver:

        Find the "About Me" section by absolute XPath.

        Find the "My Projects" section by relative XPath.

        Find the "Name" label in the contact form by absolute XPath.

        Find the "Email" input field in the contact form by relative XPath.

                Find the first project link in the list of projects by absolute XPath.

        Find the "Send Message" button in the contact form by relative XPath. */


        /*Locate elements by various XPath Axis in the provided HTML document using Selenium WebDriver:

        Find the "Message" textarea in the contact form using an ancestor axis:

        Find the "My Projects" section using a descendant axis:

        Find the "Send Message" button in the contact form using a following axis:

        Find the "Name" label in the contact form using a following sibling axis:

        Find the "About Me" section using a parent axis:

        Find the "Message" textarea in the contact form using a child axis:*/


    }
}
