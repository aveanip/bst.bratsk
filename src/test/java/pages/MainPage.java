package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    MenuComponent menuComponent = new MenuComponent();

    private final SelenideElement textOnListMediaList = $(".item-title");
    private final SelenideElement onlyNewsToggle = $(byText("только новости"));
    private final SelenideElement modalWindow = $(".page-content1");
    private final SelenideElement headlineText= $(byText("Войдите на сайт"));
    private final SelenideElement headlineText2= $(byText("или зарегистрируйтесь"));

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        open("https://bst.bratsk.ru/");
        return this;
    }

    @Step("Проверить текст 'Сейчас в эфире'")

    public MainPage checkOnAirText(String value) {
        textOnListMediaList.shouldBe(visible).shouldHave(text(value));
        return this;
    }

    @Step("Проверить текст 'ТОЛЬКО НОВОСТИ'")

    public MainPage checkOnlyNewsText(String value) {
        onlyNewsToggle.shouldBe(visible).shouldHave(text(value));
        return this;
    }

    @Step("Проверить, что открылось модальное окно Войдите на сайт")
    public MainPage checkModalWindow() {
        modalWindow.shouldBe(visible);
        return this;
    }

    @Step("Проверить, заголовок Войдите на сайт или зарегистрируйтесь")
    public MainPage checkHeadlineText() {
        headlineText.shouldBe(visible);
        headlineText2.shouldBe(visible);
        return this;
    }

    @Step("Нажать на кнопку Регистрации")
    public MainPage clickRegistrationButton() {
        headlineText2.shouldBe(visible).click();
        return this;
    }


}
