/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocessingtest;

/**
 *
 * @author Mihir
 */
public class AccountRecord {
    
    private String account;
    private String lastName;
    private String firstName;
    private double balance;
    
    public AccountRecord(String a, String l , String f , double b)
    {
      account = a;
      lastName = l;
      firstName = f;
      balance = b ;
    }
     public AccountRecord()
     {
         
     }
   

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    
}
