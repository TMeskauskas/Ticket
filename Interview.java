
/**
 * An Interview class to compare to character objects.
 *
 * @author (Tomas Meskauskas)
 * @version (02/12/2019)
 */
public class Interview
{
    private Character c1, c2, c3, c4;
    
    public Interview(Character _c1, Character _c2, Character _c3, Character _c4)
    {
        c1 = _c1;
        c2 = _c2;
        c3 = _c3;
        c4 = _c4;
    }
    
    public Character compareCharisma()
    {
        System.out.println("Selection process for charisma:");
        System.out.println("The greeting for " + c1.getName() + ":");
        System.out.println(c1.sayHello());
        System.out.println("The greeting for " + c2.getName() + ":");
        System.out.println(c2.sayHello());
        System.out.println();
        
        Character selection;
        if (c1.getCharisma() > c2.getCharisma())
            selection = c1;
        else if (c2.getCharisma() > c1.getCharisma())
            selection = c2;
        else if (c1.getIntelligence() > c2.getIntelligence())
            selection = c1;
        else if (c2.getIntelligence() > c1.getIntelligence())
            selection = c2;
        else    
            {
                System.out.println("The candidates are equally matched.");
                selection = c1;
            }
            
        System.out.println("The selection is " + selection.getName() + ".");
        return selection;
    }
    
    
    public Character compareAge()
    {
        System.out.println("The selection process for age");
        System.out.println("The age for " + c3.getName() + " is" + c3.getAge());
        System.out.println("The age for " + c4.getName() + " is" + c4.getAge());
        
        Character selection;
        if (c3.getAge() < c4.getAge()) 
            selection = c3;
        else if (c4.getAge() < c3.getAge())
            selection = c4;
        else 
            selection = c3;
            
        return selection;
    }
}
