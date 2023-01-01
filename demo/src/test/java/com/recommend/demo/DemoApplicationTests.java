package com.recommend.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test01() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\static\\chromedriver\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://us.shein.com/user/auth/login?direction=nav&from=navTop");
        // 最大化窗口
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.xpath("//input[@aria-label='Email Address:']")).sendKeys("tj002@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@aria-label='Password:']")).sendKeys("12345qwe");
//        chromeDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[3]/div[1]/div/div/div/input")).sendKeys("tj002@gmail.com");
//        chromeDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[3]/div[2]/div/div/input")).sendKeys("12345qwe");
        // List<WebElement> elements = chromeDriver.findElements(new By.ByClassName("S-input__inner"));
//        for (WebElement element : elements) {
//            log.info(element.toString());
//        }
//        elements.get(16).sendKeys("502976825@qq.com");
//        elements.get(18).sendKeys("shein123");
        chromeDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[3]/div[4]/button")).click();
//        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"S-button page__login_mainButton bUqVNB S-button__primary S-button__H44PX\"]"));
//        log.info(element.toString());
//        element.click();
//        List<WebElement> elements = chromeDriver.findElements(By.xpath("//div[@class='login-btn']/button[@class='S-button page__login_mainButton bUqVNB S-button__primary S-button__H44PX']/*[@text()='Sign In']"));
//        log.info(String.valueOf(elements.size()));
        // chromeDriver.wait(20000);
        Thread.sleep(10000);
//        WebElement element = chromeDriver.findElement(new By.ByXPath("/html/body/div[1]/div[5]/div[1]/div/div[2]/div/i"));
//        element.click();
        chromeDriver.quit();
    }

}
