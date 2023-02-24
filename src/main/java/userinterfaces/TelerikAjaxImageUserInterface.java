package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TelerikAjaxImageUserInterface {
    public static Target BTN_CHANGE_IMAGE = Target.the("").located(By.xpath("//span[@class=\"rbText\"]"));
    public static Target CTN_IMAGE_PANEL_1 = Target.the("").located(By.xpath("//div[@class=\"background2\"]"));
    public static Target CTN_IMAGE_PANEL_2 = Target.the("").located(By.xpath("//div[@class=\"background1S\"]"));
}
