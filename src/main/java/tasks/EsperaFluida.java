package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperaFluida implements Task {

    //* se puede especificar el tiempo de espera maximo
    //* se puede configurar el polling time (peticiones cada x tiempo)
    //* se puede configurar para que evite el saltoi de excepsiones

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable enElementoSpinner(){
        return instrumented(EsperaFluida.class);
    }


}
