package edu.marcos.javabasics;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int i1 =15;
        int i2 = 25;
        float f1 = 7.5f;
        float f2 = 5.4f;
        double d1 = 76.6;
        char c1 = 'c';
        char c2 = 'd';
        String s1 = "Marcos";
        String s2 = "Freitas";
        String s3 = "Irineu";
        boolean b1 = true;
        boolean b2 = false;
    
        long l1 = 3456L;
        long l2 = 32000L;
        byte y1 = 2;
        short h1 = 30;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1!=i2));
        System.out.println("i1 != i2 " + (i1!=i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 == s2));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 == i1));
        System.out.println("y1 != h1 " + (y1 == h1));
        
    }
}
