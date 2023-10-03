public class Exercise_2 {
    public static void main(String[] args) {
        int num1 = 2;
        returnString(num1);
    }
    public static void returnString (int n1) {
        switch (n1) {
            case 0: {
                System.out.println("zero");
            } break;
            case 1: {
                System.out.println("uno");
            } break;
            case 2: {
                System.out.println("due");
            } break;
            case 3: {
                System.out.println("tre");
            } break;
            default: {
                System.out.println("error");
            }
        }
    }
}
