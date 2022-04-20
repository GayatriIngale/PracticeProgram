package StringJoiner;

import java.util.StringJoiner;

public class MergeJoiners {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");
        System.out.println("This is joiner: "+joiner);
        joiner.setEmptyValue("It is empty");
        System.out.println("This is joiner after default: "+joiner);

        joiner.add("Gayatri");
        joiner.add("Ingale");

        System.out.println("length of Joiner: "+joiner.length());
        joiner.add("Prabhu");
        System.out.println("length of new Joiner: "+joiner.length());
        String str = joiner.toString();
        System.out.println(str);


//        StringJoiner joiner1 = new StringJoiner(":","[","]");
//        joiner1.add("Prabhu");
//        joiner1.add("Ingale");
//
//        StringJoiner merge = joiner.merge(joiner1);
//        System.out.println(merge);
    }
}
