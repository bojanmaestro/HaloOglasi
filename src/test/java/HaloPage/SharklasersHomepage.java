package HaloPage;

import HaloBase.BaseHalo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SharklasersHomepage extends BaseHalo {
    public SharklasersHomepage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id="inbox-id")
    WebElement emailNameButton;

    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    WebElement emailNameField;

    @FindBy(css = ".save.button.small")
    WebElement setEmailNameButton;

    @FindBy(xpath = "//td[contains(text(), \"Molimo aktivirajte Vaš Halo oglasi nalog\")]")
    WebElement activationEmail;

    @FindBy(linkText = "Aktiviraj nalog")
    WebElement activateAccountButton;

    @FindBy(className = "regsitration-success")
    WebElement successActivationMessage;

    public SharklasersHomepage clickEmailNameButton() {
        driver.get("https://www.sharklasers.com/");

        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wdwait.until(ExpectedConditions.elementToBeClickable(emailNameButton));
        emailNameButton.click();
        return this;

    }

    public SharklasersHomepage inputEmailNameField(String emailName) {
        wdwait.until(ExpectedConditions.elementToBeClickable(emailNameField));
        emailNameField.clear();
        emailNameField.sendKeys(emailName);
        return this;

    }

    public SharklasersHomepage clickSetEmailNameButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(setEmailNameButton));
        setEmailNameButton.click();
        return this;

    }

    public SharklasersHomepage clickActivationEmail() {
        wdwait.until(ExpectedConditions.elementToBeClickable(activationEmail));
        activationEmail.click();
        return this;

    }

    public SharklasersHomepage clickActivateAccountButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(activateAccountButton));
        activateAccountButton.click();
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;

    }

    public boolean successActivationMessageIsDisplayed() {
        wdwait.until(ExpectedConditions.elementToBeClickable(successActivationMessage));
        return successActivationMessage.isDisplayed();
    }

    public String successActivationMessageGetText() {
        wdwait.until(ExpectedConditions.elementToBeClickable(successActivationMessage));
        return successActivationMessage.getText();
    }
}
