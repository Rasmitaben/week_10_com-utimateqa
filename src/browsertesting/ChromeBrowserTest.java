package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest{
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in ";

        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the Url into Browser
        driver.get(baseUrl);

        // Maximise the Browser
        driver.manage().window().maximize();

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        // Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        // Get the current Url
        System.out.println("current Url : " + driver.getCurrentUrl());

        // Get the page source
        System.out.println("page source : " + driver.getPageSource());

        // Find the Email field element
        driver.findElement(By.id("user[email]")).sendKeys("prime113@gmail.com");

        // Find the Password field element and type the password
        driver.findElement(By.name("user[password]")).sendKeys("prime113");

        // Close the Browser
        driver.close();



    }
}

