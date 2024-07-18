import java.util.*;

public class myBasics {

    // leap year
    public static boolean leapYear(int x){
        if (x%100==0){
            if (x%400==0){
                return true;
            } else{
                return false;
            }
        } else{
            if (x%4==0){
                return true;
            } else{
                return false;
            }
        }
    }

    // table of a number
    public static void tableOf(int x){
        for (int i=1;i<=10;i++){
            System.out.println(i*x);
        }
    }

    // factorial of a number
    public static int factorialOf(int x){

        if (x==0){return 1;}

        int product=1;

        for (int i=1;i<=x;i++){
            product*=i;
        }

        return product;
    }

    // star pattern
    public static void starPattern(int x){
        for (int i=1;i<=x;i++){
            System.out.println(" * ".repeat(i));
        }
    }

    // square pattern
    public static void squarePattern(int x){
        for (int i=1;i<=x;i++){
            System.out.println(" * ".repeat(x));
        }
    }

    // pyramid pattern 
    public static void pyramidPattern(int x){
        for(int i=1;i<=x;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // tax calculator 
    public static float finalSalary(int x){

        float tax=0;

        if (x>=0 && x<=5000){
            tax=0;
        } else if (x>5000 && x<=10000){
            tax=(20/100F)*x;
        } else{
            tax=(30/100F)*x;
        }

        return x-tax;
    }

    // sum of first n numbers 
    public static int sumOfTerms(int x){
        int sum=0;

        for (int i=1;i<=x;i++){
            sum+=i;
        }

        return sum;
    }

    // sum of squares
    public static int sumOfSquares(int x){
        int sum=0;

        for (int i=1;i<=x;i++){
            sum+=i*i;
        }

        return sum;
    }

    // checking prime number
    public static boolean isPrime(int x){
        if (x==2){return true;}

        for (int i=2;i<=Math.sqrt(x);i++){
            if (x%i==0){
                return false;
            }
        }

        return true;
    }

    // first n prime numbers
    public static void firstNprimes(int x){
        int sum=0;

        for (int i=1;i<=x;i++){
            if (isPrime(i)){
                System.out.println(i);
                sum+=i;
            }
        }

        System.out.println("sum is "+sum);
    }

    // sum of digits of a number
    public static int sumOfDigits(int x){
        int sum=0;

        while (x>0) {
            int LD=x%10;
            sum+=LD;
            x/=10;
        }

        return sum;
    }

    // reverse a number
    public static int reverseNumber(int x){
        int ans=0;

        while (x>0) {
            int LD=x%10;
            ans=(ans*10)+LD;
            x/=10;
        }

        return ans;
    }

    // binary to decimal
    public static int B2D(int x){
        int ans=0;
        int n=0;

        while (x>0) {
            int LD=x%10;
            ans+=(LD)*( (int)(Math.pow(2, n)) );
            n++;
            x/=10;
        }

        return ans;
    }

    // decimal to binary 
    public static int D2B(int x){
        int ans=0;
        int n=0;

        while (x>0) {
            int R=x%2;
            ans+=(R)*( (int) (Math.pow(10, n)) );
            n++;
            x/=2;
        }

        return ans;
    }

    // sum of odd and even numbers entered
    public static void oddEvenSum(){
        Scanner sc=new Scanner(System.in);

        int oddSum=0;
        int evenSum=0;
        int a;

        do {
            System.out.print("Enter any number, press 0 to exit :");
            a=sc.nextInt();
            if (a%2==0){
                evenSum+=a;
            } else{
                oddSum+=a;
            }
        } while(a!=0);

        sc.close();

        System.out.println("odd numbers sum is "+oddSum);
        System.out.println("even numbers sum is "+evenSum);
    }

    // arithmetic progression
    public static void AP(int a, int d, int n){ 
        int sum=0;

        for (int i=1;i<=n;i++){
            System.out.println(a);
            sum+=a;
            a+=d;
        }

        System.out.println("sum is "+sum);
    }

    // geometric progression 
    public static void GP(float a, float r, int n){
        float sum=0;

        for (int i=1;i<=n;i++){
            System.out.println(a);
            sum+=a;
            a*=r;
        }

        System.out.println("sum is "+sum);
    }

    // guess the random number
    public static void guessGame(){
        Scanner sc=new Scanner(System.in);

        int x=(int) (Math.random()*101);
        int a=-1;
        int count=0;

        do {
            System.out.print("Guess the Number :");
            a=sc.nextInt();
            count++;
            if (a>x){
                System.out.println("No, think smaller than "+a);
            } else if (a<x){
                System.out.println("No, think greater than "+a);
            } else{
                System.out.println("Yes, it was "+a);
                System.out.println("You took "+ count + " turns");
            }
        } while (a!=x);
        
        sc.close();
    }

    // fibonachi series
    public static void fibonachiSeries(int n){
        int a=0;
        int b=1;

        for (int i=1;i<=n;i++){
            System.out.println(a);
            int nextTerm=a+b;
            a=b;
            b=nextTerm;
        }
    }

    // fibonachi number 
    public static int fibonachiNumber(int n){
        int a=0;
        int b=1;

        for (int i=1;i<=n;i++){
            int nextTerm=a+b;
            a=b;
            b=nextTerm;
        }

        return a;
    }

    public static void main(String[] args) {

        System.out.println("Welcome");

    }
}