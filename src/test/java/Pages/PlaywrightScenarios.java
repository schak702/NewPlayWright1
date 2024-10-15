package Pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitForSelectorState;

public class PlaywrightScenarios {
    protected static Playwright playwright = Playwright.create();
    protected static BrowserType chrome = playwright.chromium();
    //protected static BrowserType fire = playwright.firefox();
    protected static Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));
    //protected static Browser browser = fire.launch(new BrowserType.LaunchOptions().setHeadless(true));
    protected static Page page = browser.newPage();

    public static void launchUrl() {

        page.navigate("https://playwright.dev/");
        page.setViewportSize(1280, 900);
    }

    public static void SelectElementFromDropDown(){

        Locator element = page.locator("//a[@href = '#']");
        element.hover();
        // Wait for the dropdown option to be visible
        Locator dropdown = page.locator("//a[@href = '/java/']");
        dropdown.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        dropdown.click();
    }

    public static void searchElement(){

        page.waitForTimeout(2000);
        page.locator("//span[@class='DocSearch-Button-Placeholder']").click();
        page.waitForTimeout(2000);
    }

    public static void enterValue(){
        //searching and typing locators
        page.locator("//input[@id ='docsearch-input']").fill("Locators");
        page.waitForTimeout(4000);
        // Wait for the search results and click the first result
        page.locator("//div[@class='DocSearch-Hit-icon']").first().click();
        page.waitForTimeout(4000);
    }

    public static void quitBrowser() {
        page.close();
        browser.close();
    }
}
