public class Player implements Cloneable
{
    String name, club;
    double salary;
    
    public Player(String name, String club, double salary)
    {
        this.name = name;
        this.club = club;
        this.salary = salary;
    }
    
    public Player clone() throws CloneNotSupportedException
    {
        return (Player)super.clone();
    }
    
    public String getName() 
    { 
        return name;
    }
    
    public String getClub()
    {
        return club;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    //Sets a club for a player
    public void setClub(String club)
    {
        this.club = club;
    }
    
    //Method will raise the players salary by given percent(%)
    public void raiseSalary(double percent)
    {
        double raise = salary * percent/100;
        salary += raise;
    }
    
    public String toString()
    {
        return "Name: " + name + "\nClub: " + club + "\nSalary: " + salary + "\n";
    }
}