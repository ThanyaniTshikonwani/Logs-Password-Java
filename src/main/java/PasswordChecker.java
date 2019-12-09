import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordChecker {

    public  static final Logger logger = LogManager.getLogger(PasswordChecker.class);
        public static boolean passwordIsValid (String password) {

            String lowerCaseChars = "(.*[a-z].*)";
            String numbers = "(.*[0-9].*)";
            String specialCharacter = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            String upperCaseChars = "(.*[A-Z].*)";

            if (password.isEmpty()){
                System.out.println("Password Exist");
            }
            if (password.length() > 8) {
            } else {
//                System.err.println("Password should be longer than than 8 characters");
//                logger.error("Password should be longer than than 8 characters");
                logger.error("\"Password should be longer than than 8 characters\"");
            }
            if (password.matches(lowerCaseChars)) {
            } else {
                logger.error("Password should have at least one lowercase letter");
            }
            if (password.matches(upperCaseChars)) {
            } else {
                logger.error("Password should have at least one uppercase letter");
            }
            if (password.matches(numbers)) {
            } else {
                logger.error("Password should at least have one digit");
            }

            if (password.matches(specialCharacter)) {
            } else {
                logger.error("Password should have at least one special character");
            }

            if (password.length() > 8 && password.matches(lowerCaseChars) && password.matches(upperCaseChars)
                    && password.matches(numbers) && password.matches(specialCharacter) == true){
                logger.info("Password is Valid");
            } else {
//                System.err.println("Invalid Password");
            }

            return false;
        }
        public static boolean passwordIsOk (String password) {

            String lowerCaseChars = "(.*[a-z].*)";
            String numbers = "(.*[0-9].*)";
            String specialCharacter = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            String upperCaseChars = "(.*[A-Z].*)";
            if (password.length() > 8 && password.matches(lowerCaseChars) | password.matches(upperCaseChars)
                    && password.matches(numbers) | password.matches(specialCharacter) == true){
                System.out.println("Password is OK");
                logger.info("Password is Ok");

            }else {
                logger.debug("Password doesnt meet any 3 conditions");
            }
            return false;
        }
}