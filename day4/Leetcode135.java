class Leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0; // total gas - total cost overall
        int currTank = 0; // gas - cost for current start point
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalTank += diff;
            currTank += diff;

            if (currTank < 0) {
                // Can't reach station i+1 from current start
                start = i + 1;
                currTank = 0;
            }
        }

        return (totalTank >= 0) ? start : -1;
    }

    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int n = gas.length;
        // visit each indexes
        for (int i = 0; i < n; i++) {
            int ourGas = 0;
            int j = i;
            boolean flag = false;

            do {
                ourGas += gas[j];
                if (ourGas < cost[j])
                    break;

                ourGas -= cost[j];

                j++;
                if (j == n)
                    j = 0;

                flag = true;
            } while (j != i);

            if (flag && j == i)
                return i;

        }

        return -1;
    }

    // private static boolean isTravel(int i, int[] gas, int[] cost){
    // int temp = i;
    // int currentGas = gas[i];
    // if(cost[])
    // do {

    // } while ();

    // return false;
    // }
}

// for it i need to visit each indexes
// then I will travel from that index if i come back to that index the return
// that index number else i will go to end if i reach to end then after loop
// i will return -1
// if any number found then it cant come here else this is my final code