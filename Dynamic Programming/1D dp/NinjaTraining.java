public class NinjaTraining {
     public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        return solve(n-1 , 3 , points);
    }
    public static int solve(int day , int last , int points[][])
    {

        if(day==0)
        {
            int maxi=0;
            for(int task=0;task<3;task++)
            {
                maxi = Math.max(maxi, points[0][task]);
            }
            return maxi;
        }
        for(int task=0;task<3;task++)
        {
            if(task!=last)
            {
                int point = points[day][task] + solve(day-1, last, points)
            }
        }
    }
}
