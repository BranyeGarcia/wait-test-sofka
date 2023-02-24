package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import userinterfaces.DynamicPropertiesUserInterface;

import java.time.Duration;
import java.time.Instant;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.SerenityWebdriverManager.inThisTestThread;

public class EsperaImplicita implements Task {

    //Se aplica este tiempo maximo a todos los elementos detro de la ejecución
    //es posible setear el tiempo maximo de espera

    @Override
    public <T extends Actor> void performAs(T actor) {
        Instant start = Instant.now();
        //inThisTestThread().getCurrentDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actor.attemptsTo(Click.on(DynamicPropertiesUserInterface.BTN_VISIBLE_AFTER));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start,finish).toMillis());
    }

    public static Performable enElementosDinamicos(){
        return instrumented(EsperaImplicita.class);
    }
}
