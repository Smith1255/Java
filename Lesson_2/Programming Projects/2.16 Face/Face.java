/**
 * Demonstrates the draw ability
 * 
 * @Andrew Smith
 * @September 15
 */
import java.applet.Applet;
import java.awt.*;
public class Face extends Applet
{
    public void paint (Graphics page)
    {
        final int MIDX = 350;
        final int MIDY = 300;
        setBackground (Color.gray);
        
        page.setColor (Color.orange);
        page.fillOval (100, 50, 250, 250); //Face
        
        page.setColor (Color.black);
        page.drawOval (MIDX-190, MIDY-200, 50, 50); //Left Eye
        page.setColor (Color.blue);
        page.fillOval (MIDX-173, MIDY-182, 15, 15); //Left Pupil
        
        page.setColor (Color.black);
        page.drawOval (MIDX-110, MIDY-200, 50, 50); //Right Pupil
        page.setColor (Color.blue);
        page.fillOval (MIDX-95, MIDY-182, 15, 15); //Right Pupil
        
        page.setColor (Color.red);
        page.drawArc (MIDX-175, MIDY-110, 100, 70, 190, 160); //Mouth
        
        page.setColor (Color.black);
        page.drawArc (MIDX-130, MIDY-135, 10, 20, 90, -175); //Nose
        
        page.setColor (Color.orange);
        page.drawArc (MIDX-18, MIDY-180, 25, 40, 115, -175); //Right Ear
        
        page.drawArc (MIDX-255, MIDY-180, 25, 40, 75, 171); //Left Ear
    }
}