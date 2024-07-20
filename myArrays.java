import java.util.*;

public class myArrays {

    // adding multiples of a number in an array 
    public static void addMultiples(int nums[], int x){
        int n=nums.length;

        for (int i=0;i<n;i++){
            nums[i]=(i+1)*x;
        }
    }

    // adding a number to each element of an array
    public static void addNumber(int nums[], int x){
        int n=nums.length;

        for (int i=0;i<n;i++){
            nums[i]+=x;
        }
    }

    // grace average marks 
    public static float avgMarksAfterGrace(){
        Scanner sc=new Scanner(System.in);

        int marks[]=new int[3];

        System.out.print("enter Eng marks :");
        marks[0]=sc.nextInt();

        System.out.print("enter Hindi marks :");
        marks[1]=sc.nextInt(); 
        // giving extra 5 marks
        if (marks[1]>95){
            marks[1]=100;
        } else{
            marks[1]+=5;
        }

        System.out.print("enter Maths marks :");
        marks[2]=sc.nextInt();

        sc.close();

        // sum of all elemets
        int sum=0;
        int n=marks.length;

        for (int i=0;i<n;i++){
            sum+=marks[i];
        }

        return (float) sum/n;
    }

    // largest element in  array
    public static int maxElement(int nums[]){
        int n=nums.length;

        int largest=nums[0];

        for (int i=0;i<n;i++){
            if (nums[i]>largest){
                largest=nums[i];
            }
        }

        return largest;
    }

    // linear search in an array
    public static int ArrayIndexOf(int nums[], int x){
        int n=nums.length;

        for (int i=0;i<n;i++){
            if (nums[i]==x){
                return i;
            }
        }

        return -1;
    }

    // binary search
    public static int binarySearch(int nums[], int x){
        int n=nums.length;

        int start=0; int end=n-1;

        while (start<=end) {
            int mid=(start+end)/2;
            int midVal=nums[mid];

            if (x==midVal){
                return mid;
            } else if (x>midVal){ // go right
                start=mid+1;
            } else{ // go left
                end=mid-1;
            }

        }

        return -1;
    }

    // reverse an array
    public static void reverseArray(int nums[]){
        int n=nums.length;

        for (int i=0;i<n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
    }

    // pairs in an array 
    public static void pairsInArray(int nums[]){
        int n=nums.length;

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }
    }

    // continuous subarray 
    public static void subarray(int nums[]){
        int n=nums.length;

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(nums[k] +", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // sum of each subarray  
    public static void subarrayWithSum(int nums[]){
        int n=nums.length;

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=nums[k];
                    System.out.print(nums[k] +", ");
                }
                System.out.println("Sum is "+sum);
            }
            System.out.println();
        }
    }

    // max subarray sum   
    public static int maxSubarraySum(int nums[]){
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=nums[k];
                    if (sum>maxSum){ maxSum=sum; }
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        System.out.println("Welcome");

        int scores[]=new int [20]; // blank int array

        /*arrays are call by reference */

        int marks[]={2,4,6,8,10};
        
    }
}