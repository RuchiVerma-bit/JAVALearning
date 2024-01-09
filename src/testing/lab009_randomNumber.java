package src.testing;

public class lab009_randomNumber {

    public static void printRandomExample1(){
        //using ranom method()
        System.out.println("1st random number: "+Math.random());
        System.out.println("2nd random number: "+Math.random());

    }
    public static void printRandomExample2(){
        //find out random number between 200 and 400
        int max=400;
        int min=200;
        System.out.println("random value between "+min+" and "+max);
        double a= Math.random()*(max-min+1)+min;
        System.out.println(a);

        //OR//

        int b= (int) (Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
    public static void main(String[] args) {
        printRandomExample1();      //Method 1: using random method()
        printRandomExample2();     //Method 2: using random class()


    }
}
