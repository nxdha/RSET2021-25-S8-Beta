// SimpleCode7: Sum of Digits
import java.util.Scanner;

public class SimpleCode7 {
public static int sumOfDigits(int num) {
int sum = 0;
while (num > 0) {
sum += num % 10;
num /= 10;
}
return sum;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
System.out.println("Sum of digits: " + sumOfDigits(num));
scanner.close();
}
}