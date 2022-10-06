package bank;
import static bank.bank.d;
public class removeAccount {
   static void removeAccount()
    {
        int index=searchAccount.searchAccount();
        if(index > 0)
        {
            d.AccountNumber.removeElementAt(index);
            d.HolderName.removeElementAt(index);
            d.AccountBalance.removeElementAt(index);
            System.out.println("\n\nAccount Deleted Successfully.");
            updateFile.update();

        }
        else if(d.AccountNumber.size() == 0)
        {
            System.out.println("Account Cannot Be Deleted As Only One Account Is Present In System...");
        }
    }  
}
