package util;


class StringUtilTest {

    public static void main(String[] args) {
        String resultado = StringUtil.repeat("Hola",3);

        if(!resultado.equals("HolaHolaHola")){
            throw new RuntimeException("ERROR");
         }
    }
}