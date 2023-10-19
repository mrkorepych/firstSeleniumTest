package example;

import example.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(Constants.MAIN_PAGE_URL);

        String actualTitle = chromeDriver.getTitle();
        Assertions.assertEquals(Constants.MAIN_PAGE_TITLE, actualTitle);

        WebElement elementsText = chromeDriver.findElement(By.xpath(Constants.ELEMENTS_TEXT));
        Assertions.assertTrue(elementsText.isDisplayed());

        WebElement formsText = chromeDriver.findElement(By.xpath(Constants.FORMS_TEXT));
        Assertions.assertTrue(formsText.isDisplayed());

        WebElement alertsText = chromeDriver.findElement(By.xpath(Constants.ALERTS_TEXT));
        Assertions.assertTrue(alertsText.isDisplayed());

        WebElement widgetsText = chromeDriver.findElement(By.xpath(Constants.WIDGETS_TEXT));
        Assertions.assertTrue(widgetsText.isDisplayed());

        WebElement interactionsText = chromeDriver.findElement(By.xpath(Constants.INTERACTIONS_TEXT));
        Assertions.assertTrue(interactionsText.isDisplayed());

        WebElement booksStoreText = chromeDriver.findElement(By.xpath(Constants.BOOKS_STORE_TEXT));
        Assertions.assertTrue(booksStoreText.isDisplayed());

        chromeDriver.close();
    }
}
