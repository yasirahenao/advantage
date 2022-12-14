package co.com.bancolombia.certification.advantagedemo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class BuyPage {
    public static final Target TXT_USER_NAME = Target.the("Nombre de usuario").located(By.name("username"));
    public static final Target TXT_PASSWORD = Target.the("contraseña de ususaerio").located(By.name("password"));
    public static final Target BTN_INGRESAR = Target.the("ingresar").located(By.id("sign_in_btnundefined"));
    public static final Target TXT_LAPTO = Target.the("comprarlapto").located(By.id("laptopsImg"));
    public static final Target TXT_ELEGIR_LAPTO = Target.the("elegirlapto").located(By.id("9"));

}
