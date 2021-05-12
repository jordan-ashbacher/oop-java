public class caesar {
    public static void main (String[] args) {

        System.out.println(encrypt("HELLO MY NAME IS JORDAN", 3));
    }

    public static String encrypt(String message, int key) {

        StringBuilder encrypted = new StringBuilder(message);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);

        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);

            if (idx != -1) {
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i, newChar);
            };
        };
        return encrypted.toString();
        
    };
    
};