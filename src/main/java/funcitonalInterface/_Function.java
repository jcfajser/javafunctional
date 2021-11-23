package funcitonalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
*
* Function takes 1 argument and produces 1 result
* BiFunction takes 2 arguments and produces 1 result
*
*/
public class _Function {
    
    public static void main(String[] args) {
        //execute declarative function
        int increment = incrementByOne(1);
        System.out.println(increment);
    
        //execute imperatives function
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        
        int multiply =  multiplyBy10Function.apply(increment2);
        System.out.println(multiply);
    
        // joining multiples functions
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));
        
        
        //BiFunction
        System.out.println(incrementByOneAndMultiply(4, 100));
    
        System.out.println(incrementByOneAndMultiplyFunction.apply(4, 100));
    
    }
    
    //functions declarative approach
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;
    
    static  Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;
    
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    
    // function imperative approach
    static int incrementByOne(int number){
        return number + 1;
    }
    
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
