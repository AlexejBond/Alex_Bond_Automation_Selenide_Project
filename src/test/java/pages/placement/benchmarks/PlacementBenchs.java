package pages.placement.benchmarks;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PlacementBenchs {
    public static void main(String[] args) {

        open("https://booking.com");
        $x(ACCEPT_COOKIE_XPATH).shouldBe(visible).click();
//        $x(CLOSE_SIGN_IN_POPUP_XPATH).shouldBe(visible).click();
        $x(DESTINATION_FIELD_XPATH).sendKeys("Париж");
        $x(FIRST_AUTOCOMPLETE_SEARCH_VALUE_XPATH).shouldBe(visible).click();
        $x(String.format(CALENDAR_DATE_XPATH, startCheckInDay)).click();
        $x(String.format(CALENDAR_DATE_XPATH, endCheckOutDay)).click();


    }

}
