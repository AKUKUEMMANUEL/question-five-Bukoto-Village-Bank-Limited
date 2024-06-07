/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akuku
 */
import java.util.Scanner;
public class BukotoVillageBankSystem {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numMembers;
        double interestRate, investmentDuration;
        
        System.out.print("Enter number of Members:");
        numMembers = scanner.nextInt();
        
        System.out.print("Enter the interest rate:");
        interestRate = scanner.nextDouble();
        System.out.print("Enter investment duration:");
        investmentDuration = scanner.nextDouble();
        
System.out.println("Calculating investment values using for loop:");
for(int i = 1; i<=numMembers; i++){
    System.out.print("Enter the principal amount for member" +i+":");
    
    double principalAmount = scanner.nextDouble();
    double investmentValue = principalAmount*Math.pow(1+ interestRate,investmentDuration);
    System.out.printf("Member %d's investment value: %2f\n", i,investmentValue);
}
System.out.print("\nCalculate investment values using while loop:");
int memberIndex = 1;
while(memberIndex <= numMembers){
    System.out.print("Enter the principal amount for member" + memberIndex + ":");
    double principalAmount = scanner.nextDouble();
    double investmentValue = principalAmount * Math.pow(1 + interestRate, investmentDuration);
    System.out.printf("Members %d's investment value: %.2f\n", memberIndex, investmentValue);
    }memberIndex++;
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
