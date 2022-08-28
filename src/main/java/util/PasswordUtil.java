package util;

public class PasswordUtil {

    public enum SecurityLeve{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLeve password (String password){


        if (password.length() < 8 || password.matches("[a-zA-Z]+")) return SecurityLeve.WEAK;

        if (password.matches("[a-zA-Z0-9]+")) return SecurityLeve.MEDIUM;

        return SecurityLeve.STRONG;

}
}
