package PageObjectModel;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;
import stepDefinition.add_To_Card_Steps;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public abstract class AbstractClass {

    public static void clickFunction(MobileElement clickElement){
        clickElement.click();
    }

    public static void sendKeysFunction(MobileElement sendKeysElement, String value){
        sendKeysElement.sendKeys(value);
    }
    public static void assertationFunction(MobileElement actualResult, String expectedResult){
        Assert.hasText(actualResult.getText(), expectedResult);
    }
}
