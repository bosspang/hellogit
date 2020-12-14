import java.util.Arrays;
/*
冒泡排序的特点是，每一轮循环后，最大的一个数被交换到末尾.
因此，下一轮循环就可以“刨除”最后的数，
每一轮循环都比上一轮循环的结束位置靠前一位。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        
        //开始循环
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - 1 - i; j++) {
                if (ns[j] > ns[j+1]){
                    int temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        }
//        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}
