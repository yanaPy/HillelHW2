package arithmeticAverage;

public class ArithmeticAverage {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        System.out.println("Arithmetic average of two numbers: " + arithmeticAverageOfTwoNumbers(100, 200));
        System.out.println("Arithmetic average of arbitrary number of numbers: " + arithmeticAverageOfArbitraryNumberOfNumbers(numbers));

    }
    public static int arithmeticAverageOfTwoNumbers(int one, int two){
        int arithmeticAverage = (one + two) / 2;
        return arithmeticAverage;
    }

    public static int arithmeticAverageOfArbitraryNumberOfNumbers(int[] numbers){
        int sum = 0;
        int arithmeticAverage;
        for (int i = 0; i < numbers.length; i++) {
             sum+=numbers[i];
        }
        arithmeticAverage=sum/numbers.length;
        return arithmeticAverage;
    }


}
