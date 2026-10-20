package tests;



import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


    @BeforeAll
    public static void setUpUi() {

        RestAssured.baseURI = "https://bst.bratsk.ru/";
        RestAssured.basePath = "/api/v1";
    }
}
