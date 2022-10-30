package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;
    private By myAccountDropdownMenu = By.cssSelector(".action.switch");
    private By signOutDropDownMenuLink = By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.customer-welcome.active > div > ul > li.authorization-link > a");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccountDropdownMenu() {
        driver.findElement(myAccountDropdownMenu).click();
    }

    public void clickSignOutFromMyAccountDropdown() {
        driver.findElement(signOutDropDownMenuLink).click();
    }
}
