package tests.UI;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.MenuComponent;
import tests.DataTest;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static tests.DataTest.t;
import static tests.DataTest.t2;

public class MainPageTest extends TestBase {

    MainPage mainPage = new MainPage();
    MenuComponent menuComponent = new MenuComponent();


    @Test
    @DisplayName("Успешная авторизация с валидными данными")
    public void checkOnTheMediaListHomePage() {

        step("[UI] Перейти на главную страницу и проверить текст в медиа блоке", () -> {

            mainPage
                    .openMainPage()
                    .checkOnAirText(t)
                    .checkOnlyNewsText(t2);
        });

    }

    @Test
    @DisplayName("Проверка логотипа сайта")
    public void checkLogo() {
        step("[UI] Проверка логотипа в меню сайта ", () -> {

            mainPage
                    .openMainPage();
            menuComponent
                    .checkMenuLogo();
        });
    }

    @Test
    @DisplayName("Нажать на кнопку Войти и проверить модульное окно")
    public void clickButtonLogin() {
        step("[UI] Проверка логотипа в меню сайта ", () -> {
            mainPage.openMainPage();

            menuComponent
                    .clickMenuLogin();
            mainPage
                    .checkModalWindow()
                    .checkHeadlineText();
        });
    }

    @Test
    @DisplayName("Нажать на кнопку Регистрации в модальном окне")
    public void clickRegistrationButtonTest() {
        step("[UI] ", () -> {
            mainPage.openMainPage();

            menuComponent
                    .clickMenuLogin();
            mainPage
                    .clickRegistrationButton();
        });
    }
}
