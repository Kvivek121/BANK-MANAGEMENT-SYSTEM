package bank;
import static bank.bank.br;
public class searchAccount {
     static int searchAccount()
    {
        int accno;
        System.out.println("Enter The Account Number : ");
        try{
            accno=Integer.parseInt(br.readLine());
            if (bank.d.AccountNumber.contains(new Integer(accno)))
            {
                int index = bank.d.AccountNumber.indexOf(new Integer(accno));
                bank.display(index);
                return index;
            }
            else
                System.out.println("Account Does Not Exists !!!");
        }catch(Exception e)
        {}
        return -1;
    }
}
