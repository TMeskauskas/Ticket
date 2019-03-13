
/**
 * A space to test our Point Class.
 *
 * @author (Tomas Meskauskas)
 * @version (01/29/19)
 */
public class PointMain
{
    public static void main(String [] args)
    {
        Point p1 = new Point(3, 8);
        System.out.println(p1);
        
        
        p1.translate(-1, 4);
        System.out.println(p1);
        
        
        p1.setLocation(10, 50);  
        System.out.println(p1);
        
        
        System.out.println(p1.distanceToOrigin());
        
        
        Point p2 = new Point();
        System.out.println(p2);
    }
}
