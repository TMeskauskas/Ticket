
/**
 * Write a description of class Dolphin here.
 *
 * @author (Tomas Meskauskas)
 * @version (02/28/2019)
 */
public class Dolphin extends Animal
{
    private boolean isInPuddle;
    private boolean isHungry;
    private int numberOfFins;
    
    public Dolphin(boolean _isHungry, boolean _isInPuddle, String _gender, int numberOfFins)
    {
        super(_isHungry, 20, 0, _gender);
        
        isInPuddle = _isInPuddle;
        isHungry = _isHungry;
    }
    
    public void makeNoise()
    {
        if(isHungry)
        System.out.println("whistles and sounds that resemble moans, trills, grunts, squeaks, and creaking doors.");
        else
            System.out.println("Whass good fam");
            
    }
    
    public void locomote()
    {
        System.out.println("I have no legs, I can't walk :(");
    }
}
