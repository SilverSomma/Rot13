import org.example.Rot13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rot13Test {
    Rot13 rot13 = new Rot13();

    @Test
    void Rot13() {
        String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String encrypted = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
        assertEquals(encrypted, rot13.encrypt(original));
    }
}
