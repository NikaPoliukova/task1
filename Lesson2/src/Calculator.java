public class Calculator {

    public static void main(String[] args) {
        addition();
        showName();
        divide();
        divideTwo();
        multiply();
        multiplyTwo();
        subtraction();
    }

    public static void addition() {
        int oneNumber = 5;
        int secondNumber = 2;
        int sum = oneNumber + secondNumber;
        System.out.println("Result = " + sum);
    }
    public static void showName(){
        String name = "Calculator № 3";
        System.out.println("My name is " + name);
    }
    public static void divide(){
        double firstNumber = 2.3;
        double secondNumber = 1.5;
        double result = firstNumber/secondNumber;
        System.out.println( " Result = " + ++result);
    }
    public static void divideTwo(){
        float one = 125648412.36f;
        float two = 14521215.14f;
        float result = one%two;
        System.out.println( " Result = " + result);
    }
    public static void multiply(){
        byte one = 2;
        byte second = 3;
        byte result = (byte) (one * second);
        System.out.println( " Result = " + result);
    }
    public  static  void multiplyTwo (){
        short one = 129;
        short second = 256;
        int result = one* second;
        System.out.println( " Result = " + result);
    }
    public  static  void subtraction(){
        Integer one= 121541;
        Double second = 1125.45;
        double result = one-second;
        System.out.println( " Result = " + result);
    }


}


