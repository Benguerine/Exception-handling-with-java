package exception;

public class Try_catch_block {
    public static void main(String[] args) {

        try
        {
            int[] arr = new int[]{1,2,3};
            //System.out.println(arr[5]);// Type of Exception :  Exception ArrayIndexOutOfBoundsException
            System.out.println("Message in try block");
            System.out.println(arr[5]);
        }catch(Exception e)
        {   // we Define object e from class exception " we use it if we do not no the  type of Exception
            System.out.println(e);//Output ---> java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
            System.out.println("Message in catch");
        }
        System.out.println("Message 1"); // java Print them if there Try and Catch
        System.out.println("Message 1"); // Let's Supposed there are not try or catch So the  " Message 1 " do not print
        System.out.println("Message 1");

        try
        {
            int[] arr = null;
            System.out.println(arr[5]); // Type of exception :  java.lang.NullPointerException:
        }catch(Exception e)
        {
            System.out.println(e); // Output ---> java.lang.NullPointerException: Cannot load from int array because "arr" is null
        }

        try
        {
            int val = Integer.parseInt("String66");
            System.out.println(val); // Type of Exception : java.lang.NumberFormatException
        }catch(Exception e)
        {
            System.out.println(e); // Output ---> java.lang.NumberFormatException: For input string: "String66"
        }

        try
        {
            int x = 2/0 ;
            System.out.println(x); // Type of Exception : java.lang.ArithmeticException
        }catch(Exception e)
        {
            System.out.println(e); //Output ---> java.lang.ArithmeticException: / by zero
        }
        try
        {
            int [] arry = new int[5];
            arry[6] = 10/0;    // priority is divided by Zero
            System.out.println(arry[3]);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}
