import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Leetcode49{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<HashMap<Character, Integer>> maps = new ArrayList<>(); 

        for(int i=0;i<strs.length;i++){
            int itsIndex = findIndex(strs[i], maps);

            if(itsIndex == result.size()){
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
            }else{
                result.get(itsIndex).add(strs[i]);
            }
        }


        return result;
    }

    private int findIndex(String string, List<HashMap<Character, Integer>> maps) {

        HashMap<Character, Integer> temp = new HashMap<>();
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            temp.put(ch, temp.getOrDefault(ch, 0)+1);
        }

        int i=0;
        for(;i<maps.size();i++){
            if(maps.get(i).equals(temp))return i;
        }

        maps.add(temp);

        return i;
    }

}


// ek list jiske ander hashmap store rhenge
// ek list jiske ander elements store rhenge