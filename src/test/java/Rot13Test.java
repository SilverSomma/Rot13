import org.example.Rot13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rot13Test {
    Rot13 rot13 = new Rot13();

    @Test
    void Rot13() {
        String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String encrypted = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
        assertEquals(encrypted, rot13.rot13(original));

        assertEquals("Guvf    grfg  ---- vffFF n YVGGYR ovvggg PEENNNNNMM   LLLLLLLLLLLllll!!!! VF vg jbEXVVVat?????????",
                rot13.rot13("This    test  ---- issSS a LITTLE biittt CRRAAAAAZZ   YYYYYYYYYYYyyyy!!!! IS it woRKIIIng?????????"));

        assertEquals("GreR!", rot13.rot13("TerE!"));
        assertEquals("TerE!", rot13.rot13("GreR!"));
    }

}
