package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import utils.UrlAplicativos;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarAplicativo implements Task {

    private final String waitType;

    IniciarAplicativo(String waitType){
        this.waitType = waitType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (waitType){
            case "implicita":
                actor.attemptsTo(Open.url(UrlAplicativos.IMPLICITA_DYNAMIC_PROPERTIES.getValor()));
                break;
            case "explicita":
                actor.attemptsTo(Open.url(UrlAplicativos.EXPLICITA_DYNAMIC_CONTROLS.getValor()));
                break;
            case "fluida":
                actor.attemptsTo(Open.url(UrlAplicativos.FLUIDA_SPINNER_CARGA.getValor()));
                break;
            case "asincronica":
            actor.attemptsTo(Open.url(UrlAplicativos.ASINCRONICA_IMAGE_SPINNER.getValor()));
                break;
            default:
                break;
        }


    }

    public static IniciarAplicativo navegarHacia(String waitType){
        return instrumented(IniciarAplicativo.class, waitType);
    }
}
