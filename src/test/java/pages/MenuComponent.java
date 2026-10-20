package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MenuComponent {
    private SelenideElement menuLogo= $("img[alt='БСТ']");
    private SelenideElement menuLogin = $(byText("Войти"));
    private SelenideElement menuBroadcast = $(byText("Эфир БСТ24"));
    private SelenideElement menuSearch = $(byText("Поиск"));
    private SelenideElement menuArchive = $(byText("Архив"));
    private SelenideElement menuComments = $(byText("Комментарии"));
    private SelenideElement menuAdvertising = $(byText("Реклама"));
    private SelenideElement menuTicker = $(byText("Бегущая строка"));
    private SelenideElement sideMenuOpeningButton = $("a.tab-link .f7-icons");

    @Step("Проверка отображения логотипа и его текст")
    public MenuComponent checkMenuLogo (){
        menuLogo.shouldBe(visible).shouldHave(attribute("alt", "БСТ"));
        return this;
    }

    @Step("Нажать на кнопку 'Войти' ")
    public MenuComponent clickMenuLogin() {
        menuLogin.click();
        return this;
    }

    @Step("Нажать на кнопку 'Эфир БСТ24' ")
    public MenuComponent clickMenuBroadcast() {
        menuBroadcast.click();
        return this;
    }

    @Step("Нажать на кнопку 'Поиск'")
    public MenuComponent clickMenuSearch() {
        menuSearch.click();
        return this;
    }

    @Step("Нажать на кнопку 'Архив'")
    public MenuComponent clickMenuArchive() {
        menuArchive.click();
        return this;
    }

    @Step("Нажать на кнопку 'Комметарии'")
    public MenuComponent clickMenuComments() {
        menuComments.click();
        return this;
    }

    @Step("Нажать на кнопку 'Реклама'")
    public MenuComponent clickMenuAdvertising() {
        menuAdvertising.click();
        return this;
    }

    @Step("Нажать на кнопку 'Бегущая строка'")
    public MenuComponent clickMenuTicker() {
        menuTicker.click();
        return this;
    }

    @Step("Нажать на кнпку для открытия бокового меню")
    public MenuComponent clickSideMenuOpeningButton() {
        sideMenuOpeningButton.click();
        return this;
    }
}
