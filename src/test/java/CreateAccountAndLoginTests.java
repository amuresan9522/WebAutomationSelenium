import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;

public class CreateAccountAndLoginTests extends BaseTest {
    @Test
    public void testSuccessfulRegister() {

        CreateAccountPage createAccountPage = homePage.clickOnCreateAccountButton();
        createAccountPage.inputFirstName("Anna");
        createAccountPage.inputLastName("Olson");
        createAccountPage.inputEmail("annaolsons@gmail.com");
        createAccountPage.inputPassword("HelloWorld22!");
        createAccountPage.inputPasswordConfirmation("HelloWorld22!");
        MyAccountPage myAccountPage = createAccountPage.clickOnCreateAccountAndSubmitButton();
        myAccountPage.clickMyAccountDropdownMenu();
        myAccountPage.clickSignOutFromMyAccountDropdown();
    }

    @Test
    public void testSuccessfulLogin() {
        SignInPage signInPage = homePage.clickOnSignInButton();
        signInPage.inputSignInEmail("annaolsons@gmail.com");
        signInPage.inputSignInPassword("HelloWorld22!");
        HomePage homePage = signInPage.clickOnSignInButton();
        //TODO: I need to wait a few seconds for the "default message to change to the correct message
        assertTrue(homePage.getGreetingMessageAfterLogin().
                        contains("Welcome, Anna Olsons!"),
                "Welcome message is incorrect");
    }
}
