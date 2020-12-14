import java.util.HashMap;
import java.util.Map;

public class haxi_max {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 3, 4, 1, 3, 1, 3};
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (d.containsKey(a[i])) {
                d.put(a[i], d.get(a[i]) + 1);
            } else {
                d.put(a[i], 1);
            }
        }
        int val_max = 1;
        int time_max = 1;
        for (Integer key : d.keySet()) {
            if (d.get(key) > time_max) {
                time_max = d.get(key);
                val_max = key;
            }
        }
        System.out.println(val_max);
    }
}
