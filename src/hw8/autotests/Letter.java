package hw8.autotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Letter {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://mail.yandex.by/?uid=5252412#inbox");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // кнопка "Войти"
        webDriver.findElement(By.xpath("//*[@id=\"index-page-container\"]/div/div[2]/div/div/div[4]/a[2]")).click();

        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"passp-field-login\"]"));
        login.sendKeys("melika@yandex.ru");
        login.submit();

        WebElement pass = webDriver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]"));
        pass.sendKeys("5a8k9dNR");
        pass.submit();

        // кнопка "Написать"
        webDriver.findElement(By.xpath("//a[@class=\"mail-ComposeButton js-main-action-compose\"]")).click();

        // поле "Кому"
        webDriver.findElement(By.xpath("//div[@class=\"composeYabbles\"]")).sendKeys("melika@yandex.ru");

        // поле "Тема"
        webDriver.findElement(By.xpath("//input[@class=\"composeTextField ComposeSubject-TextField\"]")).sendKeys("test");

        // текст письма
        webDriver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/div")).sendKeys("Some text for test");

        // кнопка "Отправить"
        webDriver.findElement(By.xpath("//div[@class=\"ComposeControlPanelButton ComposeControlPanel-Button ComposeControlPanel-SendButton ComposeSendButton ComposeSendButton_desktop\"]")).click();

        // Вернуться во "Входящие"
        webDriver.findElement(By.xpath("//a[@class=\"control link link_theme_normal ComposeDoneScreen-Link\"]")).click();

        List<WebElement> results = webDriver.findElements(By.xpath("//*[@id=\"nb-1\"]/body/div[2]/div[6]/div/div[3]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div/div"));

        results.get(0).click();

        WebElement textLetter = webDriver.findElement(By.xpath("//*[@id=\"nb-1\"]"));
        if (textLetter.isDisplayed()) {
            System.out.printf("%s letters were found. The letter is sent. The letter is opened. Test passed", results.size());
        } else {
            System.out.println("The letter is not sent. Test failed");
        }

        webDriver.quit();
    }
}