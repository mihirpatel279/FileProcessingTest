/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocessingtest;

import java.util.Formatter;
import java.util.Scanner;
import java.util.FormatterClosedException;
import java.io.*;
/**
 *
 * @author Mihir
 */
public class WrtieTextFile {
    
    private Formatter output;
    
    public void openFile()
    {
        //different from the example in the slides
        //right , use appeding data
        
        try
        {
           FileWriter fw = new FileWriter("clients.text" , true);   //append
           output = new Formatter(fw);
        }
        catch(IOException e)
        {
            System.out.println("Error pening or creating file ");
            System.exit(1);
        }
    }
    
    public void addRecords()
    {
        //create an obj
        
        AccountRecord record = new AccountRecord();
        Scanner input = new Scanner(System.in);
        
        String userSelection = "y";
        
        while(!userSelection.equals("n"))
        {
            try
            {
                System.out.println("please enter account number,first name, "
                        + "last name and balance");
                
                record.setAccount(input.next());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());
                
                //key to use formatter
                output.format("%s %s %s %.2f%n", record.getAccount(),
                        record.getFirstName(),record.getLastName(),
                        record.getBalance());
                
                System.out.println("Do you have another record to write?");
                userSelection = input.next();
            }
            catch(FormatterClosedException fe)  //un check exception
            {
                System.err.println("Error writing to file");
                return ;
            }
        }
    }
    
    public void closeFile()
    {
        if(output!=null)
            output.close();
    }
}
