/**
 * A space to test my Character Class.
 *
 * @author (Tomas Meskauskas)
 * @version (01/29/19)
 */
public class CharacterMain
{
    public static void main(String [] args)
    {
        Character ch1 = new Character();
        Character ch2 = new Character("James", 18, 66, 73);
        Character ch3 = new Character("Shaggy", 25, 95, 100);
        Character ch4 = new Character("Toro", 70, 30, 10);
        
        System.out.println(ch1);
        System.out.println(ch2);
        
        System.out.println(ch1.sayHello());       
        System.out.println(ch2.sayHello());
        
        System.out.println();
        
      //  Interview int1 = new Interview (ch1, ch2);
       // int1.compareCharisma();
        
       // Interview int2 = new Interview(ch3, ch4);
       // int.compareAge();
        
        
        

    }
}
