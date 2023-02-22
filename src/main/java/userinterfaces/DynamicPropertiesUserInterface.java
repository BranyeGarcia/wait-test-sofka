package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DynamicPropertiesUserInterface {

    public static final Target BTN_ENABLE_AFTER= Target.the(null).located(By.id("enableAfter"));
    public static final Target BTN_VISIBLE_AFTER= Target.the(null).located(By.id("visibleAfter"));

}
