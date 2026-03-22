public class ValueOfVariableAfterPerfoemingOperation {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String opn:operations)
        {
            if( (opn.equals("++X")) || (opn.equals("X++")) )
            {
                ++ans;
            }
            else
            {
                --ans;
            }
        }
        return ans;
    }
}
