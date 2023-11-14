package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Utimateqa {
    //1.Setup Chrome browser
    static String browser = "Firefox";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //2.Multiple browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //3.Open URL
        driver.get(baseUrl);
        //4.Maximize the window
        driver.manage().window().maximize();
        //5.Timeout for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //6.Print the title of the page.
        System.out.println(driver.getTitle());
        //7.Print the current url.
        System.out.println(driver.getCurrentUrl());
        //8.Print the page source
        System.out.println(driver.getPageSource());
        //9.Click on sign in link
        driver.findElement(By.linkText("Sign In")).click();
        //10.Print the current url
        System.out.println(driver.getCurrentUrl());
        //11.Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("tester3333@gmail.com");
        //12.Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("exeperience@123");
        //13.Click on login button
        driver.findElement(By.partialLinkText("Sign")).click();
        //14.Navigate to the base URL
        driver.navigate().to(baseUrl);
        //15.Navigate forward to Homepage.
        driver.navigate().forward();
        //16.Navigate back to baseUrl
        driver.navigate().back();
        //17.Refresh the page
        driver.navigate().refresh();
        //18.Close the browser
        driver.quit();

    }
}

