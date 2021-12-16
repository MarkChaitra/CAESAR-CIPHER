public class Cipher {
    //Declare the attributes
    private String message;
    private int shift;
    
    //Declares what the attributes equals to
    public Cipher(String message, int shift){
        this.message = message;
        this.shift = shift;
    }
    
    //Encodes the message. When called prints the final encoded message
    public void encode(){
        //Will hold the message with the shifted letters
        String codedMessage = " ";
        
        //Traverses the users message
        for(int i = 0; i < message.length(); i++){
            //Chnages the character to a int value
            int letterIndex = (int)message.charAt(i);
            //If letterIndex is a letter Decimal number in the ASCII table
            if(letterIndex >= 65 && letterIndex <= 90){
                //Condences the shift if it shifts more than 26
                if(shift > 26 || shift < -26){
                    shift %= 26;
                }
                //Shifts the letter
                int codedLetter = (letterIndex + shift); 
                //If codedletter value is less then 65 it will subtract the difference then subtract that from Z+1 
                if(codedLetter < 65){
                    //Convert number to char then add to codedMessage
                    codedMessage += (char)(91 - (65 - codedLetter));
                } else{
                    //If codedLetter value is greater then Z, subtract the value by 90 then add A-1 
                    if(codedLetter > 90){
                        codedLetter = 64 + (codedLetter - 90);
                    }
                    //Converts shifted letter to a char and adds to codedMessage
                    codedMessage += (char)(codedLetter);
                }               
            }  
        }
        //Prints out the formatted final message
        System.out.println("Coded message:");
        //Helper is called to format the message
        System.out.println(helper(codedMessage));
    }
    
    //Helper to properly format the message
    private String helper(String unformatedMessage){
        //String to hold new message
        String helperSpacing = "";
        //Traverses the string
        for(int i = 1; i < unformatedMessage.length(); i++){
            //Adds letter to the new string
            helperSpacing += unformatedMessage.charAt(i);
            //After the 5th letter add a space
            if(i % 5 == 0){
                helperSpacing += " ";
            }
            //After the 50th letter start a new line
            if(i % 50 == 0){
                helperSpacing += "\n";
            }
        }
        //Returns a formatted message when called
        return helperSpacing;
    }
    
    //Sets new message
    public void setMessage(String newMessage){
        this.message = newMessage.toUpperCase();
    }
    //Sets new shift
    public void setShift(int newShift){
        this.shift = newShift;
    }
    //Gets message
    public void getMessage(){
        System.out.println(message);
    }
    //Gets message
    public void getShift(){
        System.out.println(shift);
    }
   
}
