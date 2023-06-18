package org.zywko.selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UmcsTest5 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\zywko\\IdeaProjects\\test_automation\\src\\main\\resources\\chromedriver.exe");
    driver = new ChromeDriver(options);
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void umcs() {
    driver.get("https://www.umcs.pl/");
    driver.manage().window().setSize(new Dimension(1280, 680));
    assertThat(driver.findElement(By.linkText("Pracownik")).getText(), is("Pracownik"));
    driver.findElement(By.linkText("PL")).click();
    driver.findElement(By.cssSelector(".en")).click();
    assertThat(driver.findElement(By.linkText("International Research")).getText(), is("International Research"));
  }
}

