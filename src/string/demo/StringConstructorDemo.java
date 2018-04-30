package string.demo;

public class StringConstructorDemo {
    public static void main(String[] args) {
        stringConstructorDemo();
    }
    public static void stringConstructorDemo(){
        String s =new String();
        byte [] arr= {65,66,67,68};
        String s1=new String(arr,1,2);
        System.out.println("s1="+s1);
    }
}
