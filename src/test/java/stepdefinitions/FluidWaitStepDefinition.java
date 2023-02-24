package stepdefinitions;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.EsperaFluida;

public class FluidWaitStepDefinition {

    @Cuando("usuario realiza las acciones sobre los elementos aplicando esperas fluidas")
    public void usuarioRealizaLasAccionesSobreLosElementosAplicandoEsperasFluidas() {
        OnStage.theActorInTheSpotlight().attemptsTo(EsperaFluida.enElementoSpinner());
    }
}
