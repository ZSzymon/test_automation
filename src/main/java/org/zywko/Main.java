package org.zywko;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zywko\\IdeaProjects\\test_automation\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
    }
}
