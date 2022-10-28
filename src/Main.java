import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int nSum = 0, eSum = 0, oSum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        while(true) {
            int n = inp.nextInt();

            if(n == 0){
                break;
            }
            if(n < 0){
                nSum += n;
            }
            else if(n % 2 == 0) {
                eSum += n;
            }
            else{
                oSum += n;
            }
        }
        System.out.println("Sum of Negative Numbers is: " + nSum);
        System.out.println("Sum of Even Numbers is: " + eSum);
        System.out.println("Sum of Odd Numbers is: " + oSum);
    }
}