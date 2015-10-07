/**
 * Class Snowman - Demonstrates a basic applet
 * 
 * @Lewis/Loftus/Cockling
 * @September 14
 */
import java.applet.Applet;
import java.awt.*;

public class Einstein extends Applet
{
    public void paint (Graphics page)
    {
        page.drawRect (50,50,40,40);
        page.drawRect (60,80,225,30);
        page.drawOval (75,65,20,20);
        page.drawRect (35,60,100,120);
        
        setBackground (Color.cyan);
        page.drawString ("Out of clutter, find simplicity.", 110, 70);
        page.drawString ("-Albert Einstein", 130, 100);
    }
}
