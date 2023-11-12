import org.example.AbstractTimer;
import org.example.Timer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TimerTest {
    @Before
    public void setupData() {
        testTimer = new Timer();
    }

    @Test
    public void add(){
        int k = 10000;
        Timer result_add = new Timer();
        result_add.addElems(k);
        assertTrue(result_add.getTime_array() > 0 && result_add.getTime_array() > 0);
    }

    @Test
    public void get(){
        int k = 10000;
        Timer result_add = new Timer();
        result_add.addElems(k);
        result_add.getElems(k);
        assertTrue(result_add.getTime_array() > 0 && result_add.getTime_array() > 0);
    }

    @Test
    public void delete(){
        int k = 10000;
        Timer result_add = new Timer();
        result_add.addElems(k);
        result_add.deleteElems(k);
        assertTrue(result_add.getTime_array() > 0 && result_add.getTime_array() > 0);
    }



    private AbstractTimer testTimer;

}
