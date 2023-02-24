package stepdefinitions;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.EsperaAsincronica;

public class AsyncWaitStepDefinition {

    @Cuando("usuario realiza acciones sobre los elementos aplicando esperas asincronicas")
    public void usuarioRealizaAccionesSobreLosElementosAplicandoEsperasAsincronicas() {
        OnStage.theActorInTheSpotlight().attemptsTo(EsperaAsincronica.elementosAjax());
    }
}
