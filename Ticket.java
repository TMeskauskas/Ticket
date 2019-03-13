
/**
 * Write a description of class s2 here.
 *
 * @author (Tomas Meškauskas & Chris Choi)
 * @version (a version number or a date)
 */
public abstract class Ticket
{
    private int ticketNum;
    
    public Ticket(int ticketNum)
    {
        this.ticketNum = ticketNum;
    }
    
    public double getTicketPrice()
    {
        double price = 0;
        return price;
    }
    
    public String toString()
    {
        return "Number: " + ticketNum + ", Price: " + getTicketPrice() + ".";
    }
    
    public int getTicketNum() {return ticketNum;}
}
