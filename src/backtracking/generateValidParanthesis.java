package backtracking;

public class generateValidParanthesis{
    public static void generateValidPars(String ans,int n,int open,int close){
        if(open>n || close>n) return;
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
         if(open<n){
            generateValidPars(ans+"(",n,open+1,close);
        }
         if(close<open){
            generateValidPars(ans+")",n,open,close+1);
        }
    }
    public static void main(String[] args) {
          generateValidPars("",4,0,0);
     }
}
