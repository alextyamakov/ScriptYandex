package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

public class MarketFilteredPage extends BasePageObject {

    @FindBy(xpath = "//div//h3/a/span")
    List<WebElement> list1;

    @FindBy(xpath = "//input[@placeholder = 'Искать товары']")
    WebElement searchLine;

    @FindBy(xpath = "//div[2]//form/div/button")
    WebElement searchExecute;

    @FindBy(xpath = "//div/div[1]/div/div/article[1]/div[4]/div[1]/h3/a")
    WebElement firstAfterSearchElements;



    public MarketFilteredPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(BaseSteps.driver, 30);

    public void assertElements (Integer expected, String title) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'"+title+"')]")));
        Integer actual = list1.size();
        Assert.assertEquals("Количество элементов на странице не 12", expected, actual);
    }

    final static String firstElement = BaseSteps.driver.findElement(By.xpath("//div/div[1]/div/div/article[1]/div[4]/div[1]/h3/a/span")).getText();

    public void fillFirstElement () {
        fillField(searchLine,firstElement);
    }

    public void searchFirstElement () {
        ((JavascriptExecutor) BaseSteps.driver).executeScript("arguments[0].scrollIntoView(true);", searchExecute);
        searchExecute.click();
    }

    public void assertSearchElements () {
        String actual = firstAfterSearchElements.getText();
        Assert.assertEquals("Название первого элемента не совпадает с поиском", firstElement, actual);

    }}
