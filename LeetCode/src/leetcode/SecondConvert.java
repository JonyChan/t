package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chenxu
 * Date 2020/1/1311:18
 * Program LeetCode
 * Description: 不用思考数值转换成为字符串，直接是用数值计算出结果的三个位数
 */
public class SecondConvert {
    public int convert(){
        System.out.print("please input a number:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int d = 0;
        if(i>=-9&&i<=9){
            d=i;
        }else {
            int a = i % 10;
            int b = i / 100;
            int c = (i - b * 100) / 10;
            d = a * 100 + c * 10 + b;
        }
        return d;
    }

    public static void main(String[] args){
        SecondConvert sc = new SecondConvert();
        System.out.println(sc.convert());
    }
}
