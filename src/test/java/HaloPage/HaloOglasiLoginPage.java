package HaloPage;

import HaloBase.BaseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiLoginPage extends BaseHalo {
    public HaloOglasiLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "no-account-reg-link")
    WebElement registrationPageLink;

    public HaloOglasiLoginPage clickRegistrationPageLink() {
        wdwait.until(ExpectedConditions.elementToBeClickable(registrationPageLink));
        registrationPageLink.click();
        return this;

    }
}
