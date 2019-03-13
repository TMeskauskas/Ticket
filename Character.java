/**
 * Write a description of class character here.
 *
 * @author (Tomas Meskauskas)
 * @version (02/05/2019)
 */
public class Character
{
    private String name;
    private int age, intelligence, charisma;
    
    public Character(String name, int age, int intelligence, int charisma)
    {
        this.name = name;
        this.age = age;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
    
    public Character()
    {
        this("Generic lad", 25, 60, 60);
    }
    
    public String sayHello()
    {
        String greeting = "Hello, my name is " + name + " I am " + age  + " years old.";
        if (charisma > 50) 
            greeting += " Nice to meet you.";
        else if (charisma > 30)
            greeting += " What do you want?";
        else 
            greeting += " Get lost!"; 
        return greeting;
    }
    
    
    
    
    
    
    
    
    
    
    
    public String getName()     {return name;}
    public int getAge()     {return age;}
    public int getIntelligence()        {return intelligence;}
    public int getCharisma()        {return charisma;}
    
}