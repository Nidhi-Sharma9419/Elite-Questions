package ch4.lambda;
//If we want to test operation we need another class
public class OperationDemo {
    public static void main(String[] args) {
//        Addition addition = new Addition();
//        float result = addition.execute(2,5);
//        System.out.println("Result is "+ result);
        //using lambda addition class is no longer needed, and the instantiation and the
        //method call can be replaced with
        Operation addition2 = (a, b) -> a+b;
        float result2= addition2.execute(2,5);
        System.out.println("Lambda Result is " + result2);
    }
}
