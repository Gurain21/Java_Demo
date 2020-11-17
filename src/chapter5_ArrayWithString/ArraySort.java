package chapter5_ArrayWithString;

//冒泡排序展示：
/*
冒泡排序是一种简单的交换排序，其基本思路是，从数组左边开始扫描待排序的元素，在扫描的过程中一次对相邻元素进行比较，
    将较大值元素下标后移，没经过一轮排序后，值最大的元素将移到末尾，此时几下该元素的位置，下一轮排序只需要比较到此位置即可
    不断重复知道比较最后两个元素。
  对n个元素冒泡排序时，总共需要进行 n-1轮，第一轮只需要比较n-1次，第二轮需要比较n-2次，第i轮需要比较n-i次，最后一轮需要比较1次

 */
public class ArraySort {
    public static void main(String[] args)  {
        //new一个int类型的数组
        int[] ary = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
        System.out.println("数组排列前的顺序为：");
        for (int a : ary) {
            System.out.print(a + " ");
        }
        int[] temp = new int[ary.length];
//        MaoPao.sort(ary, 0, ary.length - 1);//冒泡排序，从0开始，到 length-1结束。
//        Quick.sort(ary, 0, ary.length - 1);
        MergeSort obj = new MergeSort();
        MergeSort.main2(args);
        merger2.mergeSort(ary,0,ary.length-1,temp);
        System.out.println();//换行
        System.out.println("数组排列后的顺序为：");
        for (int a : ary) {
            System.out.print(a + " ");
        }
    }
}

//冒泡排序
class MaoPao {
    private static int temp;

    public static void sort(int[] ary, int left, int right) {
        //进行判断，如果左边的索引比右边的索引大，这是不合法的，直接 return
        if (left > right) {
            return;
        }
        for (int i = left; i < right; i++) {
            for (int j = left; j < right - left - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
    }
}

//快速排序
/*
快速排序：会先把数组中的一个数当做基准数，一般会把数组中最左边的数当作基准数。然后从两边进行检索。
先从右边检索比基准数小的。再从左边检索比基准数大的。
如果检索到了，就停下，然后交换这两个元素，然后再继续检索。
i和j相遇时，把基准数和相遇位置的元素交换，第一轮排序结束
以后先排基准数左边，再排基准数右边，方式和第一轮一样。
 */
class Quick {
    private static int temp;

    public static void sort(int[] ary, int left, int right) {
        //进行判断，如果左边的索引比右边的索引大，这是不合法的，直接 return
        if (left > right) {
            return;
        }
        int base = ary[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (ary[j] >= base && i < j) {
                j--;
            }
            while (ary[i] <= base && i < j) {
                i++;
            }
            temp = ary[i];
            ary[i] = ary[j];
            ary[j] = temp;

        }
        ary[left] = ary[i];
        ary[i] = base;
        sort(ary, left, i - 1);
        sort(ary, i + 1, right);
    }
}

//选择排序：
/*
如果有N个元素需要排序，那么首先从N个元素中找到最小的那个元素与第0位置上的元素交换
（说明一点，如果没有比原本在第0位置上的元素小的就不用交换了，后面的同样是），
然后再从剩下的N-1个元素中找到最小的元素与第1位置上的元素交换，
之后再从剩下的N-2个元素中找到最小的元素与第2位置上的元素交换，.......
直到所有元素都排序好（也就是直到从剩下的2个元素中找到最小的元素与第N-2位置上的元素交换）。
 */
class Choose {
    private static int temp;

    public static void sort(int[] ary, int left, int right) {
        for (int i = 0; i <= ary.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= ary.length - 1; j++) {
                if (ary[j] < ary[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = ary[i];
                ary[i] = ary[minIndex];
                ary[minIndex] = temp;
            }
        }
    }
}

class Merger {

    public static void sort(int[] ary, int start, int end, int[] temp) {
        if (start==end) return;
//            int mid = (start + end) / 2;
            int mid = start +(end-start)/2;  //优化。
            sort(ary, start, mid, temp);
            sort(ary, mid + 1, end, temp);
            merge(ary, start, mid, end, temp);

    }


    private static void merge(int[] ary, int leftPtr, int rightPtr, int rightBound, int[] temp) {
//        int mid = rightPtr-1;
        int i = leftPtr, j = rightPtr,k = 0;
        while (i <= rightPtr-1 && j <= rightBound) {
            temp[k++] = ary[i] <= ary[j] ? ary[i++] : ary[j++];
//            if (ary[i]<=ary[j]){
//                temp[k++] = ary[i++];
//            }else {
//                temp[k++]= ary[j++];
//            }
        }
        while (i <= rightPtr-1) temp[k++] = ary[i++];
        while (j <= rightBound) temp[k++] = ary[j++];
        //排序到这里、temp这个数组就是有序的了；然后遍历temp，把值给ary
        for (int t = 0; t < k; t++) {
            ary[leftPtr+t] = temp[t];
        }
    }
}
class merger2{
    public static void merge(int[] arr,int low,int mid,int high,int[] tmp){
        int i = 0;
        int j = low,k = mid+1;  //左边序列和右边序列起始索引
        while(j <= mid && k <= high){
            tmp[i++] = arr[j] <arr[k] ? arr[j++]:arr[k++];
//            if(arr[j] < arr[k]){
//                tmp[i++] = arr[j++];
//            }else{
//                tmp[i++] = arr[k++];
//            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tmp[i++] = arr[j++];
        }

        while(k <= high){
            tmp[i++] = arr[k++];
        }

        for(int t=0;t<i;t++){
            arr[low+t] = tmp[t];
        }
    }

    public static void mergeSort(int[] arr,int low,int high,int[] tmp){
        if(low<high){
            int mid = low +(high- low)/2;
//            int mid = (low+high)/2;
            mergeSort(arr,low,mid,tmp); //对左边序列进行归并排序
            mergeSort(arr,mid+1,high,tmp);  //对右边序列进行归并排序
            merge(arr,low,mid,high,tmp);    //合并两个有序序列
        }

    }

}
//    void Merge(int arr[], int low, int mid, int high, int &ans[]) {
//        //low->mid区间元素有序,mid+1->high区间元素有序,将两区间合并
//        int p_left = low, p_right = mid + 1, p_result = low;
//        while(p_left <= mid && p_right <= high) {
//            if(arr[p_left] <= arr[p_right])
//                ans[p_result++] = arr[p_left++];
//            else
//                ans[p_result++] = arr[p_right++];
//        }
//        //循环之后肯定有一个指针先到达了终界值，然后将剩余元素一次放入数组尾
//        while(p_left <= mid)
//            ans[p_result++] = arr[p_left++];
//        while(p_right <= high)
//            ans[p_result++] = arr[p_right++];
//        return;
//    }
//
//    void MergeSort(int arr[], int low, int high, int &ans[], int &tmp[]) {
//        if(low == high) //递归边界
//            ans[low] = arr[low];
//        else {
//            int mid = (low + high) / 2;
//            MergeSort(arr, low, mid, tmp);
//            MergeSort(arr, mid+1, high, tmp);
//            Merge(tmp, low, mid, high, ans);
//        }
//        return;
//    }
class MergeSort {
    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h)
            return new int[] { nums[l] };

        int mid = l + (h - l) / 2;
        int[] leftArr = mergeSort(nums, l, mid); //左有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组
        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }
    public static void main2(String[] args) {
        int[] nums = new int[] { 3, 5, 0, 1, 4, 7, 6, 9, 2 };
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        for (int x : newNums) {
            System.out.println(x);
        }
    }
}