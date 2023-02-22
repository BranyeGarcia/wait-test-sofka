package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.EsperaImplicita;
import tasks.IniciarAplicativo;

public class ImplicitWaitStepDefinition {
    private String waitType;

    @Before
    public void setUpScenario(Scenario scenario){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("user");
        this.waitType = scenario.getName().split(" ")[1];
    }

    @Dado("que usuario se encuentra en el sistema")
    public void queUsuarioSeEncuentraEnElSistema() {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarAplicativo.navegarHacia(waitType));
    }
    @Cuando("usuario realiza las acciones sobre los elementos")
    public void usuarioRealizaLasAccionesSobreLosElementos() {
        OnStage.theActorInTheSpotlight().attemptsTo(EsperaImplicita.enElementosDinamicos());
    }
    @Entonces("usuario podra validar el estado de los elementos")
    public void usuarioPodraValidarElEstadoDeLosElementos() {
    }
}
