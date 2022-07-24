import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaDevelopmentTestCode {
    public static void main(String[] args){
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");
//        "\n" is used for spacig betwin output lines
        System.out.println("Hellow World\n");

//        variables

        String name = "Dipanjan";
        System.out.println(name);
        int age = 19;
        System.out.println(age);
        String classmate = "Kundan";
        System.out.println(classmate);
        String friend = classmate;
        System.out.println(friend);
        System.out.println("\n");

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
        System.out.println("\n");
//        int phonenumber = 8159092898;
//        System.out.println(phonenumber);
//        it's not going to work
        long phonenumber = 8159092898L;
        System.out.println(phonenumber);
        System.out.println("\n");
        float py = 3.14F;
        System.out.println(py);
        System.out.println("\n");
        char charcter = '@';
        System.out.println(charcter);
        System.out.println("\n");
        boolean isAdult = true;
        System.out.println(isAdult);
        System.out.println("\n");

//        NonPrimitive type variable
//        String
        String MyName = new String("Dipanjan");
        String MyFriend = new String("Kundan");
        String MyLastName = new String("Mitra");
        System.out.print(MyName);
        System.out.print(" ");
        System.out.println(MyLastName);
        System.out.println(MyFriend);
        System.out.println("\n");
//        Used For length of the String
        System.out.println(MyName.length());
        System.out.println(MyFriend.length());
        System.out.println(MyLastName.length());
        System.out.println("\n");

//        concatenate
        String Name1 = "Dipanjan";
        String Name2 = "Kundan";
        String Name3 = Name1 + " and " + Name2;
        System.out.println(Name3);
        System.out.println("\n");

//        charAt
        String NAme = "Dipanjan";
        System.out.println(NAme.charAt(0));
        System.out.println(NAme.charAt(2));
        System.out.println("\n");

//        length
        System.out.println(MyName.length());
        System.out.println(MyFriend.length());
        System.out.println(MyLastName.length());
        System.out.println("\n");

//        replace
        String naME = NAme.replace('a','@');
        System.out.println(naME);
        System.out.println(NAme);
        System.out.println("\n");

//        substring
        String tooname = "Dipanjan and Kundan";
        System.out.println(tooname.substring(9, 12));
        System.out.println("\n");

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
        System.out.println("\n");
//        if Any value is not given in an array then it becomes nul/0
        System.out.println(marks[4]);

//        another example for value less array in boolean
        boolean[] nul = new boolean[1];
//        nul[0] = true;
        System.out.print("Example For Value Less Array In Boolean : ");
        System.out.println(nul[0]);
        System.out.println("\n");

//        Length output of an array
        System.out.print("Length Output Of An Array : ");
        System.out.println(marks.length);
        System.out.println("\n");

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
        System.out.println("\n");
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
        System.out.println("\n");


//        without any new variable array
        int[] Marks = {90, 91, 92};
        System.out.print("Bengali : ");
        System.out.println(Marks[0]);
        System.out.print("English : ");
        System.out.println(Marks[1]);
        System.out.print("Geography : ");
        System.out.println(Marks[2]);
        System.out.println("\n");

//        normal 2D array
        int[][] Toomarks = new int[3][3];
//        [0][0] The first [0] means calling the 1D array and the second [0] means which variable i wont to call
        Toomarks[0][0] = 90;
        Toomarks[0][1] = 91;
        Toomarks[0][2] = 92;
//        [1][0] The first [1] means calling the 2D array and the second [0] means which variable i wont to call
        Toomarks[1][0] = 80;
        Toomarks[1][1] = 81;
        Toomarks[1][2] = 82;
        System.out.print("First Student In Bengali : ");
//        [0][0] The first [0] means calling the 1D array and the second [0] means which variable i wont to call
        System.out.println(Toomarks[0][0]);
        System.out.print("First Student In English : ");
        System.out.println(Toomarks[0][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(Toomarks[0][2]);
        System.out.println("\n");
        System.out.print("First Student In Bengali : ");
//        [1][0] The first [1] means calling the 2D array and the second [0] means which variable i wont to call
        System.out.println(Toomarks[1][0]);
        System.out.print("First Student In English : ");
        System.out.println(Toomarks[1][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(Toomarks[1][2]);
        System.out.println("\n");

//        without any new variable 2D array
        int[][] toomarks = {{90, 91, 92}, {80, 81, 82}};
        System.out.print("First Student In Bengali : ");
//        [0][0] The first [0] means calling the 1D array and the second [0] means which variable i wont to call
        System.out.println(toomarks[0][0]);
        System.out.print("First Student In English : ");
        System.out.println(toomarks[0][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(toomarks[0][2]);
        System.out.println("\n");
        System.out.print("First Student In Bengali : ");
//        [1][0] The first [1] means calling the 2D array and the second [0] means which variable i wont to call
        System.out.println(toomarks[1][0]);
        System.out.print("First Student In English : ");
        System.out.println(toomarks[1][1]);
        System.out.print("First Student In Geography : ");
        System.out.println(toomarks[1][2]);
        System.out.println("\n");

//        casting
    }
}
