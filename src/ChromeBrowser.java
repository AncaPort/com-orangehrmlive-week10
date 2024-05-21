import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-2 - ProjectName : com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */
public class ChromeBrowser {

    public static void main(String[] args) throws InterruptedException {
        //base url
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        //Launch the  Chrome browser
        WebDriver driver = new ChromeDriver();
        //open url into browser
        driver.get(baseurl);

        //Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3. Print the title of the page.
        System.out.println("The title of the page : " + driver.getTitle());

        //4. Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The page source : " + driver.getPageSource());

        //6. Click on ‘Forgot your password?’ link.
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //7. Print the current url.
        System.out.println("The current url: " + driver.getCurrentUrl());

        //8.Navigate back to the login page.
        driver.navigate().back();

        //9. Refresh the page.
        driver.navigate().refresh();

        //10. Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("Admin");

        //11. Enter the password to password field.
        driver.findElement(By.name("password")).sendKeys("admin123");

        //12. Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //13. Close the browser.
        driver.quit();
    }
}
