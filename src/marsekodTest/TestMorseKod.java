package marsekodTest;
import org.junit.Assert;
import org.example.MorsekodConverter;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestMorseKod {

    @Test
   public void ErrorHantering(){
        String result = MorsekodConverter.toMorseCode("");
        String expected = "";
        Assert.assertEquals(expected, result);
    }


    @Test
    public void shouldTranslateMorseToEnglish() {
        String result = MorsekodConverter.translateToEng("*--");
        String expected = "W";
        Assert.assertEquals(expected,result);
    }

    public void shouldNotTranslateMorseToEnglish() {
        String result = MorsekodConverter.translateToEng("*--");
        String expected = "W";
        Assert.assertNotEquals(expected,result);
    }




    @Test
    public void shouldNotTranslateEnglishToMorse() {
        String result = MorsekodConverter.translateToMorse('a');
        String expected = "*--";
        Assert.assertNotEquals(expected, result);
    }

    @Test
    public void shouldTranslateEnglishToMorse() {
        String result = MorsekodConverter.translateToMorse('a');
        String expected = "*-";
        Assert.assertNotEquals(expected, result);
    }


    @Test
public void translateToMorse_LongString_ReturnsValidMorse() {
    // Arrange
    // Act
    String result = MorsekodConverter.toMorseCode("HAVE NICE DAY");
    String expected = "**** *- ***- * ; -* ** -*-* * ; -** *- -*--";
    Assert.assertEquals(expected, result);
    // Assert
}



}
