package excercise1;

//****************************To print odd numbers between 1 to 100************************************
///1,3,5...................n
//firstNumber  is  2
//difference  diff  is 2

public class Question4 {
    static void  sumOfOddNumbers(int n) {


        int  sum=0;


        int firstNumber= 1;
        int diff = 1;

        sum =n*(firstNumber*2+((n-1))*diff)/2;


        System.out.print(" Sum of the First n Odd Numbers is ==>" + sum);
    }

    public static void main(String[] args) {


        int n = 100;

        sumOfOddNumbers(n);
    }
}
