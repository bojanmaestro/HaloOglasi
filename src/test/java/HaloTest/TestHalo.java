package HaloTest;

import HaloBase.BaseHalo;
import HaloPage.HaloOglasiHomepage;
import HaloPage.HaloOglasiLoginPage;
import HaloPage.HaloOglasiRegistrationPage;
import HaloPage.SharklasersHomepage;
//import static org.junit.Assert*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestHalo extends BaseHalo{
    HaloOglasiHomepage haloOglasiHomepage;
    HaloOglasiLoginPage haloOglasiLoginPage;
    HaloOglasiRegistrationPage haloOglasiRegistrationPage;
    SharklasersHomepage sharklasersHomepage;
    HaloBase.Test test;


    @Before
    public void setUpTest() {
        haloOglasiHomepage = new HaloOglasiHomepage();
        haloOglasiLoginPage = new HaloOglasiLoginPage();
        haloOglasiRegistrationPage = new HaloOglasiRegistrationPage();
        sharklasersHomepage = new SharklasersHomepage();
        test = new HaloBase.Test();

    }

    @Test
    public void HaloOglasiRegistrationTest() {
        haloOglasiHomepage
                .clickAcceptCookiesButton()
                .clickLoginButton();
        haloOglasiLoginPage.clickRegistrationPageLink();
        haloOglasiRegistrationPage
                .selectFizickoLiceType()
                .inputUsernameField(test.ime)
                .inputEmailField(test.email)
                .inputPasswordField(test.ime)
                .inputConfirmPasswordField(test.ime)
                .uncheckNewsletterCheckbox()
                .checkGetFiscalReceiptByEmailCheckbox()
                .clickRegistrationButton();
        assertTrue(haloOglasiRegistrationPage.successMessageIsDisplayed());
        assertEquals(test.regSuccessfulMsg, haloOglasiRegistrationPage.successMessageGetText());
        sharklasersHomepage
                .clickEmailNameButton()
                .inputEmailNameField(test.ime)
                .clickSetEmailNameButton()
                .clickActivationEmail()
                .clickActivateAccountButton();
        assertTrue(sharklasersHomepage.successActivationMessageIsDisplayed());
        assertEquals(test.activeSuccessfulMsg, sharklasersHomepage.successActivationMessageGetText());
    }
}
