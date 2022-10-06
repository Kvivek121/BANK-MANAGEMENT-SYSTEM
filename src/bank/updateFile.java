package bank;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.io.FileWriter;


import static bank.bank.br;
import static bank.bank.d;
public class updateFile extends Declare {
  static void update(){
    try{
   // System.out.println("welcome to update\n");
    BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\vk\\college v\\Projects\\OODS_application_development\\BANK MANAGEMENT SYSTEM\\build\\classes\\bank\\file.csv"));

    String headers="Account Number,Holder Name,Account Balance";
    wr.write(headers);
    wr.newLine();

    String data="";
    int i=0;
    for(i=0;i<(d.AccountNumber.size());i++){
      data=String.valueOf(d.AccountNumber.elementAt(i))+","+d.HolderName.elementAt(i)+","+String.valueOf(d.AccountBalance.elementAt(i));
      //System.out.println(data);
      wr.write(data);
      wr.newLine();
      //System.out.println("updating File\n");
        }
        wr.close();
}catch(IOException e ){System.out.println("Error: "+e.getMessage());}
  }
}
