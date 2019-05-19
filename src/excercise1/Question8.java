package excercise1;


//****************************To print  numbers in left triangle shape***********************************


public class Question8 {


        static void printTriangle(int n) {


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }

        public static void main(String[] args) {

        printTriangle(5);
    }
}
