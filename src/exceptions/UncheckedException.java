package exceptions;

public class UncheckedException {
    public static void main(String args[])
    {
        int num1=10;
        int num2=0;
        /*Since I'm dividing an integer with 0
         * it should throw ArithmeticException
         */
        int res=num1/num2;
        System.out.println(res);

        //---------------------------------------------

        int arr[] ={1,2,3,4,5};
        /* My array has only 5 elements but we are trying to
         * display the value of 8th element. It should throw
         * ArrayIndexOutOfBoundsException
         */
        System.out.println(arr[7]);

        //----------------------------------------------

        try{
            int arr1[] ={1,2,3,4,5};
            System.out.println(arr1[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The specified index does not exist " +
                    "in array. Please correct the error.");
        } finally {
            System.out.println("Burasi her zaman calisir");
        }

        //-------------------------------------------------



    }
}
