package pages.placement.benchmarks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PlacementBenchs {
    private static final Logger LOGGER = LogManager.getLogger(PlacementBenchs.class);
    private static final String LOGIN_POPUP_XPATH = "//*[@id='login_email']";
    private static final String LOGIN_CONTINUE_BUTTON_XPATH = "//button[contains(text(), 'Continue')]";
    private static final String WORK_EMAIL = "alexej.bondarik@profitero.com";
    private static final String ACCOUNT_SEARCH_XPATH = "//*[@id=':r0:']";
    private static final String ACCOUNT_NUMBER = "";





    public void logInV6(String accountNumber) {
        open("https://app.profitero.com/login");
        $x(LOGIN_POPUP_XPATH).setValue(WORK_EMAIL);
        $x(LOGIN_CONTINUE_BUTTON_XPATH).click();
        $x(ACCOUNT_SEARCH_XPATH).setValue(accountNumber);

        LOGGER.info("Site cookies are accepted");
    }





}

