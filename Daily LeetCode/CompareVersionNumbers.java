import java.util.Arrays;

public class CompareVersionNumbers {
    public static  int compareVersion(String version1, String version2) {
        String ver1[]=version1.split("\\.");
        String ver2[]=version2.split("\\.");
        System.out.println(Arrays.toString(ver1));
        System.out.println(Arrays.toString(ver2));
        for(int i=0;i<Math.max(ver1.length, ver2.length);i++){
            int x=0;
            int y=0;
            if(i<ver1.length)
             x = Integer.parseInt(ver1[i]);
            if(i<ver2.length)
             y = Integer.parseInt(ver2[i]);
            if(x>y) return 1;
            if(x<y) return -1;
        }
        return 0;

    }
    public static void main(String[] args) {
       String version1 = "1.2", version2 = "1.10";
        System.out.println(compareVersion(version1, version2));
    }
}
