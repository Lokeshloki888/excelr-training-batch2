public class demo017 {
    public static void main(String[] args) {
        int number = 99;
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
    }
}