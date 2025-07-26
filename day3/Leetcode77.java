import java.util.List;
import java.util.ArrayList;

class Leetcode77{
    // public List<List<Integer>> combine(int n, int k) {
    //     List<Integer> list = new ArrayList<>();

    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> temp = new ArrayList<>();

    //     helper(k, temp, list, result);

    //     return result;
    // }

    // static void helper(int k, List<Integer> temp,List<Integer> list , List<List<Integer>> result){
    //     if(temp.size() == k){
    //         List<Integer> next = new ArrayList<>(temp);
    //         result.add(next);
    //         return;
    //     }

    //     for(int i=0;i<list.size();i++){
    //         int next = list.remove(i);
    //         temp.add(next);
    //         helper(k+1, temp, list, result);
    //         temp.remove(temp.size()-1);
    //         list.add(i, next);
    //     }
    // }


    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(1, n, k, list, result);

        return result;
    }

    static void helper(int i, int n, int k, List<Integer>temp, List<List<Integer>> result){
        if(k==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        while(i != n){
            temp.add(i);
            helper(i+1, n, k-1, temp, result);
            temp.remove(temp.size()-1);
            i++;
        }
    }


    

}