
package calculator;


import java.util.InputMismatchException;
 import java.util.Scanner;
public class Calculator {
 
    public static void main(String[] args) {
        try{
            multiProgram();
        }
        catch(InputMismatchException ex){
        System.out.println("Error! Please enter a number: \n..............");
            multiProgram();
        }
        catch(Exception ex){
            System.out.println("An error occured? ");
            multiProgram();
            }
        finally{System.out.println("Thank you for using my calculator");
    }
        }
    private static void multiProgram(){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MY CALCULATOR");
        
        System.out.println("Enter two  value not more than 100");
        
        System.out.println("Enter the first value :");
        byte y = input.nextByte();
        System.out.println("enter the second value :");
        byte x = input.nextByte();
       
        System.out.println("Enter a number to choose an operation");
        System.out.println(" 1.ADDITION");
        System.out.println(" 2.MULTIPLICATION");
        System.out.println(" 3.DIVIDION");
        System.out.println(" 4.SUBSTRUCTION");
         byte choice =input.nextByte();
        
        switch (choice) {
            case 1 -> System.out.println("The addition of the two values are "+(y+x));
            case 2 -> System.out.println("The multiplication of the two values are "+(y*x));
            case 3 -> System.out.println("The division of the two values are "+(y/x));
            case 4 -> System.out.println("The substruction of the two values are "+(y-x));
            default ->System.out.println("The number id out of range");
        }
        }
    }
    
    
        
        
        
        
        
                
        
        
    
    

