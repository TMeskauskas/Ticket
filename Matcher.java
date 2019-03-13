
/**
 * Write a description of class calculatedCompScore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matcher
{
    private Resident [] group;
    
    public Matcher(Resident[] group)
    {
        this.group = group;
    }
    
    public double calculateCompScore(Resident r1, Resident r2) 
    {       
        double difference = Math.abs(r1.getSleepHabits() - r2.getSleepHabits()) + Math.abs(r1.getStudyHabits() - r2.getStudyHabits()) + Math.abs(r1.getSocialActivity() - r2.getSocialActivity());
        return difference / 3;
    }

    
    //public Resident[] bestMatch()
    //{
    //    for(int i = 0; i < group.length()
    //}
}
