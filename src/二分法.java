public class 二分法 {
    public static void main(String[] args) {
        int targetNumb = 2;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int middle = 0;
        int low =  0;
        int high = arr.length-1;
        int isfind = 0;

        while (low <= high){
            middle = (low + high)/2;
            if (arr[middle] == targetNumb){
                System.out.println(targetNumb + "在数组中，下标值为：" + middle);
                isfind = 1;
                break;
            }else if(arr[middle]>targetNumb){
                high = middle - 1;
            }else{
                low = middle+1;
            }
        }
        if (isfind == 0){
            System.out.println("数组不含"+targetNumb);
        }
    }
}
