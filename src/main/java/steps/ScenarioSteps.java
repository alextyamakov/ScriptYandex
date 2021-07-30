package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;


public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();
    MarketFilteredPageSteps marketFilteredPageSteps = new MarketFilteredPageSteps();

    @When("^Перейти в яндекс маркет \"(.+)\"$")
    public void selectStepMarket(String menuItem) {mainPageSteps.selectStepMarket(menuItem);    }

    @When("^Перейти на вторую вкладку$")
    public void selectSecondTab() {
        String winHandleBefore = BaseSteps.driver.getWindowHandle();
        for(String winHandle : BaseSteps.driver.getWindowHandles()){
            if(!winHandle.equals(winHandleBefore)) {
                BaseSteps.driver.switchTo().window(winHandle);
    }}}

    @When("^Выбран раздел Электроника\"(.+)\"$")
    public void selectStepElectronics(String itemName){marketPageSteps.selectStepElectronics(itemName);    }


    @When("^Выбран подраздел \"(.+)\"$")
    public void selectSection(String menuItem){marketPageSteps.selectStepSelect(menuItem);    }

    @When("^Выбран расширенный поиск \"(.+)\"$")
    public void selectStepAllFilters(String menuItem){marketPageSteps.selectStepAllFilters(menuItem);   }

    @Then("^Задан параметр поиска от n рублей \"(.+)\"$")
    public void selectStepPrice(String value){marketPageSteps.selectStepPrice(value);   }

    @When("^Нажата кнопка все бренды$")
    public void selectStepAllBrands(){marketPageSteps.selectStepAllBrands();   }

    @When("^Выбран производитель \"(.+)\"$")
    public void selectStepBrand(String itemName){marketPageSteps.selectStepBrand(itemName);   }

    @When("^Нажата кнопку Применить$")
    public void selectStepFilterExecute(){marketPageSteps.selectStepFilterExecute();   }

    @Then("^Проверено, что элементов на странице 12 \"([^\"]*)\",\"([^\"]*)\"$")
    public void selectStepAssertElements(Integer expected, String title){marketFilteredPageSteps.selectStepAssertElements(expected, title);   }

    @When("^Сохранен первый элемент в списке$")
    public void selectStepSaveFirstElements(){marketFilteredPageSteps.selectStepSaveFirstElements();   }

    @When("^В поисковую строку введено сохраненное значение$")
    public void selectStepSearchFirstElements(){marketFilteredPageSteps.selectStepSearchFirstElements();}

    @Then("^Найти и проверить, что наименование товара соответствует сохраненному значению$")
    public void selectStepAssertSearchElements(){marketFilteredPageSteps.selectStepAssertSearchElements();}

}
