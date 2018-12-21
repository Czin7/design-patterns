package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EuropeanPlugAdapterTest {

    @Test
    public void givenEuropeanPlugAdapter_whenPlugIn_thenShouldPlugIn(){
        Plug chinaPlug = new ChinaPlug();
        EuropeanPlugAdapter europeanPlugAdapter = new EuropeanPlugAdapter(chinaPlug);

        boolean pluged = europeanPlugAdapter.plugIn();

        assertTrue(pluged);
    }

}
