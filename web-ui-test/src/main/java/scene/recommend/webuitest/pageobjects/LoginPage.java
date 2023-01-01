package scene.recommend.webuitest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import scene.recommend.webuitest.bean.User;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver webDriver, String url, String title) {
        super(webDriver, url, title);
    }

    @FindBy(xpath = "//input[@aria-label='Email Address:']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@aria-label='Password:']")
    public WebElement pwdInput;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[3]/div[4]/button")
    public WebElement loginButton;

    // LoginPage to login using user object
    public HomePage login(User user) {
        this.load();
        emailInput.sendKeys(user.getEmail());
        pwdInput.sendKeys(user.getPwd());
        loginButton.click();

        return new HomePage(this.getWebDriver());
    }


}
