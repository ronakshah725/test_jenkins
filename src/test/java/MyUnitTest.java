import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testSaying(){
        Sayings sayings = new Sayings();
        Say s = new Say();
        String saying = s.getSaying(sayings, 1);
        assertEquals("sayings one", saying);
    }
}
