
/**
 * An Equilateral Triangle, another regular polgyon.
 *
 * @author (Tomas Meškauskas)
 * @version (03/06/2019)
 */
public class EquilateralTriangle extends RegularPolygon
{
    public EquilateralTriangle(int _sideLength)
    {
        super("Equilateral Triangle", 3, _sideLength);
    }
    
    public double getArea()
    {
        return Math.sqrt(3) / 4 * getSideLength() * getSideLength();
    }
}
