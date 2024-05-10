/** 
Program description: A decryptor program that deciphers the secret message.
Author: Berke Şahin
E-mail address: Sayanati517@gmail.com
Homework Number: 210401050
Last Changed: 09:00 9.11.2023
*/
public class problem01 {
    public static void main(String[] args) {
        String interceptedMessage = ":mmZ\\dxZmx]Zpgy";
        //Since there will be 100 keys, I used a for loop from 1 to 100.
        for (int key = 1; key <= 100; key++) {
            // In order to learn the decrypted message, I moved this process to another function.
            String decryptedMessage = decryptKey(interceptedMessage, key); 
            //I printed out the solved passwords. Program finished.
            System.out.println("Key " + key + ": " + decryptedMessage);
        }
    }
    public static String decryptKey(String message, int key) {
        // I used a StringBuilder to store the decrypted message.
        StringBuilder decryptedMessage = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            
            char encryptedChar = message.charAt(i);
            // I used decryptChar function to use ASCII.
            char decryptedChar = decryptChar(encryptedChar, key);
            decryptedMessage.append(decryptedChar);
        }
        // I used toString fuction because I need to print out the decrypted message as a string.
        return decryptedMessage.toString();
    }
    
    public static char decryptChar(char encryptedChar, int key) {
        // I used originalChar to use an ASCII character formula
        int originalChar =encryptedChar;
        int decryptedChar;
        // ASCII characters formula.
        if (originalChar - key < 32) {
            decryptedChar = 127 - (32 - (originalChar - key));
        } else {
            decryptedChar = originalChar - key;
        }
        
        return (char) decryptedChar;
    }
}