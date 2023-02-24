package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DynamicControlsUserInterface {

    public static Target BTN_ADD_CHECKBOX = Target.the("").located(By.xpath("//button[text()=\"Add\"]"));
    public static Target BTN_REMOVE_CHECKBOX = Target.the("").located(By.xpath("//button[text()=\"Remove\"]"));
    public static Target CHECKBOX_SELECT = Target.the("").located(By.id("checkbox"));
}
