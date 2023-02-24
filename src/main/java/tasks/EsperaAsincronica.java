package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.hamcrest.core.IsEqual;
import userinterfaces.DynamicControlsUserInterface;
import userinterfaces.TelerikAjaxImageUserInterface;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.awaitility.Awaitility.await;

public class EsperaAsincronica implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        await()
                .atMost(Duration.ofSeconds(10))
                .atLeast(Duration.ofSeconds(3))
                .with()
                .pollInterval(Duration.ofMillis(100))
                .until(TelerikAjaxImageUserInterface.CTN_IMAGE_PANEL_1.resolveFor(actor)::isCurrentlyVisible, IsEqual.equalTo(true));

        await()
                .atMost(Duration.ofSeconds(10))
                .atLeast(Duration.ofSeconds(3))
                .with()
                .pollInterval(Duration.ofMillis(100))
                .until(()-> TelerikAjaxImageUserInterface.CTN_IMAGE_PANEL_1.resolveFor(actor).isCurrentlyEnabled());
    }

    public static Performable elementosAjax(){
        return instrumented(EsperaAsincronica.class);
    }
}
