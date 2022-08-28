package util;

 import org.junit.jupiter.api.Test;

 import static org.junit.Assert.assertEquals;
 import static util.PasswordUtil.SecurityLeve.*;

class PasswordUtilTest {


@Test
    public void passport_debil(){
     assertEquals(WEAK, PasswordUtil.password("1234567"));

}
    @Test
    public void solo_letras(){
        assertEquals(WEAK, PasswordUtil.password("abcdefgh"));

    }
    @Test
    public void medio_letras_numeros(){
        assertEquals(MEDIUM, PasswordUtil.password("abcd1234")   );
    }
    @Test
    public void fuerte_letras_numeros_simbolos(){
        assertEquals(STRONG, PasswordUtil.password("abcd1234!*"));
    }


}