package Kadir.stepDefinitions;

import Kadir.pages.RegisterPage;
import Kadir.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class QA_demoRegister extends BrowserUtils {
RegisterPage register=new RegisterPage();
    @Given("Go to website")
    public void go_to_website() {

    }
    @When("Click New User button")
    public void click_new_user_button() {
       register.setNewUser();
    }
    @Then("Register to Book Store")
    public void register_to_book_store(@NotNull Map<String,String> dataTable) {
        register.setFirstname(dataTable.get("FirstName"));
        register.setLastname(dataTable.get("Last Name"));
        register.setUserName(dataTable.get("UserName"));
        register.setPassword(dataTable.get("Password"));
    }
    @Then("Click to Register button")
    public void click_to_register_button() {
        register.setRegister();
    }
}
