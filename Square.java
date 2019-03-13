
/**
 * A subclass of RegularPolygon
 *
 * @author (Tomas Meškauskas)
 * @version (01/03/2019)
 */
public class Square extends RegularPolygon
{
    public Square(int _sideLength)
    {
        super("Square", 4, _sideLength);
    }
    
    public double getArea()
    {
        return getSideLength() * getSideLength();
    }
    
    public String hey()
    {
        return super.hey() + " World";
    }
    
    public void sayHello()
    {
        System.out.println("Hi, I am a square.");
    }
}
