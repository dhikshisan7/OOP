package Day1Hw.H8;

public class exeight {
        public static void main(String[] args) {
            char ch = args[0].charAt(0);
            if (Character.isLetter(ch)) {
                System.out.println("Alphabet");
            } else if (Character.isDigit(ch)) {
                System.out.println("Digit");
            } else {
                System.out.println("Special Character");
            }
        }
}
