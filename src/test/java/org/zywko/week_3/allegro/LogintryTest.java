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
public class LogintryTest {
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
  public void logintry() {
    driver.get("https://allegro.pl/");
    driver.manage().window().setSize(new Dimension(1280, 680));
    driver.findElement(By.cssSelector(".eut9m > .mpof_z0")).click();
    driver.findElement(By.cssSelector(".\\_b4f07_WuuMm")).click();
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("login")).sendKeys("notexists@domain.com");
    js.executeScript("window.scrollTo(0,81.33333587646484)");
    driver.findElement(By.id("password")).sendKeys("thisislongpassword");
    driver.findElement(By.cssSelector(".msts_enp")).click();
    js.executeScript("window.scrollTo(0,142)");
  }
}