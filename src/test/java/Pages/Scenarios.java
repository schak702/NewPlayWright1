package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Assert;

public class Scenarios {
   protected static Playwright playwright = Playwright.create();
    protected static BrowserType chrome = playwright.chromium();
   protected static Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));
   protected static Page page = browser.newPage();


    public static void launchApp(){

        page.navigate("https://www.saucedemo.com/");
    }
    public static void enterCreds(String username){
    page.fill("//input[@id='user-name' and @data-test='username']",username);
    page.fill("//input[@id='password']", "secret_sauce");
    }
    public  static  void clickOnLoginButton(){
        page.click("//input[@id='login-button']");
    }

public  static  void checkErrorMesasge(String errormessage){
   String eleValue=page.locator("//h3[@data-test='error']").innerText();
    Assert.assertEquals(eleValue,errormessage);
}

}
