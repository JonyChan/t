package leetcode;

/**
 * Created by chenxu
 * Date 2020/1/1414:52
 * Program LeetCode
 * Description
 */
public class Test1 {

    private int id;
    private static int nextID;

   public Test1(int id,int nextID){
       this.id = id;
       this.nextID = nextID;
   }




    public static void main(String [] args){
        int[] a = {1,2,3};
        System.out.println(a.toString());

        a = null;
        System.out.println(a);
        Test1 test = new Test1(1,2);
        System.out.println(test);
    }
}
