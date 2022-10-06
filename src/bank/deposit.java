package bank;
import static bank.bank.br;
import static bank.bank.d;
public class deposit {
     static void deposit()
    {
        int index=searchAccount.searchAccount();
        if(index>=0)
        {
            try{
                float balance = (float)(Float)d.AccountBalance.elementAt(index);
                System.out.println("\nEnter The Amount To Deposit : ");
                float amount=Float.parseFloat(br.readLine());
                balance += amount;
                d.AccountBalance.set(index,new Float(balance));
                System.out.println("\n\n Amount Deposited Successfully....");
                System.out.println("\n\n Current Balance Is : Rs."+balance);
                updateFile.update();

            }
            catch(Exception e)
            {}
        }
    }
}
