import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.geom.Point2D;
import org.jhotdraw.draw.figure.RectangleFigure;

public class RectangleFigureTest {

    @Test
    public void testRectangleCreation() {
        RectangleFigure rect = new RectangleFigure();
        Point2D.Double anchor = new Point2D.Double(10, 10);
        Point2D.Double lead = new Point2D.Double(20, 30);
        
        // Act: Set the bounds of the rectangle
        rect.setBounds(anchor, lead);

        // Assert: Check if the width and height are correct
        assertEquals("Width should be 10", 10.0, rect.getBounds().width, 0.001);
        assertEquals("Height should be 20", 20.0, rect.getBounds().height, 0.001);
    }
}