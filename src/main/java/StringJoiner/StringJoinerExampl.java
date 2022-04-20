package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExampl {

    public static void main(String[] args) {
        //String s = ",";
        StringJoiner joiner = new StringJoiner(",","{","}");
        joiner.add("star");
        joiner.add("gayatri");
        joiner.add("snehu");
        joiner.add("jagruti");
        joiner.add("star");
        String s1 = String.valueOf(joiner);
        System.out.println(s1);

    }
}
