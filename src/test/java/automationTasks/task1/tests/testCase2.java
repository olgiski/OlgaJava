package automationTasks.task1.tests;

import automationTasks.task1.pages.AccountConfirmationPage;
import automationTasks.task1.pages.AccountCreationPage;
import automationTasks.task1.pages.LogInSignUpPage;
import automationTasks.task1.pages.MainPage;
import io.opentelemetry.semconv.SemanticAttributes;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.util.concurrent.Semaphore;

public class testCase2 extends AETask1Base {
    @Parameters({"expectedText","expectedMessage"})
    @Test
    public void validateSignInFunctionality(String expectedText, String expectedMessage) throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageDisplayed();
        LogInSignUpPage signUp = new LogInSignUpPage(driver);
        mainPage.logInSignUp();
        signUp.loginTab(expectedText);
        signUp.loginToYourAccount(ConfigReader.readProperty("aeSignupEmail"),
                ConfigReader.readProperty("aePassword"));
        AccountConfirmationPage confirmation = new AccountConfirmationPage(driver);
        confirmation.accountConfirmation(expectedMessage);
        mainPage.accountDelete("ACCOUNT DELETED");
    }

}
