public class Exercise_1 {
    public static void main(String[] args) {
        String text1 = "wololo";
        oddOrEven(text1);
        int year1 = 2020;
        checkYear(year1);
    }
    public static void oddOrEven (String t1) {
        if ((t1.length() % 2) == 0) {
            System.out.println("la stringa ha lunghezza pari");
        } else {
            System.out.println("la stringa ha lunghezza dispari");
        }
    }
    public static void checkYear (int y1) {
        if ((y1 % 400 == 0) || (y1 % 4 == 0 && y1 % 100 != 0)) {
            System.out.println("l' anno e' bisestile");
        } else {
            System.out.println("l' anno non e' bisestile");
        }
    }
}
