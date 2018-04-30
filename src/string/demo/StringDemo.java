package string.demo;

public class StringDemo {
    public static void main(String[] args) {
        /*
        String Feature:
        1 once init can't be changed;
        2
         */
        stringDemo2();
    }

    public static void stringDemo2() {
        String s="abc";
        String s1=new String("abc");
        System.out.println("s="+s);
        System.out.println("s1="+s1);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));//the method in String ---equals compare the content between two objects
    }
    /*
    the first method to define string
     */

    public static void stringDemo1() {
        String s="abc";//"abc" is on String thread pool
        String s1="abc";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }
}
