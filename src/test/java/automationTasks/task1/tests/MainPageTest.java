package automationTasks.task1.tests;

import automationTasks.task1.pages.MainPage;
import org.testng.annotations.Test;


public class MainPageTest extends AETask1Base {
    @Test
    public void validateMainPage(){
        MainPage aeTask1MainPage = new MainPage(driver);
        aeTask1MainPage.mainPageDisplayed();
        aeTask1MainPage.logInSignUp();

    }
}
