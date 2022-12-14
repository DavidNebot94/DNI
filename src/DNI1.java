public class DNI1 {
    private int number;
    private char letter;
    private static final char[] LETTERS = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','l','C','K','E'};

        public DNI1() {
            number = 0;
            letter = LETTERS[0];
        }

        public DNI1(int newNumber){
            number = Math.abs(newNumber);
            letter = LETTERS[number % 23];
        }
        public DNI1(int newNumber, char newLetter){
            number = Math.abs(newNumber);
            letter = LETTERS[number % 23];
            System.out.println("Letra mayuscula:" + Character.toUpperCase(newLetter));
            if (Character.toUpperCase(newLetter) != letter){
                number = number;
            }
        }
        public DNI1 (String s) {
            letter = Character.toUpperCase(s.charAt(s.length() - 1));
            String newS = s.replaceAll("[^0-9]", "");
            number = Integer.parseInt(newS);
            char c = LETTERS [number % 23];
            if (c != letter ){
                number = - number;
            }
        }
        public boolean isDniCorrect() {
            if (number < 0){
                return false;
            } else {
                return true;
            }
        }
        public int getNumber() {
            return number;
        }
        public char getLetter() {
            return letter;
        }
        public void setNumber(int newNumber) {
            number = newNumber;
            letter = LETTERS[number % 23];
        }
    public String toString() {
        return number + Character.toString(letter);
    }
    public String toFormattedString() {
            StringBuilder s = new StringBuilder(String.valueOf(number));
            if (number > 999){
                s.insert(s.length() -3, '.');
            }
        if (number > 999999){
            s.insert(s.length() -7, '.');
        }
        if (number > 999999999){
            s.insert(s.length() -11, '.');
        }

        return null;
    }
}
