package automationTasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="#header")
    WebElement header;
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    WebElement signInButton;
    @FindBy(xpath = "//header//div//div//a[contains(text(),'Logged')]")
    WebElement loggedIn;
    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    WebElement deleteAccount;
    @FindBy(xpath = "//h2//b")
    WebElement deleteConfirm;

    public void mainPageDisplayed(){
        Assert.assertTrue(header.isDisplayed());
    }
    public void logInSignUp(){
        signInButton.click();
    }

    public void loggedIn(String expectedLogIn,String name){
        System.out.println(BrowserUtils.getText(loggedIn));
        Assert.assertTrue(BrowserUtils.getText(loggedIn).contains(name));
    }
    public void accountDelete(String expectedDeleteMessage){
        deleteAccount.click();
        Assert.assertTrue(BrowserUtils.getText(deleteConfirm).contains(expectedDeleteMessage));
    }
    public void deleteColor(String cssAttribute,String value){
        Assert.assertEquals(deleteConfirm.getCssValue(cssAttribute),value);
    }

}