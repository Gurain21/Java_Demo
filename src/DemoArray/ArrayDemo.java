package DemoArray;

public class ArrayDemo {
    public static void main(String[] args) {
        //数组的创建：
        int[] a =new int[5];
        String[] b = new String[6];
        boolean[] c = new boolean[7];
        //数组的赋值
//        a[0] = 0;
//        a[1] = 2;
//        a[2] = 1;
//        a[3] = 6;
//        a[4] = 7;
//数组遍历  变量声明后没有默认值，但是数组有默认值
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    //数组创建语法：先声明
        int[] array1;
        array1 =new int[3];//再分配空间
        //声明并分配空间
        int[]array2 = new int[10];
        //声明并赋值
        int[] array3 = new int[]{1,2,3,4,5,6};
        System.out.println(a);
        int[]  arr4 = {1,3,4,5,6,};
    }

}
