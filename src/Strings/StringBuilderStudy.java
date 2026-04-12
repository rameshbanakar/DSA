package Strings;

//String builder make the immutable string into mutable string
// so because of this while doing repeted string modification will not create a so many objects

public class StringBuilderStudy {

    public static void main(String[] args) {
        String s="Ramesh";
        StringBuilder sb=new StringBuilder(s);
        sb.append(" Banakar");
        System.out.println(sb.toString());
    }
}
