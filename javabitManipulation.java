//Bitwise Operators
/*import java.util.*;
public class javabitManipulation{
    public static void main(String args[]){
        //Binary AND - &
        System.out.println((5 & 6));
        //Binary OR - |
        System.out.println((5 | 6));
        //Binary XOR - ^
        System.out.println((5 ^ 6));
        //Binary One's Compliment - ~
        System.out.println((~5));
        //Binary Left Shift - <<
        System.out.println((5 << 2));
        //Binary Right Shift - >>
        System.out.println((6 >> 1));
    }
}*/

//Question-1: Check if Odd or Even
/*import java.util.*;
public class javabitManipulation{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }
}*/

//Get ith Bit
/*import java.util.*;
public class javabitManipulation{
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10, 2));
    }
}*/

//Set ith Bit
/*import java.util.*;
public class javabitManipulation{
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.println(setIthBit(10, 2));
    }
}*/

//CLear ith Bit
/*import java.util.*;
public class javabitManipulation{
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearIthBit(10, 1));
    }
}*/

//Update ith Bit
/*import java.util.*;
public class javabitManipulation{
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
        //Interview perspective
        // n = clearIthBit(n, i);
        // int BitMask = newBit<<i;
        // return n | BitMask;
    }
    public static void main(String args[]){
        System.out.println(updateIthBit(10, 2, 1));
    }
}*/

//Clear Last i bits
/*import java.util.*;
public class javabitManipulation{
    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearIBits(15, 2));
    }
}*/

//Clear range of bits
/*import java.util.*;
public class javabitManipulation{
    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearBitsinRange(10, 2, 4));
    }
}*/

//Question-2: Check if a number is a Power of 2 or not
/*import java.util.*;
public class javabitManipulation{
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(isPowerOfTwo(8));
    }
}*/

//Quetsion-3: Count Set Bits in a Number
/*import java.util.*;
public class javabitManipulation{
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){   //Check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countSetBits(10));
    }
}*/

//Fast Exponentiation
/*import java.util.*;
public class javabitManipulation{
    public static int fastExponentiation(int a, int n){
        int ans =1;
        while(n > 0){
            if((n & 1) != 0){    //Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(fastExponentiation(3,5));
    }
}*/

//Assignent
//Question-1: What is the value of x^x for any value of x
/*import java.util.*;
public class javabitManipulation{
    public static int xOr(int x){
        return x ^ x;                  //Use XOR operator
    }
    public static void main(String args[]){
        System.out.println(xOr(3));
    }
}*/

//Question-2: Swap two numbers without using third variable
/*import java.util.*;
public class javabitManipulation{
    public static void main(String args[]){
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        //swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }
}*/

//Question-3: Add 1 to an integer using Bit Manipulation
/*import java.util.*;
public class javabitManipulation{
    public static void main(String args[]){
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
}*/

//Question-4: Convert uppercase characters to lowercase using bits
import java.util.*;
public class javabitManipulation{
    public static void main(String args[]){
        //Convert uppercase character to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println((char)(ch | ' '));
            //prints abcdefghijklmnopqrstuvwxyz
        }
    }
}

