import java.util.*;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a Perfect Number");
        }
        else{
            System.out.println(num + " is not a Perfect Number");
        }
    }
}
