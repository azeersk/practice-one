import java.util.function.BiFunction;

class problemSolving{
    public int addition(int a, int b){
        int sum = a + b;
        return sum;
    }

}

public class practiceClass {
    public static void main(String[] args){
        BiFunction<Integer, Integer, Integer> adder = new problemSolving()::addition;
        int result = adder.apply(10,20);
        System.out.println("Sum of the given two numbers: "+ result);
    }
}
