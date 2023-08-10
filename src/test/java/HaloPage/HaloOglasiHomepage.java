package HaloPage;

import HaloBase.BaseHalo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiHomepage extends BaseHalo {
    public HaloOglasiHomepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "cookie-policy-btn")
    WebElement acceptCookiesButton;

    @FindBy(linkText = "Uloguj se")
    WebElement loginButton;

    public HaloOglasiHomepage clickAcceptCookiesButton() {
        if (!driver.findElements(By.className("cookie-policy-btn")).isEmpty()) {
            wdwait.until(ExpectedConditions.elementToBeClickable(acceptCookiesButton));
            acceptCookiesButton.click();

        }
        return this;
    }

        public HaloOglasiHomepage clickLoginButton() {
            wdwait.until(ExpectedConditions.elementToBeClickable(loginButton));
            loginButton.click();
            return this;

        }
    }
