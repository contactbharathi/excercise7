package excercise1;

//****************************To print even numbers between 1 to 100************************************


public class Question3 {
    static void  sumOfEvenNumbers(int n) {

        ///2,4,6...................n
        //firstNumber  is  2
        //difference  diff  is 2

        int  sum=0;


       int firstNumber= 2;
       int diff = 2;

       sum =n*(firstNumber*2+((n-1))*diff)/2;


        System.out.print(" Sum of the First n Even Numbers is ==>" + sum);
    }

    public static void main(String[] args) {


        int n = 100;

        sumOfEvenNumbers(n);
    }

}
