
/**
 * Write a description of class Pug here.
 *
 * @author (Tomas Meskauskas)
 * @version (03/01/2019)
 */
public abstract class RegularPolygon
{
    private String name;
    private int numSides;
    private int sideLength;
    
    public RegularPolygon(String _name, int _numSides, int _sideLength)
    {
        name = _name;
        numSides = _numSides;
        sideLength = _sideLength;
    }
    
    public int getPerimeter()
    {
        return numSides * sideLength;
    }
    
    public abstract double getArea();
    
    public String toString()
    {
        return name + " -- Perimeter: " + getPerimeter() + " , Area: " + getArea();
    }
    
    public String hey()
    {
        return "hey";
    }
    
    public int getNumSides() {return numSides;}
    public int getSideLength() {return sideLength;}
    
}


