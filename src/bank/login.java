package bank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class login {
   
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String username="admin";
    static String password="1234";
    String user;
    String pass;
    
    void accept()
    {
        try{
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("\n\t\tWelcome To Bank Management System\n");
            System.out.println("\nEnter The Username : ");
            user = br.readLine();
            System.out.println("Enter The Password : ");
            pass = br.readLine();
        }
        catch(Exception e)
        {}
    }

    void check()
    {
        for(int i = 2; i >= 0 ; i--)
        {
            accept();
            if(username.compareTo(user) == 0 && password.compareTo(pass) == 0)
            {
                System.out.println("\n\n Login Successfull....\n\n");
                mainmenu.mainmenu();
                break;
            }
            else
            {
                System.out.println("\n\n Login Unsuccessfull !!!");
                System.out.println(" The Entered Username Or Password May Be Incorrect !!!");
                if(i > 0)
                    System.out.println(" You Have "+i+" Chance(s) Remaining....\n Please Enter Valid Credentials & Try Logging In Again...\n");
                else
                    System.out.println(" You Have Exhausted All Your Chances To Successfully Login Into The System !!!\n Please Restart The Program....");
            }
        }
    }

}

