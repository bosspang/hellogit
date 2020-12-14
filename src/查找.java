public class 查找 {
    public static void main(String[] args) {
            int a[] = {1, 4, 7, 18, 10};
            int max_val = 1;
            int max_i = 1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max_val) {
                    max_val = a[i];
                    max_i = i;
                }
            }
            System.out.println(max_val);
    }
}
