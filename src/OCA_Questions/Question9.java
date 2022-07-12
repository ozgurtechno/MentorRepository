package OCA_Questions;

public class Question9 {

    public static void main(String args[]) {
        int num = 0;

        switch (num) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("case1");
            case 10 * 2 - 19: // same case number is can not be used 10*2-20 == 0
                System.out.println("case2");
                break;
        }
    }
}
