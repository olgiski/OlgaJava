package automationTasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class AccountCreationPage {
    public AccountCreationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//b[contains(text(),'Enter Account')]")
    WebElement accountMessage;
    @FindBy (css = "#id_gender2")
    WebElement titleFemale;
    @FindBy(css = "#password")
    WebElement passwordBox;
    @FindBy (css ="#days")
    WebElement dayOfBirth;
    @FindBy(css ="#months")
    WebElement monthOfBirth;
    @FindBy(css ="#years")
    WebElement yearOfBirth;
    @FindBy(css ="#newsletter")
    WebElement newsletter;
    @FindBy (css="#optin")
    WebElement optin;
    @FindBy(css="#first_name")
    WebElement firstName;
    @FindBy(css="#last_name")
    WebElement lastName;
    @FindBy(css="#company")
    WebElement companyName;
    @FindBy(css="#address1")
    WebElement address;
    @FindBy (xpath = "//select[@id='country']")
    WebElement selectCountry;
    @FindBy(css="#state")
    WebElement state;
    @FindBy(css="#city")
    WebElement city;
    @FindBy(css="#zipcode")
    WebElement zipcode;
    @FindBy(css="#mobile_number")
    WebElement phone;
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement createAccountButton;

    public void accountMessage(String expectedAccountMessage){
        Assert.assertEquals(accountMessage.getText(),expectedAccountMessage);
    }

    public void fillAccountInfo(WebDriver driver,String password,String month,String year,String fname,String lname, String cName,String address,
                                String country,String state,String city, String zipcode,
                                String phonenumber) throws InterruptedException {
       titleFemale.click();
       passwordBox.sendKeys(password);
       BrowserUtils.selectBy(dayOfBirth,"1","text");
       BrowserUtils.selectBy(monthOfBirth,month,"text");
       BrowserUtils.selectBy(yearOfBirth,year,"text");
       Thread.sleep(1000);
       BrowserUtils.scrollIntoView(driver,newsletter);
       newsletter.click();
       Thread.sleep(1000);
       BrowserUtils.scrollIntoView(driver,optin);
       optin.click();
       firstName.sendKeys(fname);
       lastName.sendKeys(lname);
       companyName.sendKeys(cName);
       this.address.sendKeys(address);
        BrowserUtils.selectBy(selectCountry,country,"text");
        this.state.sendKeys(state);
        this.city.sendKeys(city);
        this.zipcode.sendKeys(zipcode);
        phone.sendKeys(phonenumber);
        Thread.sleep(1000);
        createAccountButton.click();


    }



}
