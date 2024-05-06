package benchmarks;

import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import pages.placement.benchmarks.PlacementBenchs;
import precondition.SingInV6;

public class PlacementBenchsTest {
    private static final Logger LOGGER = LogManager.getLogger(PlacementBenchs.class);


    private PlacementBenchs placementBenchs = new PlacementBenchs();
    private final SingInV6 singInV6 = new SingInV6();


    @Test
    public void placementBenchsCheck(){
        singInV6.logInV6("7098");
    }


}


