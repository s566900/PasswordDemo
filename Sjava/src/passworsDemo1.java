import java.util.Scanner;

public class passworsDemo1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String regexPattern = "^(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[@#=])[a-zA-Z0-9@#=]{5,10}.com$";

        String pass[] = {"12 34@a", "ABC3a#@", "1Ac@", "ABC 3a#@"};


        for (int j = 0; j < pass.length; j++) {
            if (pass[j].matches(regexPattern) == true) {
                System.out.println("Pass");
            } else {
                System.out.println("fail");
            }
        }

    }

    }