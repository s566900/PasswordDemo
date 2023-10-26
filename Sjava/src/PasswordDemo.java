import java.util.Scanner;



public class PasswordDemo {

    public static void main(String[] args) {
        String[] password = new String[4];
        Scanner sc = new Scanner(System.in);
        String passpattern = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";
        System.out.println("Enter the password");
        for (int i = 0; i < password.length; i++) {
            password[i] = sc.nextLine();
        }


        System.out.println("Your Result is ");
        for (int j = 0; j < password.length; j++) {
            if (password[j].matches(passpattern)) {
                System.out.println("password is correct");
            } else {
                System.out.println("password is incorrect");
            }
        }
    }
}