package chapter5_ArrayWithString;

public class Exam_2 {
    /**
     * 该方法用于获取float数组的最大值、最小值、总和值
     * @param a 传入的double数组
     * @return 返回length为3的一个数组。分别为a的max值，a的min值和a的sum值。
     */
    static double[] max_min_ave(double[] a) {
        double res[] = new double[3];
        double max = a[0], min = a[0], sum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            sum += a[i];
        }
        res[0] = max;
        res[1] = min;
        res[2] = sum;
        return res;
    }

    public static void main(String[] args) {
        double[] a = {1.1,3.4,-9.9,10};
        double[] result = max_min_ave(a);
        for (int i  =  0; i< result.length;i++){
            System.out.println("result["+i+"] = "+result[i]);
        }
    }
}
