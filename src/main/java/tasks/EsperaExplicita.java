package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.Matchers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterfaces.DynamicControlsUserInterface;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.SerenityWebdriverManager.inThisTestThread;
import static userinterfaces.DynamicControlsUserInterface.*;

public class EsperaExplicita implements Task {

    //* Tiene un polling time de 250ms
    //* permite chequear una contición antes de ejecutar una acción al elemento, con un tiempo maximo especificado

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriverWait wait = new WebDriverWait(inThisTestThread().getCurrentDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(BTN_ADD_CHECKBOX.resolveFor(actor).getElement()));

        actor.attemptsTo(
                Click.on(BTN_REMOVE_CHECKBOX).afterWaitingUntilEnabled(),
                WaitUntil.the(BTN_ADD_CHECKBOX, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_ADD_CHECKBOX),
                WaitUntil.the(CHECKBOX_SELECT, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(CHECKBOX_SELECT));
    }

    public static Performable enCargaDinamica(){
        return instrumented(EsperaExplicita.class);
    }
}
