package bank;
import java.io.*;
import java.util.*;
import java.util.regex.*;
class Declare
{
    Vector<Integer> AccountNumber = new Vector<Integer>();
    Vector<String> HolderName = new Vector<String>();
    Vector<Float> AccountBalance = new Vector<Float>();
Declare(){
      try{
      String filepath="D:\\vk\\college v\\Projects\\OODS_application_development\\BANK MANAGEMENT SYSTEM\\build\\classes\\bank\\file.csv" ;
      BufferedReader inFile =new BufferedReader(new FileReader(filepath));

      String line=inFile.readLine();
      //System.out.println(line);
      String[] words=null;
      
      Pattern pattern = Pattern.compile("^\\w[^,]+(?=,),\\w[^,]+(?=,),\\w[^,]+$");
      Matcher matcher = pattern.matcher(line);
        
      if (matcher.find())
      {
      // System.out.println("File compatible");   
      while((line=inFile.readLine())!=null)
      {
        words = line.split(",");

        /*for(String obj : words)
          System.out.println(obj);*/
    try{
        
    
        AccountNumber.addElement(Integer.parseInt(words[0].trim()));
        HolderName.addElement((words[1].trim()));
        AccountBalance.addElement(Float.parseFloat(words[2].trim()));
        //line=inFile.readLine();
    }
    catch(NumberFormatException e){System.out.println("format error"+e.getMessage());}
      }
    
      }
      else{
          System.out.println("File not compatible");
      }
    inFile.close();
  }catch(IOException e ){ System.out.println("Error: "+e.getMessage());}
    }
}

class bank
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Declare d = new Declare();
    public static void main(String args[])
    {   
        
        
        login lg = new login();
        lg.check();
    }

    static void display(int index)
    {
        System.out.println("Account Number : "+d.AccountNumber.elementAt(index));
        System.out.println("Account Holder Name : "+d.HolderName.elementAt(index));
        System.out.println("Available Balance : "+d.AccountBalance.elementAt(index));
    }
}

