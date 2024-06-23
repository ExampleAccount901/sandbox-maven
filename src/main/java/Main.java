import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();

        if (isPhoneNumber(line)) {
            System.out.println("String is a phone number");
        } else {
            System.out.println("String is not a phone number");
        }
    }

    private static boolean isPhoneNumber(String str) {


        return false;
    }
}
