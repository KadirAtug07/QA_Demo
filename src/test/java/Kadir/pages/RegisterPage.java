package Kadir.pages;

import Kadir.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BrowserUtils {

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "newUser")
    private WebElement newUser;
    @FindBy(id = "firstname")
    private WebElement firstname;
    @FindBy(id = "lastname")
    private WebElement lastname;
    @FindBy(id = "userName")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "register")
    private WebElement register;






    public void setNewUser(){
        newUser.click();
    }
    public void setFirstname(String firstName){
        firstname.sendKeys(firstName);
    }
    public void setLastname(String lastName){
        lastname.sendKeys(lastName);
    }
    public void setUserName(String username){
        userName.sendKeys(username);
    }
    public void setPassword(String password1){
        password.sendKeys(password1);
    }
    public void setRegister(){
        register.click();
    }
}
