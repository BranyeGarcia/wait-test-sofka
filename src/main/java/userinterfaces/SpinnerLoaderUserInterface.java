package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SpinnerLoaderUserInterface {

    public static Target LAUNCH_SPINNER = Target.the("").located(By.id("showModal"));
    public static Target SPN_LOADING = Target.the("").located(By.id("modal-title"));
    }
