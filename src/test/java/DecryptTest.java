import org.junit.Test;

import org.junit.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class DecryptTest {


        @Test
        public void runDecrypt_instantiates(){
            Decrypt testDecrypt = new Decrypt("THE",1);
            assertEquals(true, testDecrypt instanceof Decrypt);
        }

        @Test
        public void runDecrypt_ifInputIsString() {
            Decrypt testDecrypt = new Decrypt("obnf", 1);
            assertEquals("obnf", testDecrypt.getPlainText());
        }

        @Test
        public void runDecrypt_ifKeyIsInt() {
            Decrypt testDecrypt = new Decrypt("obnf",1);
            assertEquals(1, testDecrypt.getShift());
        }
        @Test
        public void runDecrypt_ifDecryptsVariousInputs() {
            Decrypt testDecrypt = new Decrypt("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", 3);
            // does not decrypt integers and other characters but returns them as is
            assertEquals("!LAZY BROWN FOX JUMPS OVER A LAZY DOG2", Decrypt.decrypt(testDecrypt));
        }
    }

