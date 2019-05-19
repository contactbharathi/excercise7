package excercise1;



//****************************To print prime  numbers between 1 to 100************************************


public class Question5 {


static void primeNumbers(int n){

    System.out.print(" Print prime Numbers ==>" );

        for (int i = 2; i < n; i++) {

        boolean prime = true;

        for (int j = 2; j * j <= i; j++) {

            if (i % j == 0) {

                prime = false;

                break;
            }
        }//inner for

        if (prime)

            System.out.print( i + "  ");

    }//outer for
}

    public static void main(String[] args) {


        int n = 100;

        primeNumbers(n);
    }

}
