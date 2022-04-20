package Base64;

import java.util.Base64;

public class Base64BasicEncryptionExample {
    public static void main(String[] args) {

        Base64.Encoder encoder= Base64.getMimeEncoder();
        String msg = "Hello, \nYou are informed regarding your inconsistency of work";
        String str = encoder.encodeToString(msg.getBytes());
        System.out.println("Encoded MIME String :"+str);

        Base64.Decoder decoder = Base64.getMimeDecoder();
        String dstr = new String(decoder.decode(str));
        System.out.println("Decoded String :"+dstr);
    }
}


