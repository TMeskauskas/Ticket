
/**
 * A place for Animals.
 *
 * @author (Tomas Meskauskas)
 * @version (02/27/2019)
 */
public class AnimalMain
{
    public static void main (String [] args)
    {
        Animal a = new Animal(true, 7, 6, "female");
        
        a.locomote();
        a.eat();
        a.loseLegs(2);
        
        System.out.println();
        
        Dog b = new Dog(true, "male", false, "Corki");
        b.locomote();
        b.eat();
        b.loseLegs(0);
        b.wagTail();
        b.bork();
        
        System.out.println();
        
        Dolphin c = new Dolphin(true, true, "female", 5);
        c.locomote();
        c.eat();
        c.loseLegs(10);
        c.makeNoise();
        
        System.out.println();
        
        Animal e = new Dog(true, "male", false, "Corki");
        e.eat();
        e.locomote();
    }
}
