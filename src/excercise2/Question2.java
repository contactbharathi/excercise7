package excercise2;


//************************an array of 6 values and store in this order: 23, 6, 47, 35, 2, 14. *************

public class Question2 {

    static int integerArray[]= { 23, 6, 47, 35, 2, 14 };


    static void  print(){

        System.out.println("Prrnting the Array values from Index [0-9} ");

        for (int item : integerArray) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {

       // array();
        print();

    }

}
