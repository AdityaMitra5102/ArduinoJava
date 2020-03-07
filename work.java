public class work
{
    void on()
    {
        try{

         Process ec=Runtime.getRuntime().exec("on.bat");
        }
        catch(Exception e){}
        
    }
void off()
    {
        try{

          Process ec=Runtime.getRuntime().exec("off.bat");
        }
        catch(Exception e){}
        
    }
        
}
