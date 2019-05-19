package excercise2;


//*********************** An array of 10 values and write a program to find the sum of all the elements in the array****


public class Question5 {
    static int integerArray[]= { 23, 6, 47, 35, 2, 14,7,25,21,29};

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

        for (int i=0;i<=9;i++ ){

            if (integerArray[i] > greatest)
                greatest = integerArray[i];
            else
                greatest  =  greatest;

        }
        System.out.println("The Greatest of the numbers is  =>" +  greatest);


    }
    static void printOnlyOddNumbers() {

        for (int i = 0; i <= 9; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.print(integerArray[i] + " ");


            }
        }
    }
   static void sumOfAllNumbers(){

        int sum = 0;
        for (int i = 0; i <= 9; i++)

           sum = sum + integerArray[i];

        System.out.print("The sum of all the numbers in theArray is ===>>>" + sum);

    }

    public static void main(String[] args)
    {

        //  array();
        //  printAndAverage();
        //  findGreatestNumber();
        //  printOnlyOddNumbers();
        sumOfAllNumbers();

    }//main
}//class
