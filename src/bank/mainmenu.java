package bank;
import static bank.bank.br;
public class mainmenu {
    static void mainmenu()
    {
        try{
            int choice = -1;
            do{
                System.out.print("\033[H\033[2J");
                System.out.println("************************************************************************************");
                System.out.println("\t\t\tBank Management System");
                System.out.println("************************************************************************************\n\n");
                System.out.println("\t1. Add Account");
                System.out.println("\t2. Deposit");
                System.out.println("\t3. Withdraw");
                System.out.println("\t4. Display All Accounts");
                System.out.println("\t5. Remove Account");
                System.out.println("\t6. Search Account");
                System.out.println("\t7. Transfer Money");
                System.out.println("\t8. Exit");
                System.out.println("\n\nEnter Your Choice : ");
                choice = Integer.parseInt(br.readLine());
                System.out.println("--------------------------------------------------------------------------------");
                switch(choice)
                {
                    case 1 : addAccount.addAccount();
                    break;
                    case 2 : deposit.deposit();
                    break;
                    case 3 : withdraw.withdraw();
                    break;
                    case 4 : displayAllAccounts.displayAllAccounts();
                    break;
                    case 5 : removeAccount.removeAccount();
                    break;
                    case 6 : searchAccount.searchAccount();
                    break;
                    case 7 : transfer.transfer();
                    break;
                    case 8 : System.out.println("Are You Sure (y/n) : ");
                             if(br.readLine().equalsIgnoreCase("y"))
                                choice = -1;
                    break;
                    default : System.out.println("INVALID CHOICE !!!");
                    break;
                }
            } while(choice != -1);
        }
        catch (Exception e)
        {}
    }
}
