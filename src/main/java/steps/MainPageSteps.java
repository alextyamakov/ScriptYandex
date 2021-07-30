package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {

    @Step("Перейти в яндекс маркет{0}")
    public void selectStepMarket (String menuItem) {
        new MainPage().selectMarket(menuItem);
    }




}
