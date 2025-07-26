import java.util.HashMap;

class Leetcode290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map = new HashMap<>();
        int fast = 0;
        int slow = 0;

        // while(fast != s.length() && s.charAt(fast) == ' ')fast++;

        while(slow < pattern.length() && fast < s.length()){
            String temp = "";
            while(fast != s.length() && s.charAt(fast) != ' '){
                temp+=s.charAt(fast);
                fast++;
            }

            char ch = pattern.charAt(slow);

            if(map.containsKey(temp)){
                char chh = map.get(temp);
                if(chh != ch)return false;
            }else{
                if(map1.containsKey(ch)){
                    if(!map1.get(ch).equals(temp))return false;
                }
                    map.put(temp, ch);
                    map1.put(ch, temp);
                
                
            }

            slow++;
            fast++;
        }

        if(slow <= pattern.length() || fast <= s.length())return false;
        return true;
    }    

}
