import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest  {

    @Test
    void passWordIsEmpty() {
        assertTrue(PasswordChecker.passWordIsEmpty(" "));
    }

    @Test
    void passwordCheck() {
        assertTrue(PasswordChecker.passwordCheck("Thanyani419381293%*"));
    }

    @Test
    void passWordIsOK() {
        assertTrue(PasswordChecker.passWordIsEmpty("Thannuasdu38780@"));
    }
}