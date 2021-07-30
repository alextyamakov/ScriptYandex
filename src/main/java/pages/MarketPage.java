package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends BasePageObject {

    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    public WebElement sectionElectronics;

    @FindBy(xpath = "//li/div/a[contains(text(),'')]")
    public WebElement sectionSelect;

    @FindBy(xpath = "//span[contains(text(),'Все фильтры')]")
    public WebElement buttonAllFilters;

    @FindBy(xpath = "//div[@data-filter-id = 'glprice']//div[@data-prefix = 'от']//input")
    WebElement fromPrice;

    @FindBy(xpath = "//div[7]//div/div/button")
    WebElement allBrands;

    @FindBy(xpath = "//*[@id]/div")
    WebElement checkboxBrand;

    @FindBy(xpath = "//div[3]/div/div/a[2]")
    WebElement filterExecute;


    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectSectionElectronics(String itemName){
        sectionElectronics.findElement(By.xpath("//span[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectSectionSelect(String itemName){
        sectionSelect.findElement(By.xpath("//li/div/a[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectButtonAllFilters(String itemName){
        buttonAllFilters.findElement(By.xpath("//span[contains(text(),'"+itemName+"')]")).click();
    }

    public void fillFieldPrice (String value) {
        fillField(fromPrice,value);
    }

    public void selectAllBrands(){
        ((JavascriptExecutor) BaseSteps.driver).executeScript("arguments[0].scrollIntoView(true);", allBrands);
        allBrands.click();
    }

    public void selectCheckBoxBrand (String itemName) {
        ((JavascriptExecutor) BaseSteps.driver).executeScript("arguments[0].scrollIntoView(true);", checkboxBrand.findElement(By.xpath("//*[@id='"+itemName+"']/div")));
        checkboxBrand.findElement(By.xpath("//*[@id='"+itemName+"']/div")).click();
    }

    public void selectFilterExecute () {
        ((JavascriptExecutor) BaseSteps.driver).executeScript("arguments[0].scrollIntoView(true);", filterExecute);
        filterExecute.click();
    }

}
