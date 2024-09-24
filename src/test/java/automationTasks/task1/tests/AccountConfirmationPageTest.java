package automationTasks.task1.tests;

import automationTasks.task1.pages.AccountConfirmationPage;
import automationTasks.task1.pages.AccountCreationPage;
import automationTasks.task1.pages.LogInSignUpPage;
import automationTasks.task1.pages.MainPage;
import org.testng.annotations.Test;

public class AccountConfirmationPageTest extends AETask1Base {
    @Test
    public void validateAccountCreation() throws InterruptedException {
        MainPage aeTask1MainPage = new MainPage(driver);
        aeTask1MainPage.mainPageDisplayed();
        aeTask1MainPage.logInSignUp();
        LogInSignUpPage aeTask1LogInSignUpPage= new LogInSignUpPage(driver);
        aeTask1LogInSignUpPage.newUserTab("New User Signup!");
        aeTask1LogInSignUpPage.signUp("Olga One", "olepolm@gmail.com");
        AccountCreationPage aeTask1AccountCreationPage = new AccountCreationPage(driver);
        aeTask1AccountCreationPage.accountMessage("ENTER ACCOUNT INFORMATION");
        aeTask1AccountCreationPage.fillAccountInfo(driver,"o12345","January","2000","Olga",
                "One","TestCompany","2000 Main St","United States",
                "IL","Des Plaines",
                "60076", "7731234343");
        AccountConfirmationPage aeTask1AccountConfirmationPage = new AccountConfirmationPage(driver);
        aeTask1AccountConfirmationPage.accountConfirmation("ACCOUNT CREATED!");
        aeTask1MainPage.loggedIn("Logged in as ","Olga One");
        aeTask1MainPage.accountDelete("ACCOUNT DELETED!");
        aeTask1MainPage.deleteColor("color", "rgba(0, 128, 0, 1)");
    }
}
