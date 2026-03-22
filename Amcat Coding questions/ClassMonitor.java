
public class ClassMonitor {
    public static void main(String[] args) {
        
        int arr[] = {4,3,7,2,6,1};
        int min=arr[0];
        int count=1;
        for(int num:arr)
        {
            if(num<min)
            {
                count++;
                min=num;
            }
        }
        System.out.println(count);
                
    }
}
