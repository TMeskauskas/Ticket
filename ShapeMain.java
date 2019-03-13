
/**
 * Write a description of class ShapeMain here.
 *
 * @author (Tomas Me�kauskas)
 * @version (03/05/2019)
 */
public class ShapeMain
{
    public static void main(String [] args)
    {
        Square s = new Square(10);
        System.out.println(s.hey());
        System.out.println(s);
        s.sayHello();
        
        EquilateralTriangle et = new EquilateralTriangle(5);
        System.out.println(et);
        
        RegularPolygon s2 = new Square(15);
        System.out.println(s2.getArea());
        //s2.sayHello();
        
        RegularPolygon et2 = new EquilateralTriangle(10);
        System.out.println(et2.getArea());
        
        RegularPolygon [] shapes = {s2, et2};
        for (int i = 0; i < shapes.length; i++)
             System.out.println(shapes[i]); 
        
    }
}
