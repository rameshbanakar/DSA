package backtracking;

public class mazePathPrinting {
    public static void solve(int m,int n,int i,int j,String path){
        if(i>m || j>n) return;

        if(i==m && j==n){
            System.out.println(path);
            return;
        }
        solve(m,n,i+1,j,path+"D");
        solve(m,n,i,j+1,path+"R");
    }
    public static void main(String[] args) {
        int n=2;
        solve(n-1,n-1,0,0,"");
    }
}
