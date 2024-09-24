package automationTasks.task1.tests;

import automationTasks.task1.pages.LogInSignUpPage;
import automationTasks.task1.pages.MainPage;
import org.testng.annotations.Test;

public class LogInSignUpPageTest extends AETask1Base{
    @Test
    public void validateNewUserSignUp() throws InterruptedException {
        MainPage aeTask1MainPage = new MainPage(driver);
        aeTask1MainPage.mainPageDisplayed();
        aeTask1MainPage.logInSignUp();
        LogInSignUpPage aeTask1LogInSignUpPage= new LogInSignUpPage(driver);
        aeTask1LogInSignUpPage.newUserTab("New User Signup!");
        aeTask1LogInSignUpPage.signUp("Olga One", "ikfthjek@gmail.com");
    }
}
