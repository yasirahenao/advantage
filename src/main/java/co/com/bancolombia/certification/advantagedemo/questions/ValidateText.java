package co.com.bancolombia.certification.advantagedemo.questions;

import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.LBL_RESULT;
import static co.com.bancolombia.certification.advantagedemo.utils.Constans.RESULT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateText implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Waiting.losSegundos(LBL_RESULT, 10);
        System.out.println("el texto a validar es: " + Text.of(LBL_RESULT).viewedBy(actor).asString());
        return RESULT.equals(Text.of(LBL_RESULT).viewedBy(actor).asString());
    }
    public static ValidateText valText() {
        return new ValidateText();
    }
}
