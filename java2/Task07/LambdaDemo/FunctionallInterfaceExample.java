package ADF2.Task07.LambdaDemo;

public class FunctionallInterfaceExample {
    /**
     * Example of how to use functional interface
     */
    public  void  caculateSquare(){
        System.out.println("Caculate Square , Functional Interface !!!");
        int a = 10;
        // lambda expression to define the caculaate method
        Square s = (int x)-> x *x;
        //parameter passed and return type must be
        // same as defined in  the prototype
        int  result = s.caculate(a);
        System.out.println(result);
    }
}
@FunctionalInterface
interface   Square{
    int caculate(int x);
}
