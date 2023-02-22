package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperaExplicita implements Task {

    //* Tiene un polling time de 250ms
    //* permite chequear una contición antes de ejecutar una acción al elemento, con un tiempo maximo especificado

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable enCargaDinamica(){
        return instrumented(EsperaExplicita.class);
    }
}
