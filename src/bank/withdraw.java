package bank;
import static bank.bank.br;
import static bank.bank.d;
public class withdraw {
     static void withdraw()
    {
        int index=searchAccount.searchAccount();
        if(index>=0)
        {
            try{
                float balance = (float)(Float)d.AccountBalance.elementAt(index);
                if(balance <= 0)
                {
                    System.out.println("Account Does Not Have Sufficient Balance !!!\nPlease Deposit Some Amount First...");
                }
                else
                {
                    System.out.println("\nEnter The Amount To Withdraw : ");
                    float amount=Float.parseFloat(br.readLine());
                    if(balance <= amount)
                    {
                        System.out.println("Insufficient Balance !!!");
                    }
                    else
                    {
                        balance -= amount;
                        d.AccountBalance.set(index,new Float(balance));
                        System.out.println("\n\n Amount Withdrawn Successfully....");
                        System.out.println("\n\n Current Balance Is : Rs."+balance);
                        updateFile.update();
                    }
                }
            }
            catch(Exception e)
            {}
        }
    }

}
