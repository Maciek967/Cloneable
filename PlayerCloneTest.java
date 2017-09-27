public class PlayerCloneTest
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Robert Lewandowski", "Bayern Munich", 1000.00);
        try
        {
            System.out.println(p1);
            
            Player p2 = (Player)p1.clone();
            p2.setClub("Real Madrid");//Sets a new club for the player
            p2.raiseSalary(50);//Will raise by 50 percent
            System.out.println(p2);
            
            Player p3 = (Player)p2.clone();
            p3.raiseSalary(10);//Will raise further 10 percent
            System.out.println(p3);
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}