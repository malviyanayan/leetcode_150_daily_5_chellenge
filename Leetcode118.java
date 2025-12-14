
import java.util.ArrayList;
import java.util.List;

class Leetcode118 {
    public static void main(String[] args) {
        
    }   
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        if(numRows == 1)return result;

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        result.add(second);
        if(numRows == 2)return result;

        int n = 2;
        while(n < numRows){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);

            List<Integer> prev = result.get(n-1);
            for(int i = 1;i<prev.size();i++)
                temp.add(prev.get(i)+prev.get(i-1));
            
            temp.add(1);
            result.add(temp);
            n++;
        }

        return result;
    }
}
