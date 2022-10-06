package bank;
import static bank.bank.br;
public class transfer {
    static void transfer()
    {
        try{
            System.out.println("Enter The Account Number Of Sender : ");
            int sno = Integer.parseInt(br.readLine());
            if (bank.d.AccountNumber.contains(new Integer(sno)))
            {
                float sbal = (float)(Float)bank.d.AccountBalance.elementAt(bank.d.AccountNumber.indexOf(new Integer(sno)));
                if(sbal > 0)
                { 
                    System.out.println("Enter The Account Number Of Reciever : ");
                    int dno = Integer.parseInt(br.readLine());
                    if (bank.d.AccountNumber.contains(new Integer(dno)))
                    {
                        System.out.println("Enter The Amount To Be Transferred : ");
                        float amount = Float.parseFloat(br.readLine());
                        if(sbal <= amount)
                        {
                            System.out.println("Insufficient Balance !!!");
                        }
                        else
                        {
                            float dbal = (float)(Float)bank.d.AccountBalance.elementAt(bank.d.AccountNumber.indexOf(new Integer(dno)));
                            sbal -= amount;
                            dbal += amount;
                            bank.d.AccountBalance.set(bank.d.AccountNumber.indexOf(new Integer(sno)),new Float(sbal));
                            bank.d.AccountBalance.set(bank.d.AccountNumber.indexOf(new Integer(dno)),new Float(dbal));
                            System.out.println("\n\n Amount Has Been Transferred From A/c No. : "+sno+" To A/c No. : "+dno+" Successfully...");
                            updateFile.update();
                        }
                    }
                    else
                    {
                        System.out.println("Account Does Not Exist !!!");
                    }
                }
                else
                {
                    System.out.println("Insufficient Balance !!!");
                }
            }
            else
            {
                System.out.println("Account Does not Exist !!!");
            }
        }
        catch(Exception e)
        {}
    }
}
