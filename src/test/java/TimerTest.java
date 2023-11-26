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

        testTimer.addElems(k);
        assertTrue(testTimer.getTime_array() > 0 && testTimer.getTime_link() > 0);
    }

    @Test
    public void get(){
        int k = 10000;
        testTimer.addElems(k);
        testTimer.getElems(k);
        assertTrue(testTimer.getTime_array() > 0 && testTimer.getTime_link() > 0);
    }

    @Test
    public void delete(){
        int k = 10000;
        testTimer.addElems(k);
        testTimer.deleteElems(k);
        assertTrue(testTimer.getTime_array() > 0 && testTimer.getTime_link() > 0);
    }



    private AbstractTimer testTimer;

}
