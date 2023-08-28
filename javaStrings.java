/*public class javaStrings{
    public static void main(String args[]){
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE
    }
}*/

//Input/Output
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();          //Sirf ek word print he
        name = sc.nextLine();       //Puri line print karta he
        System.out.println(name);
    }
}*/

//String Length
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String fullName = "Tony Stark";
        System.out.println(fullName.length());
    }
}*/

//String concatenate
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        //concatenation
        String firstName = "Amisha";
        String lastName = "Mulani";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}*/

//String charAt Method
/*import java.util.*;
public class javaStrings{
    public static void printLetters(String str){     ////to print all the letters in string
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }       
    public static void main(String args[]){
        String firstName = "Amisha";
        String lastName = "Mulani";
        String fullName = firstName + " " + lastName;
        //System.out.println(fullName.charAt(1));   //to print a single character form the string
        printLetters(fullName);    //to print every character form the string
    }
}*/

//Question-1: Check if a string is Palindrome
/*import java.util.*;
public class javaStrings{
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}*/

//Question-2: Shortest path
/*import java.util.*;
public class javaStrings{
    public static float getShortestPath(String path){
        int x = 0, y = 0 ;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    } 
}*/

//String Functions - compare
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1 == s3){
            System.out.println("Strings aer equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not eqaul");
        }
    }
}*/

//String Functions - substring
/*import java.util.*;
public class javaStrings{
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        //substring
        String str = "HelloWWorld";
        System.out.println(str.substring(0, 5));    //already a function exists
        //System.out.println(subString(str, 0, 5));
    }
}*/

//Question-3: Print Largest String
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}*/

//StringBuilder
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }  //abcdefghijklmnop
        System.out.println(sb);
        System.out.println(sb.length());
    }
}*/

//Question-4: Convert Letters to UpperCase
/*import java.util.*;
public class javaStrings{
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "hi , i am amisha";
        System.out.println(toUpperCase(str));
    }
}*/

//Question-5: String Compression
/*import java.util.*;
public class javaStrings{
    public static String compress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}*/

//Assignment
//Qno-1: Count lowercase vowels occured in a String entered by the user
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("count of vowels  is: " + count);
    }
}*/

//Qno-2: Equal or not
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String str = "AmishaMulani";
        String str1 = "ApnaCollege";
        String str2 = "AmishaMulani";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}*/

//Qno-3: Replace 'l'
/*import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
    }
}*/

//Qno-4: Determine if 2 Strings are anagrams of each other
import java.util.*;
public class javaStrings{
    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "heart";

        //Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //First check - if the lengths are the same
        if(str1.length() == str2.length()){
            //convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            //case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}



