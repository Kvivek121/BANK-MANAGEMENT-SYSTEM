package bank;
import static bank.bank.br;
public class addAccount {
       static void addAccount()
    {
        try{
            System.out.println("Enter The Account Number : ");
            Integer accno = new Integer(br.readLine());
            if(bank.d.AccountNumber.contains(accno))
            {
                System.out.println("Account Already Exists !!!");
            }
            else
            {
                System.out.println("Enter The Account Holder Name : ");
                String name = br.readLine();
                bank.d.AccountNumber.addElement(accno);
                bank.d.HolderName.addElement(name);
                bank.d.AccountBalance.addElement(new Float(0));
                System.out.println("\n\n Account Added Successfully....\n\n");
                System.out.println("\n\n|------------------------------------------------------------------------------|");
                System.out.println("| NOTE : Balance Is Rs.0.00 For New Accounts Until Some Amount Is Deposited... |");
                System.out.println("|------------------------------------------------------------------------------|\n");
                System.out.println(" Account Details Are As Follows : \n");
                bank.display(bank.d.AccountNumber.indexOf(accno));
                updateFile.update();
            }
        }
        catch(Exception e)
        {}
    }
}
