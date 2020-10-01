import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test1_twoFriendsMeet();

    }

    @Before
    public void setup() {

    }

    @Test
    public void test1_twoFriendsMeet()
    {   
        Map.getInstance().initialize();
        Main main = new Main();
        main.runJerooCode();


        assertTrue("should still be at (23, 0)", Map.getInstance().isJeroo(23, 0));
        assertTrue("should still be at (23, 23)", Map.getInstance().isJeroo(23, 23));

        int w = Map.getInstance().getColumns();
        int h = Map.getInstance().getRows();
        for (int i = 0; i < w; i++) 
            assertTrue("should be flower at (0,"+i+")", Map.getInstance().isFlower(0, i));
        for (int i = 1; i < h-1; i++) 
            assertTrue("should be flower at (" + i+ ", 12)", Map.getInstance().isFlower(i, 12));
        for (int i = 0; i < w; i++) 
            assertTrue("should be flower at (" + (h-1) + "," + i +")", Map.getInstance().isFlower(h-1, i));

    }

}

