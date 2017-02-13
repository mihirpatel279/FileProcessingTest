/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocessingtest;

import java.util.Scanner;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Mihir
 */
public class ReadTextFile {
    
    private Scanner input;
    private String a ;
    private double sum = 0;
    public void openFile()
    {
        try
        {
            input = new Scanner(new File("clients.text"));
        }
        catch(FileNotFoundException fn)
        {
            System.err.println("Error opening File");
            System.exit(1);
        }
    }
    
    public void readRecords()
    {
        
        
        Student record = new Student();
        
        try
        {
           while(input.hasNext())
           {
               record.setId(input.nextInt());
               record.setName(input.next());
               record.setCourse(input.next());
               
               
               String a = record.getCourse() ;
               int b = record.getId();
               String c = record.getName();
               
               Connection conn = null;
             Statement stat = null;
            ResultSet rs = null;
            final String DB_URL = "jdbc:mysql://mis-sql.uhcl.edu/patelm8116";
            try
            {
            conn = DriverManager.getConnection(DB_URL,"patelm8116","1460202");
            stat = conn.createStatement();
            if(a.equals("MIS"))
            {
             int r = stat.executeUpdate("insert into MIS values('" + b + "','" + c + "')" );
                         
            }
            else if (a.equals("ACCT"))
            {
                int r = stat.executeUpdate("insert into Accounting values('" + b + "','" + c + "')" );
            }
              
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            try
            {
               if(conn!= null)
                   conn.close();
               if(stat!= null)
                   stat.close();
               if(rs!=null)
                   rs.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
               
              
               
           }
           
           
        }
        catch(Exception e)
        {
            System.err.println("File improperly formed");
            System.exit(1);
        }
    }
    
    
     public void closeFile()
    {
        if(input!=null)
            input.close();
    }
}
