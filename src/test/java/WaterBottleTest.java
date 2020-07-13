import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillBottle(){
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
