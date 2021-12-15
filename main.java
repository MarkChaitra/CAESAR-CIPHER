/*
Name: Mark Chaitra
Date: Tuesday November 9, 2021
Programs Task: Asks the user for a message and a shift number, shifts each 
character in the message that certain amount and prints it out formatted.
*/

import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("//////////////////////////////////////////////////////////\n//////                 CaesarCipher                 //////\n//////////////////////////////////////////////////////////\n");
        //Asks user for a message
        System.out.println("Encode a message:");
        String message = input.nextLine().toUpperCase();
        
        //Ask useer for a shift value
        System.out.println("\nCreate a shift:");
        int shift = input.nextInt();
        
        System.out.println();
        
        //Creates the Cipher object
        Cipher CaesarCipher = new Cipher(message, shift);
       
        //Print the final encoded message with the shift and formatting
        CaesarCipher.encode();
        
        
        /* Use to change message or shift after object is made
        System.out.println();
        CaesarCipher.setMessage("Mark");
        CaesarCipher.setShift(5);
        CaesarCipher.encode();
        CaesarCipher.getMessage();
        CaesarCipher.getShift();
        */
    }
}
