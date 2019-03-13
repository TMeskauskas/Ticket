
/**
 * Write a description of class Resident here.
 *
 * @author (Tomas Meskauskas)
 * @version (02/13/2019)
 */
public class Resident
{
   private int residentNum;
   private int sleepHabits;
   private int studyHabits;
   private int socialActivity;
    
   
   public Resident(int residentNum, int sleepHabits, int studyHabits, int socialActivity)
   {
        this.residentNum = residentNum;
        this.sleepHabits = sleepHabits;
        this.studyHabits = studyHabits;
        this.socialActivity = socialActivity;
   }
    
   public Resident()
   {
       this(100, 20, 30, 20);
   }
   
   public String toString()
   {
       return "Resident #" + residentNum + "\n\tSleep Habits: " + sleepHabits + "\n\tStudy Habits: " + studyHabits + "\n\tSocial Activity: " + socialActivity;
   }
   
    public int getResidentNum() {return residentNum;}
    public int getSleepHabits() {return sleepHabits;}
    public int getSocialActivity() {return socialActivity;}
    public int getStudyHabits() {return studyHabits;}
}
    