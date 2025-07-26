

class Leetcode20{
    public boolean isValid(String s) {
        if(s.length() <2)return false;
        CharStack stk = new CharStack();
        boolean ans = true;

        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);

            if(temp == '(' || temp == '{' || temp == '['){
                stk.push(temp);
            }
            else if(temp == ')' || temp == '}' || temp == ']'){
                if(stk.peek() == -1)return false;
                char ttemp = stk.pop();
                if(temp == ')' && ttemp == '(')ans = true;
                else if(temp == '}' && ttemp == '{')ans = true;
                else if(temp == ']' && ttemp == '[')ans = true;
                else return false;
            }
        }

        if(stk.peek() != -1){
            ans = false;
        }
       

        return ans;
    }
}

class CharStack{
    private char[] x = new char[10000];
    private int top = -1;

    void push(char a){
        top ++;
        x[top] = a;
    }

    int peek(){
        return top;
    }

    char pop(){
        char temp = x[top];
        top--;

        return temp;
    }
}