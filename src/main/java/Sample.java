import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 2, 2, 1, 0, 0, 2};
        sort("grr", "drf");
    }

    public static void sort(String s1, String s2) {
        int[] a1 = new int[26];
        int[] a2 = new int[26];

        for (int i = 0 ; i < s1.length() ; i++)
            a1[s1.charAt(i) - 'a'] +=1;

        for (int i = 0 ; i < s2.length() ; i++)
            a2[s2.charAt(i) - 'a'] += 1;

        for (int i = 0 ; i < 26 ; i++)
        {
            if (a1[i] != 0 && a2[i] != 0) {
                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
                    System.out.print(((char)(i + 'a')));
            }
        }}


}
