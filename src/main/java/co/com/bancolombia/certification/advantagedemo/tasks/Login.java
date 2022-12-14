package co.com.bancolombia.certification.advantagedemo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        //hacer login enter the value
    }
    public static Login logeo(){
        return instrumented(Login.class);
    }
}
