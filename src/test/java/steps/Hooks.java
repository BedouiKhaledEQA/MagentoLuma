package steps;

import com.MagentoLuna.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Base {
    @Before
    public void BeforeALlMethode(){
        System.out.println("**** STARTING TEST ****");
    }
    @After
    public void AfterAllMethode(Scenario sc){
        final byte[]
                screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(screenshot,"image/jpeg","image");
        driver.quit();
    }
}
