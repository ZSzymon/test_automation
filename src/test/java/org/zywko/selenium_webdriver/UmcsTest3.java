package org.zywko.selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class UmcsTest3 {
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
  public void umcs() throws IOException {
    driver.get("https://www.umcs.pl/");
    driver.manage().window().setSize(new Dimension(1280, 680));
    String xpath = "/html/body/div[4]/div/div/div[2]/div/a[2]/img";
    WebElement element = driver.findElement(By.xpath(xpath));

    String srcValue = element.getAttribute("src");
    System.out.println(srcValue);

//    driver.get(srcValue);
    BufferedImage saveImage = null;
    try {
      saveImage = ImageIO.read(new URL(srcValue));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    ImageIO.write(saveImage, "jpg", new File("C:\\Users\\zywko\\IdeaProjects\\test_automation\\src\\test\\java\\org\\zywko\\selenium_webdriver\\insta.jpg"));
    driver.quit();
  }
}

