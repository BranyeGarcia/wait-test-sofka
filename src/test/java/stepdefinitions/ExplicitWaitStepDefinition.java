package stepdefinitions;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.EsperaExplicita;

public class ExplicitWaitStepDefinition {

    @Cuando("usuario realiza acciones sobre los elementos aplicando esperas explicitas")
    public void usuarioRealizaAccionesSobreLosElementosAplicandoEsperasExplicitas() {
        OnStage.theActorInTheSpotlight().attemptsTo(EsperaExplicita.enCargaDinamica());

    }
}
