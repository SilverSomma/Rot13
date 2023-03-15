import org.example.Rot13;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rot13Test {
    Rot13 rot13 = new Rot13();
    String random = generateRandomString(50);

    private String generateRandomString(int stringLength) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            stringBuilder.append((char) random.nextInt(32, 127));
        }
        return stringBuilder.toString();
    }

    @ParameterizedTest
    @CsvSource({
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz, NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm",
            "Guvf    grfg  ---- vffFF n YVGGYR ovvggg PEENNNNNMM   LLLLLLLLLLLllll!!!! VF vg jbEXVVVat?????????, This    test  ---- issSS a LITTLE biittt CRRAAAAAZZ   YYYYYYYYYYYyyyy!!!! IS it woRKIIIng?????????",
            "TerE!, GreR!"
    })
    void Rot13(String input, String expected) {
        assertEquals(expected, rot13.rot13(input));
        assertEquals(random, rot13.rot13(rot13.rot13(random)));
    }
}