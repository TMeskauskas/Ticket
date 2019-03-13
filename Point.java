
/**
 * My own point class to explore objects.
 *
 * @author (Tomas Meskauskas)
 * @version (01/29/19)
 */
public class Point
{
    private int x;
    private int y;
    
    //Constructor
    public Point(int initialX, int initialY)   
    {
       x = initialX;
       y = initialY;
    }
    
    public Point()
    {
        this(0, 0);
    }
    
    
    
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public void setLocation(int sx, int sy)
    {
        x = sx;
        y = sy;
    }
    
    public double distanceToOrigin()
    {        
        return Math.sqrt(x * x + y * y);
    }
    
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
