import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int reversed = 0;

        System.out.println("Original Number: " + num);


        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;


            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
