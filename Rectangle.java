
/**
 * A basic Rectangle class.
 *
 * @author (Tomas Meskauskas)
 * @version (02/01/2019)
 */
public class Rectangle
{
    private int length, width;
    
    public Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    
    public int getArea()
    {
        return length * width;
    }
    
    public int getPerimeter()
    {
        return 2 * length + 2 * width;
    }
    
    public void doubleSides()
    {
        length *= length;
        width *= width;
    }
    
    public boolean isSquare()
    {
        return length == width;
    }
    
    public void changeLength(int l)
    {
        length = l;
    }
    
    public void changeWidth(int w)
    {
        width = w;
    }
    
    public int differenceInArea(Rectangle r)
    {
        return getArea() - r.getArea();
    }
    
    public String toString()
    {
        return length + " x " + width; 
    }
    
    
    
    
    
}
