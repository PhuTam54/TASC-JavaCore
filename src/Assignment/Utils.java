package Assignment;

public class Utils {
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isEmail(String str) {
        return str.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$");
    }

    public static boolean isPhoneNumber(String str) {
        return str.matches("^[0-9]{10,11}$");
    }

    public static boolean isName(String str) {
        return str.length() >= 2;
    }
}