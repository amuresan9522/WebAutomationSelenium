package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private By greetingMessage = By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.greet.welcome > span");
    private By createAccountButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    private By signInButton = By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CreateAccountPage clickOnCreateAccountButton() {
        driver.findElement(createAccountButton).click();
        return new CreateAccountPage(driver);
    }

    public SignInPage clickOnSignInButton() {
        driver.findElement(signInButton).click();
        return new SignInPage(driver);
    }

    public String getGreetingMessageAfterLogin() {
        return driver.findElement(greetingMessage).getText();
    }
}