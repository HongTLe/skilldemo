import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest{
    @Test
    public void total(){
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        assertEquals(6, Demo.sum(array));
    }
}