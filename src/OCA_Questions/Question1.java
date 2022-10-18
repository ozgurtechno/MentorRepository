package OCA_Questions;

public class Question1 {

        // because int i is not static in the question...There will be an Compile Error...
        private static int i = 1;
        public static void main(String argv[]){
            i = 2;
            Question1 s = new Question1 ();
            s.someMethod();
        }
        public static void someMethod(){
            System.out.println(i);
        }
}
