import java.util.*;
public class nonGui
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        work obj=new work();
        
        do
        {
            System.out.println("Press 1 for on");
            System.out.println("Press 2 for off");
            System.out.println("Press 0 for exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:obj.on();
                    break;
                case 2:obj.off();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while (true);
    }
}
