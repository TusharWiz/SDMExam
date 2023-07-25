import java.util.Scanner;
//command to run docker image which contain program which take input form user?
public class Factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int fact = 1;
        if(num>0){
            for(int i=1 ;i<=num ;i++){
                fact = fact * i;
            }
        }else{
            System.out.println("Enter the valid number");
        }

        System.out.println("Factorial of number"+num+" = "+fact);
        }
    }
}
