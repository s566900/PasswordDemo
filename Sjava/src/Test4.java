
import java.sql.Connection;
import java.sql.DriverManager;

class Test4
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        try(

                Connection con= DriverManager.getConnection("","","");
        )
        {

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
