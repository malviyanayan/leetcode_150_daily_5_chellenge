import java.util.HashMap;
import java.util.Map;

class Leetcode383{
    public boolean canConstruct1(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();


        for(int i=0;i<ransomNote.length();i++){
            char next = ransomNote.charAt(i);
            ransomMap.put(next , ransomMap.getOrDefault(next , 0) + 1);
        }


        for(int i=0;i<magazine.length();i++){
            char next = magazine.charAt(i);
            magazineMap.put(next , magazineMap.getOrDefault(next , 0) + 1);
        }

        for(java.util.Map.Entry<Character, Integer> entry : ransomMap.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();

            Integer magVal = magazineMap.get(key);

            if(magVal != null && magVal >= value)continue;
            else return false; 
        }

        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        for(int i=0;i<magazine.length();i++){
            char next = magazine.charAt(i);
            magazineMap.put(next , magazineMap.getOrDefault(next , 0) + 1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char next = ransomNote.charAt(i);
            Integer avl = magazineMap.get(next);

            if(avl == null)return false;
            else {
                if(avl == 1)magazineMap.remove(next);
                else magazineMap.put(next , avl-1);
            }
        }

        return true;
    }

}