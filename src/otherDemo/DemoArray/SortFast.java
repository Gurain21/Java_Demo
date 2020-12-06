package otherDemo.DemoArray;

public class SortFast {

    private static int count;

    private static void QuickSort(int[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if (left >= right) {
            return;
        }
        //设置最左边的元素为基准值
        int key = num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i = left;
        int j = right;
        while (i < j) {
            //j向左移，直到遇到比key小的值
            while (num[j] >= key && i < j) {
                j--;
            }
            //i向右移，直到遇到比key大的值
            while (num[i] <= key && i < j) {
                i++;
            }
            //i和j指向的元素交换
            if (i < j) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        num[left] = num[i];
        num[i] = key;
        count++;
        QuickSort(num, left, i - 1);
        QuickSort(num, i + 1, right);
    }

    private static String arrayToString(int[] arr, String flag) {
        String str = "数组为(" + flag + ")：";
        for (int a : arr) {
            str += a + "\t";
        }
        return str;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 9, 1, 2, 0, 8, 4};
        int start = 0;
        int end = array.length - 1;
        QuickSort(array, start, end);
        System.out.println(arrayToString(array, ""));

    }
}

/*
快速排序：会先把数组中的一个数当做基准数，一般会把数组中最左边的数当作基准数。然后从两边进行检索。
先从右边检索比基准数小的。再从左边检索比基准数大的。
如果检索到了，就停下，然后交换这两个元素，然后再继续检索。i和j相遇时，把基准数和相遇位置的元素交换，第一轮排序结束

 */
class MyQuickSort {
    public static void quickSort2(int[] arr, int left, int right) {
        //进行判断，如果左边的索引比右边的索引大，这是不合法的，直接 return
        if (left > right) {
            return;
        }
        //定义基准数，一般是最左边的数
        int base = arr[left];
        //定义变量 i 指向最左边
        int i = left;
        //定义变量 j 指向最右边
        int j = right;
        //当 i 和 j 不相遇的时候，去循环中进行检索
        while (i != j) {
            //向由 j 从右向左检索比 基准数小的，如果检索到比基准数小的就停下
            //如果检索到的值比基准数大的或者相等的，就继续检索
            while (arr[j] >= base && i < j) {
                j--;//j从右往左检索
            }
            //向由 i 从右向左检索比 基准数大的，如果检索到比基准数大的就停下
            //如果检索到的值比基准数小的或者相等的，就继续检索
            while (arr[i] <= base && i < j) {
                i++;//i从左到右检索
            }
            //代码走到这里，i停下了，j也停下了。
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //走到这里了，说明i和j相遇了  即 i = j 了
        //现在就要把相遇位置的元素赋值给基准数这个位置的元素
        arr[left] = arr[i];
        arr[i] = base;
        //基准数在这里就归位了，基准数比左边的数都要大，比右边的数都要小
        //接下来排基准数的左边   这里可以通过递归函数
        quickSort2(arr, left, i - 1);
        //排右边
        quickSort2(arr, j + 1, right);
    }

    public static void quickSort3(int[] arr, int left, int right) {
       if (left > right){
           return;
       }
       int base = arr [left];
       int i = left;
       int j = right;
       while (i < j){
           while (arr[j] >= base && i< j ){
               j--;
           }
            while (arr[i] <= base && i< j ){
                i++;
            }
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
       }

        arr[left] = arr[i];
        arr[i] = base;
quickSort3(arr,left,i-1);
quickSort3(arr,i+1,right);

    }
}