package steps;

import pages.MarketFilteredPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketFilteredPageSteps {


    @Step ("Проверено, что элементов на странице 12{0}")
    public void selectStepAssertElements(Integer expected, String title) {
        new MarketFilteredPage().assertElements(expected, title);
    }

    @Step ("Сохранен первый элемент в списке{0}")
    public void selectStepSaveFirstElements() {
        new MarketFilteredPage().fillFirstElement();
    }

    @Step ("В поисковую строку введено запомненное значение{0}")
    public void selectStepSearchFirstElements() {
        new MarketFilteredPage().searchFirstElement();
    }
    @Step ("Найти и проверить, что наименование товара соответствует запомненному значению{0}")
    public void selectStepAssertSearchElements() {
        new MarketFilteredPage().assertSearchElements();
    }

}
