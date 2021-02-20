package RetoTecnico.userinterface;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPruebaPage {

    public static final Target BUTTON_GO = Target.the("Click the JoinToday button").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));
    public static final Target INPUT_FIRSTNAME = Target.the("Enter your name").located(By.xpath("//input[@id='firstName']"));
    public static final Target INPUT_LASTNAME = Target.the("Enter your surname").located(By.xpath("//input[@id='lastName']"));
    public static final Target INPUT_EMAILADDRESS = Target.the("Enter you email").located(By.xpath("//input[@id='email']"));
    public static final Target INPUT_BIRTHMONTH = Target.the("Enter months").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target INPUT_BIRTHDAY = Target.the("Enter Day").located(By.xpath("//select[@id='birthDay']"));
    public static final Target INPUT_BIRTHYEAR = Target.the("Enter Year").located(By.xpath("//select[@id='birthYear']"));
    public static final Target SELECT_LG = Target.the("Select language").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_REGIS = Target.the("Check in").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));


}
