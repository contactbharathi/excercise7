package excercise1;



//****************************To print numbers divided by 5 between 1 to 100 ***********************************


public class Question6 {

    static void divideBy5(int n) {

        System.out.print(" Numbers divided by 5  is/are ====>");

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0)
                System.out.print(i + "  ");


        }
    }


    public static void main(String[] args) {

        divideBy5(21);
    }
}
