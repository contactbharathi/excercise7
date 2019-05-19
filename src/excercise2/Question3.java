package excercise2;

//******************************Write a programme to get the average of all 6 numbers




public class Question3 {

    static int integerArray[]= { 23, 6, 47, 35, 2, 14 };

    static void  printAndAverage(){

        int count=0;

        System.out.println("Prrnting the Array values from Index [0-9} ");

        for (int item : integerArray) {

            count = count +item;
            System.out.println(item);

        }
        System.out.println("The avarege of the numbers is  =>" +  count/6);
    }
    static void findGreatestNumber(){

        int greatest = 0;

        for (int i=0;i<=5;i++ ){

            if (integerArray[i] > greatest)
                greatest = integerArray[i];
            else
                greatest  =  greatest;

        }
        System.out.println("The Greatest of the numbers is  =>" +  greatest);


    }


    public static void main(String[] args) {

        // array();
        printAndAverage();
        findGreatestNumber();

    }
}
