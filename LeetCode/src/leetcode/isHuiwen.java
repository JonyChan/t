package leetcode;

import java.util.Scanner;

/**
 * Created by chenxu
 * Date 2020/1/1714:42
 * Program LeetCode
 * Description
 */
public class isHuiwen {
    public static void main(String [] args){
        System.out.println("please input a number:");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println(a);
        System.out.println(new isHuiwen().solution(a));
    }

    public boolean solution(int a){
        String s = String.valueOf(a);
        String [] ss = s.split("");
        String sss = "";
        for(int i = ss.length-1;i>=0;i--){
            sss += ss[i];
        }
        System.out.println(sss);
        if(s.equals(sss)){
            return true;
        }else {
            return false;
        }
    }
}
