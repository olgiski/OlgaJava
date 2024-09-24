package automationTasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class AccountConfirmationPage {
    public AccountConfirmationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a//b")
    WebElement confirmMessage;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public void accountConfirmation(String expectedConfirmMessage){
        Assert.assertEquals(BrowserUtils.getText(confirmMessage),expectedConfirmMessage);
    }
    public void continueButtonClick(){
        continueButton.click();
    }

}
