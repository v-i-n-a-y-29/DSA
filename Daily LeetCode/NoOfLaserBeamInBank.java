import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NoOfLaserBeamInBank {
    public static int numberOfBeams(String[] bank) {
        ArrayList<Integer> devices = new ArrayList<>();
        int indx = 0;
        for (String device : bank) {
            int count = 0;
            // System.out.println(device);
            for (int i = 0; i < device.length(); i++) {
                if (device.charAt(i) == '1')
                    count++;
            }
            devices.add(count);
        }
        System.out.println(devices);
        
        Iterator<Integer> it = devices.iterator();
        while (it.hasNext()) {
            if (it.next() == 0)
                it.remove();
        }

        System.out.println(devices);
        int ans = 0;
        for (int i = 0; i < devices.size() - 1; i++) {
            ans = ans + devices.get(i) * devices.get(i + 1);
        }
        // System.out.println(ans);
        return ans;
        

    }

    public static void main(String[] args) {
        String bank[] = {};
        numberOfBeams(bank);
    }
}
