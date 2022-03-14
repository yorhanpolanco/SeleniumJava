package javaSeleniumCucumber;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchGoogle {

	private WebDriver driver;
    int count = 0;
    WebElement box;
    


   @Given("^user is in google page$")
    public void setupBrowser() {

     /*   System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");*/
    }

   
   @When("^user enter dummy login page in the search bar$")
    public void search() {
    	 /* box = driver.findElement(By.name("q"));

        box.clear();
        box.sendKeys("dummy login page for testing");*/
    }

    @And("^user submint search$")
    public void submint() {
    	/*  box = driver.findElement(By.name("q"));

        box.submit();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);*/
    }

    @Then("^google returns result$")
    public void result() {
/*
        // @SuppressWarnings("deprecation")
        // WebDriverWait wait = new WebDriverWait(driver, 2000);
        // wait = new WebDriverWait(driver, 2000);
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.urlContains("dummy"));*/
    }

    @Given("^user is in google result$")
    public void userInresult() {

     /*   //assertEquals("dummy login page for testing - Buscar con Google", driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println("Este es el url " + url);*/

    }

   @When("^user clicks in the link of dummy login page$")
    public void user_clicks_in_the_link() {
	   System.out.println("impresion desde consola");

/*
        List < WebElement > list = driver.findElements(By.cssSelector("#rso > div > div > div > div a h3"));

        for (WebElement element: list) {
            String list1;

            if (element.getText().isEmpty() || element.getText().replaceAll(" ", "").equals("")) {
                continue;
            } else {
                count = ++count;
                list1 = element.getText().toLowerCase().replaceAll(" ", "");

                if (list1.contains("stealmylogin".toLowerCase().replaceAll(" ", ""))) {
                    element.click();
                    //login();
                    break;
                }

            }

            System.out.println("Este es el " + count + " " + list1);
        } //WebDriverWait wait = new WebDriverWait(driver, 2000);
        WebDriverWait wait = new WebDriverWait(driver, 2000);

        wait.until(ExpectedConditions.urlContains("login"));*/
    }

 
  /******************************

    @And("^enters (\\d+) and (\\d+)$")
    public void enters_user_and_pass(String user, String password) {
       /* WebElement user1 = driver.findElement(By.cssSelector("input[type=text]:nth-child(2)"));
        WebElement pass1 = driver.findElement(By.cssSelector("input[type=password]:nth-child(5)"));

        user1.clear();
        user1.sendKeys(user1);
        pass1.clear();
        pass1.sendKeys(pass2);
    }*/


    @And("^user click on login button$")
    public void login() {
       /* WebElement login = driver.findElement(By.cssSelector("input[type=submit]:nth-child(7)"));
        WebDriverWait wait = new WebDriverWait(driver, 2000);

        wait.until(ExpectedConditions.elementToBeClickable(login));

        login.click();*/

    }

    @Then("^the web page shows a confirmation message$")
    public void validation() {
/*
        WebElement menssage = driver.findElement(By.cssSelector("body > div > h1"));

        if (menssage.getText().toLowerCase().replaceAll(" ", "").contains("Example Domain".toLowerCase().replaceAll(" ", ""))) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.querySelector('body > div > h1').style.backgroundColor = 'green'");
        } else {
            System.out.println("Validacion no pasada");
        }
*/
    }

	
	
	
    public void closeBrowser() {
        driver.quit();
    }
	

}
