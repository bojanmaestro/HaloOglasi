package HaloPage;

import HaloBase.BaseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistrationPage extends BaseHalo {
    public HaloOglasiRegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value=\"person\"]")
    WebElement fizickoLiceType;

    @FindBy(id = "UserName")
    WebElement usernameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "AllowSendingNewsletters")
    WebElement newsletterCheckbox;

    @FindBy(id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement getFiscalReceiptByEmailCheckbox;

    @FindBy(css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrationButton;

    @FindBy(className = "regsitration-success")
    WebElement successRegistrationMessage;

    public HaloOglasiRegistrationPage selectFizickoLiceType() {
        if (!fizickoLiceType.isSelected()) {
            fizickoLiceType.click();
        }
        return this;
    }

    public HaloOglasiRegistrationPage inputUsernameField(String username) {
        wdwait.until(ExpectedConditions.elementToBeClickable(usernameField));
        usernameField.clear();
        usernameField.sendKeys(username);
        return this;

    }

    public HaloOglasiRegistrationPage inputEmailField(String email) {
        wdwait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.clear();
        emailField.sendKeys(email);
        return this;

    }

    public HaloOglasiRegistrationPage inputPasswordField(String password) {
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;

    }

    public HaloOglasiRegistrationPage inputConfirmPasswordField(String confirmPassword) {
        wdwait.until(ExpectedConditions.elementToBeClickable(confirmPasswordField));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);
        return this;

    }

    public HaloOglasiRegistrationPage uncheckNewsletterCheckbox() {
        if (newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }
        return this;

    }

    public HaloOglasiRegistrationPage checkGetFiscalReceiptByEmailCheckbox() {
        if (!getFiscalReceiptByEmailCheckbox.isSelected()) {
            getFiscalReceiptByEmailCheckbox.click();
        }
        return this;

    }

    public HaloOglasiRegistrationPage clickRegistrationButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(registrationButton));
        registrationButton.click();
        return this;


    }

    public boolean successMessageIsDisplayed() {
        wdwait.until(ExpectedConditions.elementToBeClickable(successRegistrationMessage));
        return successRegistrationMessage.isDisplayed();
    }

    public String successMessageGetText() {
        wdwait.until(ExpectedConditions.elementToBeClickable(successRegistrationMessage));
        return successRegistrationMessage.getText();
    }
}