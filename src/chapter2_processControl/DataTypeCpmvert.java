package chapter2_processControl;
/*
强制类型转换    (int)("20")  (char)(12)  使用 (转换类型)值
 */
public class DataTypeCpmvert {
    public static void main(String[] args) {
        char c1 ='a',c2 = 'b',c3;
        int x1 = 10,x2,x3;
        float y1 = 20.56F,y2;
        c3 = (char)(c1 +c2);
        x2 = x1 + c1;//     a 的编码值为：97   故 x1 + c1 = 10 + 97
        x3 =(int)(x1 + y1);//     转型后为int类型，小数点后直接抹零

        y2 = x1 * y1;
        System.out.println("c3 ="+c3+ ", x2 = "+ x2+ ", x3 = "+ x3);
        System.out.println("y2 = "+y2);
    }
}
