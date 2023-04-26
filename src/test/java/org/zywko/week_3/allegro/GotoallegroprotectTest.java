package org.zywko.week3.allegro;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GotoallegroprotectTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void gotoallegroprotect() {
    driver.get("https://allegro.pl/");
    driver.manage().window().setSize(new Dimension(1280, 680));
    js.executeScript("window.scrollTo(0,1462.6666259765625)");
    js.executeScript("window.scrollTo(0,4853.33349609375)");
    driver.findElement(By.linkText("Allegro Protect")).click();
    js.executeScript("window.scrollTo(0,156.6666717529297)");
    js.executeScript("window.scrollTo(0,484.6666564941406)");
    js.executeScript("window.scrollTo(0,947.3333129882812)");
    js.executeScript("window.scrollTo(0,1700)");
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector(".ytp-large-play-button")).click();
    driver.findElement(By.cssSelector(".ytp-play-button")).click();
  }
}
