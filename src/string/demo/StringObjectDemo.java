package string.demo;

public class StringObjectDemo {
    public static void main(String[] args) {
        //String s1="abc";
        //String s2="abc";
        //intern(): manage the string poof;
        String s1="abc";
        String s2=s1.intern();
        System.out.println(s1==s2);
    }

}
