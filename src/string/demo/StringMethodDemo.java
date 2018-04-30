package string.demo;

public class StringMethodDemo {
    public static void main(String[] args) {
        stringMethodDemo_4();
    }

    private static void stringMethodDemo_4() {
        String s="avb";
        String s1="asg";
        System.out.println(s.compareTo(s1));
    }

    private static void stringMethodDemo_3() {
        String s="abc";
        System.out.println(s.equalsIgnoreCase("ABC"));
        System.out.println(s.contains("cc"));
    }

    private static void stringMethodDemo_2() {
        String s ="caogonghui.zhangsan.lisi";
        String [] arr=s.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        char [] chs=s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
    }

    private static void stringMethodDemo_1() {
        String s="abcdeacccbfasd";
        System.out.println("length:"+s.length());
        System.out.println("char:"+s.charAt(2));
        System.out.println("index:"+s.indexOf('a'));
        System.out.println("lastIndex:"+s.lastIndexOf('c'));
        System.out.println("substring:"+s.substring(2));
    }
}
