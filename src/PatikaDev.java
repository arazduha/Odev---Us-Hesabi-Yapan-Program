import java.util.Scanner;
public class PatikaDev {
    static void power(){
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Taban degeri giriniz: ");
            int base = input.nextInt();
            System.out.print("Us degeri giriniz: ");
            int exponent = input.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++){
                result *= base;
            }
            System.out.println("Sonuc : " + result);
        }
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            power();

    }
}

