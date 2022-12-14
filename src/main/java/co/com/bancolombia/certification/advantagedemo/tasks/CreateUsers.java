package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.lang.annotation.Target;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage.*;
public class CreateUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Waiting.losSegundos(ICN_MENU_USER,5),
                WaitUntil.the(ICN_MENU_USER,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_MENU_USER),
                WaitUntil.the(LBL_CREATE_NEW_ACCOUNT,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LBL_CREATE_NEW_ACCOUNT),
                WaitUntil.the(TXT_USER_NAME,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("yasi115").into(TXT_USER_NAME),
                Enter.theValue("yasira121@gmail.com").into(TXT_USER_EMAIL),
                Enter.theValue("lkjasd@A21").into(TXT_PASSWORD),
                Enter.theValue("lkjasd@A21").into(TXT_CONFIRM_PASSWORD),
                Enter.theValue("yasira").into(TXT_FIRST_NAME),
                Enter.theValue("camila").into(TXT_LAST_NAME),
                Enter.theValue("39287632").into(TXT_PHONE_NUMBER),
               // Enter.theValue("").into(),
                Enter.theValue("medellin").into(TXT_CITY),
                Enter.theValue("cll30 n110").into(TXT_ADDRESS),
                Enter.theValue("234").into(TXT_STATE),
                Enter.theValue("12353").into(TXT_POSTAL_CODE),
                Click.on(CHK_I_AGREE),
                Click.on(BTN_REGISTER)
        );
    }
    public static CreateUsers createUsers(){
        return instrumented(CreateUsers.class);
    }
}


