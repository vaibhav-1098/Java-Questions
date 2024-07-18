import java.util.*;

public class myStrings {

    // Palindrome or Not
    public static boolean checkPalindrome(String Name){
        int n=Name.length();
        Name=Name.toUpperCase();

        for (int i=0;i<n;i++){
            char first=Name.charAt(i);
            char last =Name.charAt(n-1-i);

            if (first!=last){
                return false;
            }
        }

        return true;
    }

    // Shortest Path NEWS
    public static float shortestPath(String Path){
        Path=Path.toUpperCase();
        int n=Path.length();

        int x=0;
        int y=0;

        for (int i=0;i<n;i++){
            switch (Path.charAt(i)) {
                case 'N':
                    x++; break;
                case 'S':
                    x--; break;
                case 'E':
                    y++; break;
                case 'W':
                    y--; break;
                default:
                    break;
            }
        }

        int sqX=x*x;
        int sqY=y*y;

        return (float) Math.sqrt(sqX+sqY);
    }

    // Number of Vowels
    public static int countVowels(String Name){
        int n=Name.length();
        Name=Name.toUpperCase();
        int count=0;

        for (int i=0;i<n;i++){
            char curr=Name.charAt(i);

            if (curr=='A' || curr=='E' || curr=='I' || curr=='O' || curr=='U'){
                count++;
            }
        }

        return count;
    }

    // Anagram or Not
    public static boolean checkAnagram(String Name1, String Name2){
        Name1=Name1.toUpperCase();
        Name2=Name2.toUpperCase();

        char N1[]=Name1.toCharArray();
        char N2[]=Name2.toCharArray();

        Arrays.sort(N1);
        Arrays.sort(N2);

        return Arrays.equals(N1, N2);
    }

    // first word in dictionary
    public static String firstWordAlphabetically(String Names[]){
        int n=Names.length;

        String smallest=Names[0];

        for (int i=0;i<n;i++){
            if (Names[i].compareToIgnoreCase(smallest)<0){
                smallest=Names[i];
            }
        }

        return smallest;
    }

    // add A-Z at end of a Name
    public static String addAlphabets(String Name){
        int n=Name.length();
        StringBuilder NewName=new StringBuilder(Name);

        for (char i='a';i<='z';i++){
            NewName.append(i);
        }

        return NewName.toString();
    }

    // remove vowels
    public static String removeVowels(String Name){
        int n=Name.length();
        Name=Name.toLowerCase();

        StringBuilder NewName=new StringBuilder("");

        for (int i=0;i<n;i++){
            char curr=Name.charAt(i);

            if (curr!='a' && curr!='e' && curr!='i' && curr!='o' && curr!='u'){
                NewName.append(curr);
            }
        }

        return NewName.toString();
    }

    // capitalise first letter of all words
    public static String capitaliseFirstLetter(String Name){
        int n=Name.length();
        
        StringBuilder NewName=new StringBuilder("");
        NewName.append(Character.toUpperCase(Name.charAt(0)));

        for (int i=1;i<n;i++){
            char curr=Name.charAt(i);

            if (Name.charAt(i)==' '){
                NewName.append(curr);
                i++;
                NewName.append(Character.toUpperCase(Name.charAt(i)));
            } else{
                NewName.append(curr);
            }

        }

        return NewName.toString();
    }

    // string compression
    public static String compressString(String Name){
        int n=Name.length();
        
        StringBuilder NewName=new StringBuilder(Name.charAt(0));
        NewName.append(Name.charAt(0));

        for (int i=1;i<n;i++){
            char curr=Name.charAt(i);
            char prev=Name.charAt(i-1);

            if (curr!=prev){
                NewName.append(curr);
            }

        }

        return NewName.toString();
    }

    // string compression with count
    public static String compressStringWithCount(String Name){
        int n=Name.length();
        int count=1;
        
        StringBuilder NewName=new StringBuilder(Name.charAt(0));
        NewName.append(Name.charAt(0));

        for (int i=1;i<n;i++){
            char curr=Name.charAt(i);
            char prev=Name.charAt(i-1);

            if (curr==prev){
                count++;
            } else{
                if (count>1){
                    NewName.append(count);
                    count=1;
                }
                NewName.append(curr);
            }
        }

        if (count>1){NewName.append(count);}

        return NewName.toString();
    }


    public static void main(String[] args) {

        System.out.println("Welcome");

        /*
        indexOf
        lastIndexOf
        charAt
        contains

        compareTo
        equals

        replace
        substring
         */

    }
}