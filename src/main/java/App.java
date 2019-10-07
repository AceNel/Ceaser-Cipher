import java.io.*;
public class App {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter your message");
            String userInput = br.readLine();
            System.out.println("Enter the amount of shifts");
            int userShift = Integer.parseInt(br.readLine());
            System.out.println("Enter 1 for Encrypted and 2 for Decrypted");

            int encode = Integer.parseInt(br.readLine());
            Encrypt newCaesar = new Encrypt(userInput, userShift);
            String encrypted = Encrypt.encrypt(newCaesar);
            System.out.println("Encrypted message is " + encrypted);
            int decode = Integer.parseInt(br.readLine());
            Decrypt caesar = new Decrypt(encrypted,userShift);
            String decrypted = Decrypt.decrypt(caesar);
            System.out.println("Decrypted message is " + decrypted);
        } catch(Exception e){
            System.out.println("There really aren't that many exceptions to this code, but kudos to you for finding one, now let's try this again...");
        }
    }
}


