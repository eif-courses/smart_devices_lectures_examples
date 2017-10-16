public class FizzBuzz {
    String evaluate(int number) {
        if(isNumberOf3(number) && isNumberOf5(number)) return "FizzBuzz";
        else if(isNumberOf3(number)) return "Fizz";
        else if(isNumberOf5(number)) return "Buzz";
        return String.valueOf(number);
    }

    private boolean isNumberOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isNumberOf3(int number) {
        return number % 3 == 0;
    }
}
