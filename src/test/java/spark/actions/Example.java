package spark.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import spark.steps.UserSteps;

/**
 * Created by pchien on 10/14/15.
 */
public class Example {
    UserSteps userSteps = new UserSteps();
	WebDriver driver = null;


    @Given("^Maven plugin is awesome$")
    public void Maven_plugin_is_awesome() throws Throwable {
    	System.out.println("test");
    	 System.setProperty(
                 "webdriver.chrome.driver",
                 "E://chromedriver.exe");

         driver = new ChromeDriver();
    	//driver = new ChromeDriver(); 
         
        driver.navigate().to("http://done.local");
        driver.manage().window().maximize();
        driver.findElement(By.name("mail_address")).sendKeys("sally-dev@dac.co.jp");
        driver.findElement(By.name("password")).sendKeys("sally");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='form-handler']/button")).click();
        
        Thread.sleep(2000);
        //driver.findElement(By.linkText("ログイン"));
        //driver.findElement(By.className("btn btn-lg btn-primary"));
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "http://done.local/#a/736afbdc388752eb/dashboard")){ 
                   System.out.println("Test1 Pass"); 
             } else { 
                System.out.println("Test1 Failed"); 
             } 
             //driver.close();
    }

    @When("^I already installed Jenkins$")
    public void I_already_installed_Jenkins() throws Throwable {
    }

    @And("^I use Maven command to control Cucumber$")
    public void I_use_Maven_command_to_control_Cucumber() throws Throwable {

    }

    @Then("^I know how to operate the test$")
    public void I_know_how_to_operate_the_test() throws Throwable {
        System.out.print("This is just an example*****\n");
    }
}
