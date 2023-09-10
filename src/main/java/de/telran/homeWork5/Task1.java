package de.telran.homeWork5;

public class Task1 {
    public static void main(String[]  args) {
        String text1 = new String("I Study Basic Java!");
        forString(text1);
        System.out.println(text1.charAt(17));
        System.out.println(text1.contains("Java"));
        System.out.println(text1.substring(0,13)+text1.substring(18));
        System.out.println(text1.replace("a","o"));
        System.out.println(text1.toUpperCase());
        System.out.println(text1.toLowerCase());

    }
    public static void forString(String best){
        System.out.println(best);
    }
}

