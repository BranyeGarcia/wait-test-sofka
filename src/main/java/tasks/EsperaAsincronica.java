package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperaAsincronica implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable elementoAjax(){
        return instrumented(EsperaAsincronica.class);
    }
}
