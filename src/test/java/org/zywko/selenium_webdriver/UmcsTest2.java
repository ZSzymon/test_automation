package org.zywko.selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class UmcsTest2 {
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
    driver.findElement(By.linkText("O Uniwersytecie")).click();
    String xpath = "/html/body/div[2]/div[1]/div/div/ul[1]/li[6]/a";
    WebElement element = driver.findElement(By.xpath(xpath));
    String text = element.getText();
    System.out.print(text);
    assert text.equals("Pracownik") ;
  }
}
