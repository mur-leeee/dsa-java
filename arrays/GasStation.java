class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg = 0;
        for(int g : gas){
            tg+=g;
        }
        int tc = 0;
        for(int c : cost){
            tc+=c;
        }

        if(tg < tc){
            return -1;
        }

        int fuel = 0;
        int start = 0;

        for(int i = 0 ; i < gas.length ; i++){
            fuel += gas[i] - cost[i];
            if(fuel < 0){
                fuel = 0;
                start = i + 1;
            }
        }

        return start;
    }
}
