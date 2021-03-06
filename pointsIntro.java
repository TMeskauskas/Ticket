import java.awt.Point;

/**
 * An introduction to points.
 *
 * @author (Tomas Meskauskas)
 * @version (01/29/19)
 */
public class pointsIntro
{
   public static void main(String [] args)
   {
       Point p = new Point(3, 8);

       System.out.println(p);
       
       p.translate(-1, -2);
       System.out.println(p);
       
       p.setLocation(5, 8);
       System.out.println(p);
       
       p.x = -1;
       System.out.println(p);
       
       Point p1 = new Point(2, 9);
       Point p2 = new Point(7, 4);
       System.out.println("p1: " + p1);
       System.out.println("p2: " + p2);
       System.out.println("Distance from p1 to p2: " + p1.distance(p2));
   }
}
