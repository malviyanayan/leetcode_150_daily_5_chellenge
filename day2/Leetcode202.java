class Leetcode202{
    public boolean isHappy(int n) {
        if(n < 10){
            if(n == 1)return true;
            else return false;
        }

        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += (rem*rem);
            n/=10;
        }

        return isHappy(sum);
    }

}