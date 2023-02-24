package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.time.Instant;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.SpinnerLoaderUserInterface.LAUNCH_SPINNER;
import static userinterfaces.SpinnerLoaderUserInterface.SPN_LOADING;

public class EsperaFluida implements Task {

    //* se puede especificar el tiempo de espera maximo
    //* se puede configurar el polling time (peticiones cada x tiempo)
    //* se puede configurar para que evite el saltoi de excepsiones

    @Override
    public <T extends Actor> void performAs(T actor) {
        org.openqa.selenium.support.ui.FluentWait wait = new FluentWait(SerenityWebdriverManager.inThisTestThread().getCurrentDriver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(NoSuchElementException.class);

        actor.attemptsTo(Click.on(LAUNCH_SPINNER));
        Instant start = Instant.now();
        wait.until(ExpectedConditions.invisibilityOf(SPN_LOADING.resolveFor(actor)));
        actor.attemptsTo(Ensure.that(SPN_LOADING.resolveFor(actor).isVisible()).isFalse());

        Instant finish = Instant.now();
        System.out.println("++++++++++++++++++++"+Duration.between(start,finish).toMillis());

    }

    public static Performable enElementoSpinner(){
        return instrumented(EsperaFluida.class);
    }


}
