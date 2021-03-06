package annotation;


import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class WikipediaSteps {

   private WebDriver driver;

   @Before
   public void before() {
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      driver = new ChromeDriver();
      driver.navigate().to("http://en.wikipedia.org");
   }

   @After
   public void after() {
      driver.quit();
   }

   @Given("^Enter search term '(.*?)'$")
   public void searchFor(String searchTerm) {
      WebElement searchField = driver.findElement(By.id("searchInput"));
      searchField.sendKeys(searchTerm);
   }

   @When("^Do search$")
   public void clickSearchButton() {
      WebElement searchButton = driver.findElement(By.id("searchButton"));
      searchButton.click();
   }

   @Then("^Single result is shown for '(.*?)'$")
   public void assertSingleResult(String searchResult) throws InterruptedException {
      WebElement results = driver
              .findElement(By.cssSelector("div#mw-content-text.mw-content-ltr p"));
      assertFalse(results.getText().contains(searchResult + " may refer to:"));
      assertTrue(results.getText().startsWith(searchResult));
      System.out.println(results.getText());
      Thread.sleep(20000);
   }

   @When("^Kitas veiksmas$")
   public void kitasVeiksmas() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      //throw new PendingException();
   }

    @When("^Teorines paskaitos trukme$")
    public void teorinesPaskaitosTrukme() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}