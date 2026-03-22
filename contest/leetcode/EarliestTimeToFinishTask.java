public class EarliestTimeToFinishTask {
    public static  int earliestTime(int[][] tasks) {
        int minTime=Integer.MAX_VALUE;
        for(int[] task : tasks) {
            int st=task[0];
            int et=task[1];
            minTime = Math.min(minTime , st+et);
        }
        return minTime;
    }

    public static void main(String[] args) {
        int [][] tasks = { {1,6} };
        System.out.println(earliestTime(tasks));
    }
}
