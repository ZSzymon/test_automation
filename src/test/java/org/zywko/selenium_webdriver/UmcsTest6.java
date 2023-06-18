package org.zywko.selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UmcsTest6 {
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
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void umcs() {
    driver.get("https://www.umcs.pl/");
    driver.manage().window().setSize(new Dimension(1280, 680));
    driver.findElement(By.cssSelector(".col-sx-6:nth-child(1) .title")).click();
//    js.executeScript("window.scrollTo(0,300)");
    driver.findElement(By.cssSelector(".col-sm-12")).click();
    vars.put("article_title", driver.findElement(By.cssSelector(".label-title")).getText());
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(text(),\'Więcej informacji na temat projektu i uczestników na stronie Przedsiębiorczego Lublina\')]"));
      assert(elements.size() > 0);
    }

    assert vars.get("article_title").toString().length() > 0;
  }
}

