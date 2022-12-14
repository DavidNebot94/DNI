import java.util.Scanner;
public class Dni {
    public void main(String[] argv){
        Scanner inputValue = new Scanner(System.in);
        Dni d;
        int num;
        char letter;
        do {
            System.out.println("Numero del DNI");
            num = inputValue.nextInt();
            System.out.println("Letra del DNI");
            letter = inputValue.next().charAt(0);
            d = new Dni(num, letter);
            if (!d.isDniCorrect()) {
                System.out.println("DNI incorrecto");
            }
        } while (!d.isDniCorrect());
        System.out.println("DNI correcto");

    }
}
