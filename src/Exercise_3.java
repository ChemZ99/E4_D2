import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        String text1 = "";
        Scanner input = new Scanner(System.in);
        while (!(text1.equals(":q"))) {
            System.out.println("dammi in pasto una stringa");
            text1 = input.nextLine();
            splitString(text1);
        }
        input.close();
    }
    public static void splitString (String t1) {
        for (int i=0; i<t1.length(); i++) {
            System.out.println(t1.charAt(i) + ",");
        }
    }
}
