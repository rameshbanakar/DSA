package TwoPointer;

public class FindingColumnNameInExcel {
    public static String columnName(int n){
        String ans="";
        while(n>0){
            ans=(char)((n-1)%26+'A')+ans;
            n=(n-1)/26;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=400;
        System.out.println(columnName(n));
    }
}
