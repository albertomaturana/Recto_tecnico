package RetoTecnico.tasks;

import RetoTecnico.userinterface.SearchPruebaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Search implements Task {

    private String strfirstName;
    private String strlastName;
    private String strEmail;
    private String strlanguage;

    public Search(String strfirstName, String strlastName, String strEmail, String strlanguage) {
        this.strfirstName = strfirstName;
        this.strlastName = strlastName;
        this.strEmail = strEmail;
        this.strlanguage = strlanguage;
    }

    public static Search the(String strfirname,String strlastName,String strEmail,String strlanguage) {
        return Tasks.instrumented(Search.class, strfirname, strlastName, strEmail, strlanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchPruebaPage.BUTTON_GO),
                Enter.theValue(strfirstName).into(SearchPruebaPage.INPUT_FIRSTNAME),
                Enter.theValue(strlastName).into(SearchPruebaPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(SearchPruebaPage.INPUT_EMAILADDRESS),
                SelectFromOptions.byValue("number:4").from(SearchPruebaPage.INPUT_BIRTHMONTH),
                SelectFromOptions.byValue("number:15").from(SearchPruebaPage.INPUT_BIRTHYEAR),
                SelectFromOptions.byValue("number:2003").from(SearchPruebaPage.INPUT_BIRTHDAY),
                Enter.theValue(strlanguage).into(SearchPruebaPage.SELECT_LG),
                Click.on(SearchPruebaPage.SELECT_LG),
                Click.on(SearchPruebaPage.BUTTON_REGIS)
        );

    }
}
