package artattack;

/**
 *
 * @author Erick
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Erick
 */
public class DrawingExample extends JFrame {
 
    public DrawingExample() {
        super("Art Attack");
 
        setSize(780, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        //Poligono
//        //Poligono  (IMPORT JAVA.AWT.GRAPHICS2D)
//        int[] x = {100, 100, 170, 170, 200};
//        int[] y = {120, 220, 200, 200, 60};
//        g2d.setColor(Color.red);
//        g2d.drawPolygon(x, y, x.length);
        
//        Draw
//        g.setColor( Color.MAGENTA );
//        g2d.draw(new Rectangle2D.Double(159.2d, 199.8d, 519.1d, 199.8d));
//        g.setColor( Color.BLUE);
//        g2d.draw(new Line2D.Double(100, 150, 200, 170));
//        g.setColor( Color.BLACK);
//        g2d.draw(new Line2D.Float(21.50f, 182.50f, 459.50f, 182.50f));
//        
//        g.setColor (Color.RED);
//        g2d.drawLine (0, 70, 100, 70);
//        g2d.drawRect (150, 70, 50, 70);
//        g2d.drawRoundRect (250, 70, 50, 70, 6, 6);
//        g2d.drawOval (350, 70, 50, 70);
//        g2d.drawString("Hola", 30, 50);
//        
//        //Shape
//        int a = 100, b = 100, w = getSize().width-1, h = getSize().height-1, startAngle = 45, arcAngle = -60;
//        Shape line = new Line2D.Float(a, b, w, h);
//        Shape oval = new Ellipse2D.Float(a, b, w, h);
//        Shape rectangle = new Rectangle2D.Float(a, b, w, h);
//        Shape roundRectangle = new RoundRectangle2D.Float(a, b, w, h, w/2, h/2);
//        Shape arc = new Arc2D.Float(a, b, w/2, h/2, startAngle, arcAngle, Arc2D.OPEN);
//        
//        g.setColor (Color.BLACK);
//        g2d.draw(line);
//        g2d.draw(oval);
//        g2d.draw(rectangle);
//        g2d.draw(roundRectangle);
//        g2d.draw(arc);
//        
//        //GeneralPath
//        GeneralPath gp1, gp2, gp3;
//        
//        g.setColor (Color.ORANGE);
//        gp1 = new GeneralPath();
//        gp1.moveTo(150, 110);
//        gp1.lineTo(170, 180);
//        gp1.lineTo(190, 140);
//        gp1.lineTo(110, 140);
//        gp1.lineTo(150, 180);
//        gp1.closePath();
//        
//        gp2 = new GeneralPath();
//        gp2.moveTo(350, 180);
//        gp2.quadTo(350, 120, 480, 180);
//        gp2.closePath();
//        
//        gp3 = new GeneralPath();
//        gp3.moveTo(220, 150);
//        gp3.curveTo(240, 130, 280, 160, 300, 140);
//        gp3.lineTo(300, 180);
//        gp3.quadTo(260, 160, 220, 180);
//        gp3.closePath();
//        
//        g2d.draw(gp1);
//        g2d.draw(gp2);
//        g2d.draw(gp3);
//        
//        //Point
//        g2d.setStroke(new BasicStroke(7.0f));
//        Point2D p1 = new Point2D.Float(23.5f, 48.9f);
//        Point2D p2 = new Point2D.Float(158.0f, 173.0f);
//        Line2D I = new Line2D.Float(p1, p2);
//        g2d.setPaint(Color.BLUE);
//        
//        //Line2D
//        g.setColor( Color.BLUE);
//        g2d.draw(new Line2D.Double(100, 150, 200, 170));
        
    }
 
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawingExample().setVisible(true);
            }
        });
    }
}
   
