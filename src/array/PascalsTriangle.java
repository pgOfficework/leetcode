package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(10);

        for (List<Integer> l:generate){

            for (Integer i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();

        Integer[] prev = new Integer[0];

        for (int i = 1; i <= numRows; i++) {

            Integer[] temp= new Integer[i];

            System.out.println(temp.length);
            temp[0]=1;
            temp[i-1]=1;


            if(i>2) {
                int start=1;
                int end=i-2;
                while (start <= end) {
                    System.out.println("in");
                    temp[start] = prev[start] + prev[start-1];
                    start++;

                    temp[end] = prev[end] + prev[end - 1];
                    end--;
                }
            }

            System.out.println(Arrays.stream(temp).toList());
            System.out.println();



            prev= temp;
            list.add(Arrays.asList(temp));

        }

        return list;
    }

}
