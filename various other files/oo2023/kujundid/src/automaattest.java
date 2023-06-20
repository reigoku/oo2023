import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class automaattest {

    @Test
    public void kontrolli_kolmnurga_umbermoot(){
        kolmnurk kolmnurk = new kolmnurk(3, 6, 7, 8);
        assertEquals(21.0, kolmnurk.arvutaUmbermoot(), 0.0);
    }
}
