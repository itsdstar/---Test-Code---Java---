public class JavaDevelopmentTestCode {
    public static void main(String[] args){
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");

//        variables

        String name = "Dipanjan";
        System.out.println(name);
        int age = 19;
        System.out.println(age);
        String classmate = "Kundan";
        System.out.println(classmate);
        String friend = classmate;
        System.out.println(friend);

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
//        int phonenumber = 8159092898;
//        System.out.println(phonenumber);
//        it's not gona work
        long phonenumber = 8159092898L;
        System.out.println(phonenumber);
        float py = 3.14F;
        System.out.println(py);
        char charcter = '@';
        System.out.println(charcter);
        boolean isAdult = true;
        System.out.println(isAdult);

//        NonPrimitive type variable
//        String
        String MyName = new String("Dipanjan");
        String MyFriend = new String("Kundan");
        String MyLastName = new String("Mitra");
        System.out.print(MyName);
        System.out.print(" ");
        System.out.println(MyLastName);
        System.out.println(MyFriend);
//        Used For length of the String
        System.out.println(MyName.length());
        System.out.println(MyFriend.length());
        System.out.println(MyLastName.length());

//        concatenate
        String Name1 = "Dipanjan";
        String Name2 = "Kundan";
        String Name3 = Name1 + " and " + Name2;
        System.out.println(Name3);

//        charAt
        String NAme = "Dipanjan";
        System.out.println(NAme.charAt(0));
        System.out.println(NAme.charAt(2));

//        length
        System.out.println(MyName.length());
        System.out.println(MyFriend.length());
        System.out.println(MyLastName.length());

//        replace
        String naME = NAme.replace('a','@');
        System.out.println(naME);
        System.out.println(NAme);

    }
}
