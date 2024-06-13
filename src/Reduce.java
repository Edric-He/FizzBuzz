import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        while(num != 0){
            System.out.println("Current num: " + num);
            if(num % 2 == 0){
                num = num / 2;
            }
            else
            {
                num -= 1;
            }
        }
        System.out.println("Final num: " + num);
    }
}

