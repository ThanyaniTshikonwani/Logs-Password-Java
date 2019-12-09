import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void passwordIsValid() {
        assertFalse(PasswordChecker.passwordIsValid("Umuzorg#09"));
    }

    @Test
    void passwordIsOk() {
        assertFalse(PasswordChecker.passwordIsOk("Umusdffwe"));
    }
}