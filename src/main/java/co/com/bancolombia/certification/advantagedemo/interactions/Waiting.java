package co.com.bancolombia.certification.advantagedemo.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import java.time.Duration;


public class Waiting implements Interaction {
    private Target objetivo;
    private int segundos;

    public Waiting(Target objetivo, int segundos) {
        this.objetivo = objetivo;
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Ensure.that(objetivo.waitingForNoMoreThan(Duration.ofSeconds(segundos))).isDisplayed());
    }
    public static Waiting losSegundos(Target objetivo,int segundos){
        return Tasks.instrumented(Waiting.class,objetivo,segundos);
    }
}
