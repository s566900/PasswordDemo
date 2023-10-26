package UserName;
import java.util.Scanner;
public class UserNameDemo {

    public static void main(String[] args) {
        String[] username = new String[4];
        Scanner sc = new Scanner(System.in);
        String pattern = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";

        for(int i=0; i<username.length;i++){
            username[i] = sc.nextLine();
        }


        for(int i=0; i<username.length;i++){
            if(username[i].matches(pattern)){
                System.out.println("user name is correct");
            }
            else {
                System.out.println("user name is incorrect");
            }
        }


    }
}