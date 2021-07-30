package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step ("Выбран раздел Электроника{0}")
    public void selectStepElectronics(String itemName) {
        new MarketPage().selectSectionElectronics(itemName);
    }

    @Step ("Выбран подраздел{0}")
    public void selectStepSelect(String menuItem) {
        new MarketPage().selectSectionSelect(menuItem);
    }

    @Step ("Выбран расширенный поиск{0}")
    public void selectStepAllFilters(String menuItem) {
        new MarketPage().selectButtonAllFilters(menuItem);
    }

    @Step ("Задан параметр поиска от n рублей{0}")
    public void selectStepPrice(String value) {
        new MarketPage().fillFieldPrice(value);
    }

    @Step ("Нажата кнопка все бренды")
    public void selectStepAllBrands() { new MarketPage().selectAllBrands();    }

    @Step ("Выбран производитель {0}")
    public void selectStepBrand(String itemName) {
        new MarketPage().selectCheckBoxBrand(itemName);
    }

    @Step ("Нажата кнопку Применить{0}")
    public void selectStepFilterExecute() { new MarketPage().selectFilterExecute();
    }


}
