import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    //Add JUnit4 to classpath -> ok->ok
    @Test
    public void kontrolli_kas_naisterahvas_isikukoodi_alguses_on_4(){
        IsikukoodEE ee = new IsikukoodEE("testinf", "40404049996");
        assertEquals("F", ee.getSugu());
    }
    //camelCaseTyping
    //snake_case_typing
}
