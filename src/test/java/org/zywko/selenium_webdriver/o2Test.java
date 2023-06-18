package org.zywko.selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class o2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\zywko\\IdeaProjects\\test_automation\\src\\main\\resources\\chromedriver.exe");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("https://www.o2.pl/");
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void open() {
    driver.manage().window().setSize(new Dimension(1280, 680));

  }
}
