public class Encrypt {

    private String plainText;
    private  int shift;

    public  Encrypt(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }

    public  String getPlainText (){
        return plainText;
    }

    public int getShift (){
        return shift;
    }
        public static String encrypt (Encrypt encrypt)
        {

            StringBuilder encryptedText = new StringBuilder();
            int length = encrypt.plainText.length();
            for (int i = 0; i < length; i++) {
                char myCharacter = encrypt.plainText.charAt(i);
                if (Character.isLetter(myCharacter)) {
                    if (Character.isLowerCase(myCharacter)) {
                        char newCharacter = (char) (myCharacter + encrypt.shift);
                        if (newCharacter > 'z') {
                            encryptedText.append((char) (myCharacter - (26 - encrypt.shift)));
                        } else {
                            encryptedText.append(newCharacter);
                        }
                    } else if (Character.isUpperCase(myCharacter)) {
                        char newCharacter = (char) (myCharacter + encrypt.shift);
                        if (newCharacter > 'Z') {
                            encryptedText.append((char) (myCharacter - (26 - encrypt.shift)));
                        } else {
                            encryptedText.append(newCharacter);
                        }
                    }
                } else {
                    encryptedText.append(myCharacter);
                }
            }
            return encryptedText.toString();
        }
    }


