import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        int num1 = 0;
        Scanner input = new Scanner(System.in);

            System.out.println("dammi un numero");
            num1 = Integer.parseInt(input.nextLine());
            reverseCounter(num1);
            input.close();
    }
    public static void reverseCounter (int n1) {
        for (int i = n1; i != 0; i --) {
            System.out.println(i);
        }
        System.out.println("zero");
    }
}
