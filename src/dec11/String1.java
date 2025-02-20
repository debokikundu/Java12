package dec11;

public class String1 {

    public static void main(String[] args) {



        int i = 10;

        String a = "He is a good man is good way is to is!";

        String[] ij = a.split("is"); //"He ", " a good man ", " good way ", " to ", "!"
        System.out.println(ij.length);
        System.out.println("is is there in the string for " + (ij.length -1) + " times." );
        //sequence of chars
        String b = "Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of Sun's Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux distributions.";
        String c = "He is also hard working";
        String s = "If I want to like to get a job to get things in order";

        System.out.println(a);
        System.out.println(i);

        //how many characters are there
        System.out.println(a.length());


        //array name.length; arraylist name.size(); string name.length();

        //if any word/partial word/char is there
        System.out.println(b.contains("programming"));
        System.out.println(b.contains("Java"));
        System.out.println(b.contains("platform"));
        System.out.println(s.contains("like"));


        //Change Case
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());



        //create an array of char from a string
        char[] ch = a.toCharArray(); //{'H','e', ' ', 'i', 's',  ....'n', '!'}
        for(char d : ch){
            System.out.println(d);
        }

        // "He" "is" "a" "good" "man"
        //divide the words
        String[] words = a.split(" ");
        for(String box : words){
            System.out.println(box);
        }

        //how many times Java is there
        String[] java = b.split("is");
        System.out.println(java.length-1);

        String[] t = s.split("to");
        System.out.println("number of pieces when divided at to " + t.length); //"1. If I want 2.like 3.get a job 4.get things in order";
        System.out.println("number of to in the string " + (t.length - 1));

        //part of String
        System.out.println(b.substring(30, 90));
        System.out.println(s.substring(9,12));

        //add 2 String
        System.out.println( a + i);
        System.out.println( a + "Yes, I know");
        System.out.println(a + c);
        System.out.println(a.concat(c));

        //find out char at a position
        System.out.println(a.charAt(15));

    }
}
