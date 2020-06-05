package hw8.autotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Email {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://mail.ru/");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement logField = webDriver.findElement(By.xpath("//*[@id=\"mailbox:login\"]"));
        logField.sendKeys("elena.astrovskaya01");
        logField.submit();

        WebElement passField = webDriver.findElement(By.xpath("//*[@id=\"mailbox:password\"]"));
        passField.sendKeys("2312NRKE");
        passField.submit();

        List<WebElement> results = webDriver.findElements(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div/div/a"));

        WebElement result = webDriver.findElement(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div/div/a"));
        if (result.isDisplayed()) {
            System.out.printf("The page is opened. Found %d results.\nTest passed", results.size());
        } else {
            System.out.println("The page is not opened. Test failed");
        }

        webDriver.quit();
    }
}