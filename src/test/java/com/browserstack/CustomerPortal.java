package com.browserstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerPortal extends SeleniumTest {
    @Test
    public void generateQuote() throws Exception {
        // navigate to AIIQ Customer Portal
        driver.get("https://uat-portal.myaii.com/AIIQ/Dashboard");

        // Wait for the page to load completely
        //Thread.sleep(5000); // Adjust the sleep time as necessary

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleContains("Dashboard"));

        System.out.println("Page title is: " + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));

        // Check the title
        Assert.assertTrue(driver.getTitle().matches("Dashboard"));

        // Click on "New Quote" button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/button")).click();
        // //*[@id="b1-Actions"]/button

        // See if the cart is opened or not
        //Assert.assertTrue(driver.findElement(By.cssSelector(".float\\-cart__content")).isDisplayed());

        // Check the product inside the cart is same as of the main page
        //String productOnCartText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")).getText();
        //Assert.assertEquals(productOnScreenText, productOnCartText);
    }
}

// go to https://uat-portal.myaii.com/AIIQ/Dashboard
// click on New Quote button
//check if we are on https://uat-portal.myaii.com/AIIQ/Address
// locate the input box to write the address
// write the address
// click on the suggested address
// click on the Start Quote button


// New Quote- Step 1: Customer Information
// select "No" radio button for "Is the property rented?"
// get today's date in the format "mm/dd/yyyy"
//String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")); 
// select "today's date" for the "Desired Policy Effective Date"
// select "Individual" for "What is the prospective customer type?"
// Write the first name in the "First Name" input box
// Write the last name in the "Last Name" input box
// Select DOB for the "DOB" input box
// Click on the "Next Step" button

// New Quote- Step 2: Dwelling Information
//Click on the "Next Step" button

// New Quote- Step 3: Review Information
//Click on the "Next Step" button