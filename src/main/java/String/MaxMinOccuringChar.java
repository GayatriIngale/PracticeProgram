package String;

import java.util.Arrays;

public class MaxMinOccuringChar {
    public static void main(String args[]) {
        String str = "grass is greener on the other side";
        int[] freq = new int[str.length()];
        char str1 = str.charAt(0), str2 = str.charAt(0);
        char string[] = str.toCharArray();
        int i, j, min = 1, max = 1;
        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;
                    string[i] = '0';
                }
            }
        }
        min = max = freq[0];
        for (i = 0; i < freq.length; i++) {
            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                str1 = string[i];
            }
            if (max < freq[i]) {
                max = freq[i];
                str2 = string[i];
            }
        }
        System.out.println("Minimum occurring character: " + str1);
        System.out.println("Maximum occurring character: " + str2);
    }
}
