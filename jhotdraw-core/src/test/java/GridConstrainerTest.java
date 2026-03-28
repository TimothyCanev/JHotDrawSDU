import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.geom.Point2D;
import org.jhotdraw.draw.GridConstrainer;

public class GridConstrainerTest {

    @Test
    public void testSnappingLogic() {
        // Create a grid of 10x10
        GridConstrainer grid = new GridConstrainer(10.0, 10.0);
        
        // Point (12, 18) should snap to (10, 20)
        Point2D.Double p = new Point2D.Double(12, 18);
        Point2D.Double snapped = grid.constrainPoint(p);
        
        assertEquals(10.0, snapped.x, 0.0);
        assertEquals(20.0, snapped.y, 0.0);
    }

    @Test
    public void testNegativeBoundary() {
        GridConstrainer grid = new GridConstrainer(10.0, 10.0);
        
        // Test how it handles negative space
        Point2D.Double p = new Point2D.Double(-2, -8);
        Point2D.Double snapped = grid.constrainPoint(p);
        
        assertEquals(0.0, snapped.x, 0.0);
        assertEquals(-10.0, snapped.y, 0.0);
    }
}