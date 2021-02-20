package RetoTecnico.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PruebaLoginPage {

    public static final Target LOGIN_BUTTON = Target.the("Ingresar").located(By.xpath("//unauthenticated-header/div[1]/div[5]/ul[1]/li[5]/a[1]"));
    public static final Target INPUT_USER = Target.the("Ingresar usuario").located(By.id("username]"));
    public static final Target INPUT_PASSWORD = Target.the("ingresar password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Ingresar").located(By.xpath("//button[@id='kc-login']"));
}
