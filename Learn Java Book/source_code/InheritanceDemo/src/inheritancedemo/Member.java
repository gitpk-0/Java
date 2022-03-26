/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;
import java.util.Scanner;
/**
 *
 * @author Jamie
 */
//abstract public class Member {
public class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
    
    public Member()
    {
        System.out.println("Parent Constructor with no parameter");        
    }        

    public Member(String pName, int pMemberID, int pMemberSince)
    {
	System.out.println("Parent Constructor with 3 parameters");

	name = pName;
	memberID = pMemberID;
	memberSince = pMemberSince;
    }

    public double getDiscount(){
        
        return discount;
    }

    public void setDiscount(){
    
	Scanner input = new Scanner(System.in);                
	String password;

	System.out.print("Please enter the admin password: ");
	password = input.nextLine();

	if (!password.equals("abcd"))
	{
            System.out.println("Invalid password. You do not have authority to edit the discount.");
	}else
	{
            System.out.print("Please enter the discount: ");
            discount = input.nextInt();
	}
    }
    
    public void displayMemInfo(){

	System.out.println("Member Name: " + name);
	System.out.println("Member ID: " + memberID);
	System.out.println("Member Since " + memberSince);
	System.out.println("Annual Fee: " + annualFee);
    }

    public void calculateAnnualFee()
    {
        annualFee = 0;
    }
    
    //abstract public void calculateAnnualFee();
    
}
