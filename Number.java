import java.util.*;
public class Number{
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter Minimum Number: ");
        int min = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter Maximum Number: ");
        int max = num2.nextInt();
        int count;

        for(int i=min; i<=max; i++){
            count = 0;
            for( int j=2; j<=i; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count<=2){
                System.out.println(i);
            }
        }
    }
}