import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTranslatorTest {



    @Test
    public void RomanToIntTest(){
        RomanToIntTranslator romanToInt = new RomanToIntTranslator();
        int result = romanToInt.romanToInt("xix");
        Assertions.assertEquals(19,result);
    }

    @Test
    public void RomanValueTest(){
        RomanToIntTranslator romanToInt = new RomanToIntTranslator();
        int result = romanToInt.romanValue("x");
        Assertions.assertEquals(10,result);
    }

}
