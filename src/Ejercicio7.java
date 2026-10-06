import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner inputValue=new Scanner(System.in);
        char[] letter= {'T','R', 'W','A','G','M','Y','F','P','D','X','B','N','J','Z','S'
                ,'Q','V','H','L','C','K','E'};

        int num;

        System.out.println("Introduce your DNI, without letter: ");
        num= inputValue.nextInt();
        System.out.println(letter[num % 23]);


    }
}
