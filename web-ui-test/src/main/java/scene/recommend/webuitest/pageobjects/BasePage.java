package scene.recommend.webuitest.pageobjects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

@Getter
@Setter
public abstract class BasePage extends LoadableComponent {

    protected String url;
    protected WebDriver webDriver;
    public String title;

    public BasePage() {}

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public BasePage(WebDriver webDriver, String url, String title) {
        this.webDriver = webDriver;
        this.url = url;
        this.title = title;
        PageFactory.initElements(webDriver, this);
    }

    @Override
    protected void load() {
        this.webDriver.get(url);
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(webDriver.getTitle().contains(title));
    }

    public String getPageTitle() {
        return this.webDriver.getTitle();
    }

    public void driverQuit() {
        webDriver.quit();
    }

    public void driverClose() {
        webDriver.close();
    }

    public String getPageSource() {
        return this.webDriver.getPageSource();
    }

}
