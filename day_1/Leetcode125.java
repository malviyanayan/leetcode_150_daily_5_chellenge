class Leetcode125 {
    private static boolean ifValidChar(char ch){
        if(ch >= 65 && ch <= 90)return true;
        else if(ch >= 97 && ch <= 122)return true;
        else if(ch >= 48 && ch <= 57)return true;
        return false;
    }

    public boolean isPalindrome(String s) {
        int i=0, j = s.length()-1;

        while (i<j) {
            while(i<j && !ifValidChar(s.charAt(i)))i++;
            while(i<j && !ifValidChar(s.charAt(j)))j--;

            if(i==j)return true;
            
            if(i<j && Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else return false;
        }

        return true;
    }
    
    
    public boolean isPalindrome1(String s) {
        StringBuilder filtered = new StringBuilder();

        for (char c : s.toCharArray()) {
            // Check if character is ASCII alphanumeric
            if (Character.isLetterOrDigit(c) && c <= 127) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        String filteredStr = filtered.toString();
        String reversedStr = filtered.reverse().toString();

        return filteredStr.equals(reversedStr);
    }
}
