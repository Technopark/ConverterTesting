package ru.mail.go.converter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainConverterPage {
	WebDriver driver;

	public MainConverterPage(WebDriver driver) {
		this.driver = driver;
	}

	public ConverterPage search_form_currency_converter() {
		WebElement searchForm = driver.findElement(By.id("q"));
		searchForm.sendKeys("курс валют");
		WebElement searchButton = driver.findElement(By
				.className("go-form__submit"));
		searchButton.click();
		return new ConverterPage(driver);
	}

	public ConverterPage search_form_currency_converter_with_other_request(
			String str) {
		WebElement searchForm = driver.findElement(By.id("q"));
		searchForm.sendKeys(str);
		WebElement searchButton = driver.findElement(By
				.className("go-form__submit"));
		searchButton.click();
		return new ConverterPage(driver);
	}

}