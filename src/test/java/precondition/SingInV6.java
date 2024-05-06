package precondition;

import com.codeborne.selenide.WebDriverRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SingInV6 {
    private static final Logger LOGGER = LogManager.getLogger(SingInV6.class);
    private static final String LOGIN_POPUP_XPATH = "//*[@id='login_email']";
    private static final String LOGIN_CONTINUE_BUTTON_XPATH = "//button[contains(text(), 'Continue')]";
    private static final String WORK_EMAIL = "alexej.bondarik@profitero.com";
    private static final String ACCOUNT_SEARCH_XPATH = "//*[@id=':r0:']";
    private static final String ONE_LOGIN_USER_XPATH = "//*[@id=':r0:']";


    //*[@id="username"]


    public void logInV6(String accountNumber) {
        open("https://app.profitero.com/login");
        $x(LOGIN_POPUP_XPATH).setValue(WORK_EMAIL);
        $x(LOGIN_CONTINUE_BUTTON_XPATH).click();
        $x(ACCOUNT_SEARCH_XPATH).setValue(accountNumber).pressEnter();

        LOGGER.info("Successfully logged in to account " + accountNumber);
    }

    public void logInV6OneLogIn(String accountNumber) {

        String mainWindowHandle = WebDriverRunner.getWebDriver().getWindowHandle();

        open("https://app.profitero.com/login");
        $x(LOGIN_POPUP_XPATH).setValue(WORK_EMAIL);
        $x(LOGIN_CONTINUE_BUTTON_XPATH).click();

        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        String secondWindowHandle = null;
        for (String handle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                secondWindowHandle = handle;
                break;
            }
        }
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.switchTo().window(secondWindowHandle);

        $x(LOGIN_CONTINUE_BUTTON_XPATH).click();


        LOGGER.info("Successfully logged in to account " + accountNumber);
    }

}
