package driver;

import com.codeborne.selenide.Configuration;

import java.util.Arrays;

import static com.codeborne.selenide.Configuration.*;

public class BrowserConfig {

    public static void ChromeConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
//        Configuration.browserCapabilities.setCapability("chrome.switches"),
//                Arrays.asList("--incognito"));
//                Configuration.reportsFolder = null,
//                Configuration.holdBrowserOpen = true;


    }
}