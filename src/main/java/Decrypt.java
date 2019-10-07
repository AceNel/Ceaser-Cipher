public class Decrypt {
    private String plainText;
    private  int shift;

    public  Decrypt(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }

    public  String getPlainText (){
        return plainText;
    }

    public int getShift (){
        return shift;
    }

    public static String decrypt(Decrypt decrypt)
    {

        StringBuilder encryptedText = new StringBuilder();
        int length = decrypt.plainText.length();
        for(int i = 0; i < length; i++){
            char myCharacter = decrypt.plainText.charAt(i);
            if(Character.isLetter(myCharacter)){
                if(Character.isLowerCase(myCharacter)){
                    char newCharacter = (char)(myCharacter - decrypt.shift);
                    if(newCharacter < 'a'){
                        encryptedText.append((char) (myCharacter + (26 - decrypt.shift)));
                    }
                    else {
                        encryptedText.append(newCharacter);
                    }
                }
                else if(Character.isUpperCase(myCharacter)){
                    char newCharacter = (char)(myCharacter - decrypt.shift);
                    if(newCharacter < 'A'){
                        encryptedText.append((char) (myCharacter + (26 - decrypt.shift)));
                    }
                    else {
                        encryptedText.append(newCharacter);
                    }
                }
            }
            else {
                encryptedText.append(myCharacter);
            }
        }
        return encryptedText.toString();
    }
}
