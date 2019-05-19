package excercise1;

//****************************To print numbers divided by 5 between 1 to 100***********************************



public class Question7 {

    static void printTriangle(int n) {


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
        System.out.println();
        }

    }

    public static void main(String[] args) {

        printTriangle(5);
    }
}