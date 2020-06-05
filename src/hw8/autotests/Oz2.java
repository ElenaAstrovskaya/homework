package hw8.autotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Oz2 {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://oz.by/");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement filters = webDriver.findElement(By.xpath("//li[@class=\"main-nav__list__li main-nav__list__li_wnav\"]"));
        if (filters.isDisplayed()){
            System.out.println("The filters are displayed");
        } else {
            System.out.println("Something has gone wrong");
        }

        ArrayList<String> nameFilters = new ArrayList<>();
        nameFilters.add("Продукты, деликатесы");
        nameFilters.add("Книги");
        nameFilters.add("Косметика, парфюмерия");
        nameFilters.add("Дом, сад, зоотовары");
        nameFilters.add("Развлечения, творчество");
        nameFilters.add("Канцтовары, учёба");
        nameFilters.add("Сувениры, подарки");
        nameFilters.add("Детям и мамам");
        nameFilters.add("Туризм, отдых, спорт");
        nameFilters.add("Техника, электроника");
        nameFilters.add("Здоровье, медтехника");

        List<WebElement> results = webDriver.findElements(By.xpath("//li[@class=\"main-nav__list__li main-nav__list__li_wnav\"]"));

        int count = 0;
        for (int i = 0; i < nameFilters.size(); i++) {
            if (nameFilters.get(i).equals(results.get(i).getText())){
                count++;
            }
        }
        if (count == nameFilters.size()){
            System.out.println("Name of filters are matched");
        } else {
            System.out.println("Something has gone wrong");
        }

        webDriver.quit();
    }
}