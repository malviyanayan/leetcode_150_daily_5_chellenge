// import java.util.ArrayList;
// import java.util.List;

class Leetcode120 {
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     Integer[][] dp = new Integer[triangle.size()+1][triangle.size()+1];
    //     return helper(0, 0,triangle, dp);
    // }

    // static int helper(int i, int j, List<List<Integer>> tringle, Integer[][] dp){
    //     if(i == tringle.size()-1){
    //         // System.out.println(i + ", " + j + tringle.get(i));
    //         return dp[i][j] = tringle.get(i).get(j);
    //     }
        
    //     if(dp[i][j] != null)return dp[i][j];

    //     return dp[i][j] = tringle.get(i).get(j) + Math.min(helper(i+1, j, tringle, dp), helper(i+1, j+1, tringle, dp));
    // }



    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n = triangle.size() - 1;
    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0;i<=n;i++)list.add(0, triangle.get(n).get(i));


    // }
}




// first i have to go from top to bottom and i need a minimum path sum 
// from top to bottom

// I can go last row then i can find minimum path there 
// then I can come back to upper row then check minimum path sum there
// first I am going to use O(n2) extra time complexity
// where i will use extra helper method where I will pass one extra 
// dp array ... lets go to solve this problem


// make method meke dp array pass row number and column number there
// if you go wrong direction then return 0 from there
// in tringle you have i number of element in the array
// so you can use it
