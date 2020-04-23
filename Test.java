import  java.util.Arrays;
public class Test {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8};
//        int[] newArr =  Arrays.copyOf(arr,arr.length);
//        System.out.println("newArr:" + Arrays.toString(newArr));
//        arr[0] =10;
//        System.out.println("arr:" + Arrays.toString(arr));
//        int[] newArr1 = Arrays.copyOfRange(arr,2,4);
//        System.out.println("newArr1:" + Arrays.toString(newArr1));
//        int []arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(copyArray(arr));
//    }
//    public static int[] copyArray(int[] arr){
//        int [] ret =  new int [arr.length];
//        for(int i =0;i<arr.length;i++){
//            ret[i] =  arr[i];
//        }
//        return  ret;
//        int [] arr =  { 1,2,3,4,5};
//        System.out.println(avg(arr));
//    }
//    public  static  double avg(int[] arr){
//        int sum = 0;
//        for(int x : arr){
//            sum +=x;
//        }
//        return (double)sum/(double)arr.length;
//        int[] arr = {1, 2, 3, 3, 4, 4, 27, 5, 5, 69, 10, 34};
//        System.out.println(find(arr, 99));
//    }
//
//    public static int find(int[] arr, int num) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == num) {
//                return i;
//            }
//        }
//        return -1;
        int[] arr = {1, 2, 34, 56, 78, 89, 122, 145};
        System.out.println(binarySearch(arr, 89));
    }

    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
//            int mid = (left + (right - left) >> 1);
            int mid = (left + right) /2;




            
            if (num > arr[mid]) {
                left = mid + 1;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

//        int [] arr = {1,2,3,5,4};
//        String arr1 = Arrays.toString(arr);
//        System.out.println(arr1);
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println(toStrig(arr));
//    }
//
//    public static String toStrig(int[] arr) {
//        String ret = "[";
//        for (int i = 0; i < arr.length; i++) {
//            ret += arr[i];
//            if (i != arr.length - 1) {
//                ret += ",";
//            }
//        }
//        ret += "]";
//        return ret;
//    }
//}
//        int[] arr = {1, 2, 34, 5};
//        int[] output = transform(arr);
//        printArrary(output);
//    }
//    public static void printArrary(int[] arr) {
//        for (int x : arr) {
//            System.out.println(x);
//        }
//    }
//    public static void transform(int[] arr) {
//        int[] ret = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            ret[i] = arr[i] * 2;
//        }
//    }
//}


