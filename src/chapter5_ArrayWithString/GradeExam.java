package chapter5_ArrayWithString;

public class GradeExam {
    public static void main(String[] args) {
        char[][] answer = {//定义存储学生答案的数组
                {'A', 'B', 'C', 'D', 'E', 'E', 'A', 'D', 'E', 'A'},
                {'B', 'C', 'C', 'D', 'A', 'E', 'D', 'C', 'E', 'A'},
                {'D', 'C', 'E', 'A', 'B', 'C', 'C', 'D', 'A', 'E'},
                {'B', 'C', 'C', 'C', 'E', 'A', 'D', 'A', 'E', 'D'},
                {'B', 'C', 'C', 'D', 'A', 'E', 'D', 'C', 'E', 'A'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    for (int i = 0; i< answer.length;i++){
        int count = 0; //记录答对的题目个数
        for (int j  = 0;j<answer[i].length;j++){
            if (answer[i][j]==keys[j]){//判断学生的答案是否和标准答案一致
                count++;

            }
        }
        System.out.println("学生"+i+"答对题目的个数为："+count);

    }
    }


}
