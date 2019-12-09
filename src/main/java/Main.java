import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        String rerun;
        do {
            System.out.println("PASSWORD VALIDATOR");
            System.out.println("Password should be longer than than 8 characters\n" +
                    "Password should have at least one lowercase letter\n" +
                    "Password should have at least one uppercase letter\n" +
                    "Password should at least have one digit\n" +
                    "Password should have at least one special character\n");
            System.out.println("Please enter password :");
            Scanner input = new Scanner(System.in);
            String password = input.nextLine();
            PasswordChecker.passwordIsOk(password);
            PasswordChecker.passwordIsValid(password);
            System.out.println("Type 'Yes' to Run Again or 'No' to Exit  ");
            rerun=input.nextLine();
        }while (rerun.equalsIgnoreCase("Yes"));
    }
}
