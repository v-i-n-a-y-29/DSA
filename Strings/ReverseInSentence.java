import java.util.*;

public class ReverseInSentence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        String arr[]=s.split("\\s+");
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            String temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        StringBuilder str = new StringBuilder();

        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            str.append(arr[i]+" ");
            else str.append(arr[i]);
        }
        System.out.println(str.toString());
    }
}
