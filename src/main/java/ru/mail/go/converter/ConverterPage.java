package ru.mail.go.converter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConverterPage {
    WebDriver driver;

    public ConverterPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstCurrency() {
        WebElement firstCurrency = driver.findElement(By.id("icode"));
        return firstCurrency.getText();
    }
    public String getSecondCurrency() {
        WebElement secondCurrency = driver.findElement(By.id("ocode"));
        return secondCurrency.getText();
    }
    public void clickChangeConverter() {
        WebElement changeConverter = driver.findElement(By.id("change_conv"));
        changeConverter.click();
    }
    public NewsPage clickButtonDynamics() {
        WebElement button = driver.findElement(By.cssSelector("div.smack-converter__footer")).findElement(By.linkText("динамика"));
        button.click();
        //getCurrentTitle(button);
        return new NewsPage (driver);
    }
    public void enterText() {
        WebElement form = driver.findElement(By.id("ival"));
        form.clear();
        form.sendKeys("2");
    }
    public String getRub() {
        WebElement rub = driver.findElement(By.id("oval"));
        return rub.getText();
    }
    public void clickCurrencyName() {
        WebElement firstCurrency = driver.findElement(By.id("icode"));
        WebElement listingCurrency = driver.findElement(By.cssSelector("ul.smack-converter_list-block"));
        firstCurrency.click();
        listingCurrency.findElement(By.tagName("span")).click();
    }
    public BankPage clickLinkOfCurrencyRate() {
        WebElement link = driver.findElement(By.className("smack-converter__course"));
        link.findElement(By.tagName("a")).click();
        return new BankPage(driver);
    }
    public String getCurrentTitle(WebElement commonLink) {
        String title = driver.getTitle();
        return title;
    }
}