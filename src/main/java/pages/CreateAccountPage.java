package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By passwordConfirmationField = By.id("password-confirmation");
    private By createAccountAndSubmitButton = By.cssSelector(".action.submit.primary");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void inputEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void inputPasswordConfirmation(String passconfirmation) {
        driver.findElement(passwordConfirmationField).sendKeys(passconfirmation);
    }

    public MyAccountPage clickOnCreateAccountAndSubmitButton() {
        driver.findElement(createAccountAndSubmitButton).click();
        return new MyAccountPage(driver);
    }
}

