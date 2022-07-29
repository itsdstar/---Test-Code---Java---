import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JavaDevelopmentTestCode {
    public static void main(String[] args){
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");
//        "\n" is used for spacig betwin output lines
        System.out.println("Hellow World");
        System.out.print("\n");

//        variables

        String name = "Dipanjan";
        System.out.println(name);
        int age = 19;
        System.out.println(age);
        String classmate = "Kundan";
        System.out.println(classmate);
        String friend = classmate;
        System.out.println(friend);
        System.out.print("\n");

//        Variable types
//        Primitive type variable

//        byte - 1 - byte [-128 to 127]
//        short - 2 byte
//        int - 4 byte [1, 2, 3, 4, 5, 6,......]
//        long - 8 byte
//        float - 4 byte [3.14, 2.59, 64.23]
//        double - 8 byte
//        char - 2 byte [a, b, c, d, e, f.....]
//        boolean - 1 byte [true/false]
//        example

        byte people = 30;
        System.out.println(people);
        System.out.print("\n");
//        int phonenumber = 8159092898;
//        System.out.println(phonenumber);
//        it's not going to work
        long phonenumber = 8159092898L;
        System.out.println(phonenumber);
        System.out.print("\n");
        float py = 3.14F;
        System.out.println(py);
        System.out.print("\n");
        char charcter = '@';
        System.out.println(charcter);
        System.out.print("\n");
        boolean isAdult = true;
        System.out.println(isAdult);
        System.out.print("\n");

//        NonPrimitive type variable
//        String
        String MyName = new String("Dipanjan");
        String MyFriend = new String("Kundan");
        String MyLastName = new String("Mitra");
        System.out.print(MyName);
        System.out.print(" ");
        System.out.println(MyLastName);
        System.out.println(MyFriend);
        System.out.print("\n");
//        Used For length of the String
        System.out.println(MyName.length());
        System.out.println(MyFriend.length());
        System.out.println(MyLastName.length());
        System.out.print("\n");

//        concatenate
        String Name1 = "Dipanjan";
        String Name2 = "Kundan";
        String Name3 = Name1 + " and " + Name2;
        System.out.println(Name3);
        System.out.print("\n");

//        charAt
        String NAme = "Dipanjan";
        System.out.println(NAme.charAt(0));
        System.out.println(NAme.charAt(2));
        System.out.print("\n");

//        length
        System.out.println(MyName.length());
        System.out.println(MyFriend.length());
        System.out.println(MyLastName.length());
        System.out.print("\n");

//        replace
        String naME = NAme.replace('a','@');
        System.out.println(naME);
        System.out.println(NAme);
        System.out.print("\n");

//        substring
        String tooname = "Dipanjan and Kundan";
        System.out.println(tooname.substring(9, 12));
        System.out.print("\n");

//        normal variable
//        int d_age = 19;
//        System.out.println(d_age);
//        Arrays
//        Arrays is also a non NonPrimitive type variable
        int[] marks = new int[5];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        marks[3] = 92;
//        if Any value is not given in an array then it becomes nul/0
//        marks[4] = 91;
//        5th one is not going to work
//        marks[5] = 94;

        System.out.print("Bengali : ");
        System.out.println(marks[0]);
        System.out.print("English : ");
        System.out.println(marks[1]);
        System.out.print("History : ");
        System.out.println(marks[2]);
        System.out.print("Geography : ");
        System.out.println(marks[3]);
        System.out.print("Math : ");
        System.out.print("\n");
//        if Any value is not given in an array then it becomes nul/0
        System.out.println(marks[4]);

//        another example for value less array in boolean
        boolean[] nul = new boolean[1];
//        nul[0] = true;
        System.out.print("Example For Value Less Array In Boolean : ");
        System.out.println(nul[0]);
        System.out.print("\n");

//        Length output of an array
        System.out.print("Length Output Of An Array : ");
        System.out.println(marks.length);
        System.out.print("\n");

//        Sort output of an array
        System.out.println("Normal Output Of An Array");
        System.out.print("Bengali : ");
        System.out.println(marks[0]);
        System.out.print("English : ");
        System.out.println(marks[1]);
        System.out.print("History : ");
        System.out.println(marks[2]);
        System.out.print("Geography : ");
        System.out.println(marks[3]);
        System.out.print("Math : ");
        System.out.println(marks[4]);
        System.out.print("\n");
        Arrays.sort(marks);
        System.out.println("Sort Output Of An Array");
        System.out.print("Math : ");
        System.out.println(marks[0]);
        System.out.print("Geography : ");
        System.out.println(marks[1]);
        System.out.print("History : ");
        System.out.println(marks[2]);
        System.out.print("Bengali : ");
        System.out.println(marks[3]);
        System.out.print("English : ");
        System.out.println(marks[4]);
        System.out.print("\n");


//        without any new variable array
        int[] Marks = {90, 91, 92};
        System.out.print("Bengali : ");
        System.out.println(Marks[0]);
        System.out.print("English : ");
        System.out.println(Marks[1]);
        System.out.print("Geography : ");
        System.out.println(Marks[2]);
        System.out.print("\n");

//        normal 2D array
        int[][] Toomarks = new int[3][3];
//        [0][0] The first [0] means calling the 1D array and the second [0] means which variable I want to call
        Toomarks[0][0] = 90;
        Toomarks[0][1] = 91;
        Toomarks[0][2] = 92;
//        [1][0] The first [1] means calling the 2D array and the second [0] means which variable I want to call
        Toomarks[1][0] = 80;
        Toomarks[1][1] = 81;
        Toomarks[1][2] = 82;
        System.out.print("First Student In Bengali : ");
//        [0][0] The first [0] means calling the 1D array and the second [0] means which variable I want to call
        System.out.println(Toomarks[0][0]);
        System.out.print("First Student In English : ");
        System.out.println(Toomarks[0][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(Toomarks[0][2]);
        System.out.print("\n");
        System.out.print("First Student In Bengali : ");
//        [1][0] The first [1] means calling the 2D array and the second [0] means which variable I want to call
        System.out.println(Toomarks[1][0]);
        System.out.print("First Student In English : ");
        System.out.println(Toomarks[1][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(Toomarks[1][2]);
        System.out.print("\n");

//        without any new variable 2D array
        int[][] toomarks = {{90, 91, 92}, {80, 81, 82}};
        System.out.print("First Student In Bengali : ");
//        [0][0] The first [0] means calling the 1D array and the second [0] means which variable I want to call
        System.out.println(toomarks[0][0]);
        System.out.print("First Student In English : ");
        System.out.println(toomarks[0][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(toomarks[0][2]);
        System.out.print("\n");
        System.out.print("First Student In Bengali : ");
//        [1][0] The first [1] means calling the 2D array and the second [0] means which variable I want to call
        System.out.println(toomarks[1][0]);
        System.out.print("First Student In English : ");
        System.out.println(toomarks[1][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(toomarks[1][2]);
        System.out.print("\n");

//        casting
        double price = 100.00;
//        this is how you print double
        System.out.printf("Price : " + String.valueOf(price));
        System.out.print("\n");
//        this is how you use casting to print double
        double finalprice = price + 18.00;
        System.out.print("Final Price : " + finalprice);
        System.out.print("\n");
//        this is how you use casting to print int
        int p = 100;
        System.out.println("Price : " + p);
        System.out.print("\n");
        int fp =( p  + (18%p));
        System.out.println("Final Price : " + fp);
        System.out.print("\n");

//        explicit casting
        int P = 100;
        System.out.println("Price : " + P);
        System.out.print("\n");
//        hear 18.0 is a double but by using casting we can convert it to int
//        but if you do this you will lose some value because of overflow
        int FP = P + (int) 18.99;
        System.out.println("Final Price : " + FP);
        System.out.print("\n");

//        constants
//        all the variables are not  constants because i can change them
        int Age = 19;
        System.out.println(Age);
//        in next year, Age will be 20
        Age = 20;
        System.out.println(Age);
//        in this year, Age will be 21
        Age = 21;
        System.out.println(Age);
//        in next year, Age will be 22
        Age = 22;
        System.out.println(Age);
        float PI = 3.14f;
        System.out.println(PI);
//        or any other value you want to use
        PI = 1.12f;
        System.out.println(PI);
        System.out.print("\n");

//        but in constants you can't change the value of the variable for Example:
        final float Pi = 3.14f;
//        this gives error because you can't change the value of the variable
//        Pi = 1.12f;
        System.out.println(Pi + "\n");

//        operators

//        + addition
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum + "\n");
//        - subtraction
        int c = 1;
        int d = 2;
        int sub = c - d;
        System.out.println(sub + "\n");
//        * multiplication
        int e = 1;
        int f = 2;
        int mul = e * f;
        System.out.println(mul + "\n");
//        / division
//        I used double for better accuracy
        double g = 1;
        double h = 2;
        double div = g / h;
        System.out.println(div + "\n");
//        % modulus
//        it gives the remainder of the division
        int i = 1;
        int j = 2;
        int mod = i % j;
        System.out.println(mod + "\n");

//        ++ increment
//        this is how pre-increment works
        int inc = 1;
        System.out.println(++inc);
        System.out.println(inc + "\n");
//        this is how post-increment works
        int inc2 = 1;
        System.out.println(inc2++);
        System.out.println(inc2 + "\n");

//      -- decrement
//      this is how pre-decrement works
        int dec = 1;
        System.out.println(--dec);
        System.out.println(dec + "\n");
//      this is how post-decrement works
        int dec2 = 1;
        System.out.println(dec2--);
        System.out.println(dec2 + "\n");

//      == equal to
        int a1 = 1;
        int b1 = 1;
        boolean equal = a1 == b1;
        System.out.println(equal + "\n");

//      != not equal to
        int a2 = 1;
        int b2 = 1;
        boolean notEqual = a2 != b2;
        System.out.println(notEqual + "\n");

//      > greater than
        int a3 = 1;
        int b3 = 2;
        boolean greater = a3 > b3;
        System.out.println(greater + "\n");

//      < less than
        int a4 = 1;
        int b4 = 2;
        boolean less = a4 < b4;
        System.out.println(less + "\n");

//      >= greater than or equal to
        int a5 = 1;
        int b5 = 2;
        boolean greaterEqual = a5 >= b5;
        System.out.println(greaterEqual + "\n");

//      <= less than or equal to
        int a6 = 1;
        int b6 = 2;
        boolean lessEqual = a6 <= b6;
        System.out.println(lessEqual + "\n");

//      && and
        int a7 = 1;
        int b7 = 2;
        boolean and = a7 > b7 && a7 < b7;
        System.out.println(and + "\n");

//      || or
        int a8 = 1;
        int b8 = 2;
        boolean or = a8 > b8 || a8 < b8;
        System.out.println(or + "\n");

//      ! not
        int a9 = 1;
        int b9 = 2;
        boolean not = !(a9 < b9);
        System.out.println(not + "\n");

//        Math class
//        used for finding maximum values
        System.out.println(Math.max(5, 6) +"\n");
//        used for finding minimum values
        System.out.println(Math.min(5, 6) + "\n");
//        random
//        it returns a random number between 0.0 and 1.0
        System.out.println(Math.random() + "\n");
//        for integer type big random numbers
        System.out.println((int)(Math.random()*100) + "\n");
//        Math.pow(a,b)
//        a is the base and b is the exponent
        System.out.println(Math.pow(2, 3) + "\n");
//        Math.sqrt(a)
//        a is the number you want to find the square root of
        System.out.println(Math.sqrt(25) + "\n");

//        Input
        Scanner NAME0 = new Scanner(System.in);
//        Output
        System.out.print("Enter your Name : ");
        String NAME09 = NAME0.nextLine();
//        Output
        System.out.println("My Name Is " + NAME09 + "\n");

//        Input
        Scanner AGE0 = new Scanner(System.in);
//        Output
        System.out.print("Enter your Age : ");
        int AGE09 = AGE0.nextInt();
//        Output
        System.out.println("My Age Is " + AGE09 + "\n");
    }

}
