package excercise2;


//******************Create an array of 10 String values and print using foreach loop***************

public class Question1 {

    static String str[]= { "Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};


    static void  print(){

        System.out.println("Prrnting the Array values from Index [0-9} ");
        for (String item : str) {
            System.out.println(item);


        }
    }


    public static void main(String[] args) {

        print();

    }

}
