package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperaImplicita implements Task {

    //Se aplica este tiempo maximo a todos los elementos detro de la ejecución
    //es posible setear el tiempo maximo de espera

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable enElementosDinamicos(){
        return instrumented(EsperaImplicita.class);
    }
}
