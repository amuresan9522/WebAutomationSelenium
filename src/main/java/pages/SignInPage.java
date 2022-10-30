package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By emailSignInField = By.id("email");
    private By passwordSignInField = By.id("pass");
    private By signInButton = By.id("send2");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    // you may notice I used diff naming conventions for method, param and element
    //in your opinion, which is best? e.g. if all are <pagename>elementname, it might be harder to find etc
    public void inputSignInEmail(String signInEmail) {
        driver.findElement(emailSignInField).sendKeys(signInEmail);
    }

    public void inputSignInPassword(String signInPassword) {
        driver.findElement(passwordSignInField).sendKeys(signInPassword);
    }

    public HomePage clickOnSignInButton() {
        driver.findElement(signInButton).click();
        return new HomePage(driver);
    }

}
