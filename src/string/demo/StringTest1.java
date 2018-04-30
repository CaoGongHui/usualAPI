package string.demo;

public class StringTest1 {
    public static void main(String[] args) {
        String str="nbachajhnbajdejnbadjlk";
        String key="nba";
        int count =getKeyStringCount_2(str,key);
        System.out.println(count);
    }

    private static int getKeyStringCount_2(String str, String key) {
        int count=0;
        int index=0;
        while((index=str.indexOf(key,index))!=-1){
            index=index+key.length();
            count++;
        }
        return count;
    }


    public static int getKeyStringCount(String str, String key) {
        int count=0;

        int index=0;

        while ((index=str.indexOf(key))!=-1) {

            str=str.substring(index+key.length());
            count++;
        }
        return count;


    }
}
