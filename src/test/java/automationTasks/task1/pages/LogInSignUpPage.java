package automationTasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class LogInSignUpPage {
    public LogInSignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//h2[contains(text(), 'New User Signup!')]")
    WebElement newUserTab;
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;
    @FindBy (xpath = "//input[contains(@data-qa,'signup-email')]")
    WebElement newUserEmail;
    @FindBy (xpath = "//button[contains(text(),'Signup')]")
    WebElement signUpButton;
    @FindBy(xpath = "//div//h2[contains(text(),'Login')]")
    WebElement loginTabText;
    @FindBy (xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailTab;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPasswordTab;
    @FindBy (xpath = "//button[.='Login']")
    WebElement confirmLoginButton;




    public void newUserTab(String expectedText){
        Assert.assertTrue(BrowserUtils.getText(newUserTab).contains(expectedText));
    }
    public void signUp (String name, String email) throws InterruptedException {
        this.name.sendKeys(name);
        newUserEmail.sendKeys(email);
        Thread.sleep(1000);
        signUpButton.click();
    }
    public void loginTab (String expectedText){
        Assert.assertEquals(BrowserUtils.getText(loginTabText),expectedText);
    }
    public void loginToYourAccount(String email, String password){
        loginEmailTab.sendKeys(email);
        loginPasswordTab.sendKeys(password);
        confirmLoginButton.click();
    }

}
