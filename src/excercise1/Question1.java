package excercise1;

 //****************************To Find the factorial of given number*********************

public class Question1 {


    static void factorial(int n) {

        int fact = 1;


        for (int i= 1; i <= n; i++)
            fact = fact * i;

        System.out.print("factorial of the given no is ==>" + fact);
    }

    public static void main(String[] args) {


        int n = 5;



        factorial(n);
    }
  }