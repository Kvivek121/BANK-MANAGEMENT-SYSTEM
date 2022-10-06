package bank;
import static bank.bank.d;
public class displayAllAccounts {
    static void displayAllAccounts()
    {
        System.out.println("      Account No.       |       Account Holder Name       |       Balance");
        System.out.println("-------------------------------------------------------------------------------");
        if(d.AccountNumber.size()>0)
        {
            for(int i=0;i<d.AccountNumber.size();i++)
            {
                System.out.printf("      %-17d |       %-25s |       ",d.AccountNumber.elementAt(i),d.HolderName.elementAt(i));
                System.out.println(d.AccountBalance.elementAt(i));
            }
        }
        else
        {
            System.out.println("\n\n\n\t\t  No Accounts To Display !!!\n\n\n");
        }
    }
}
