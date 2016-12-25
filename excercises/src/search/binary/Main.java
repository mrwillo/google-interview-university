package search.binary;

import sort.BubbleSort;

import java.util.Arrays;

/**
 * Created by willo on 12/21/16.
 */
public class Main {
  public static void main(String[] args){
//    int[] list = {1,3,5,8,9,12,55,67,89,123,456,789};
    int[] list = {9,3,1,3,2,6,2,7,10,23,55,23,12};
    int p = 55;
//    System.out.println(BinarySearch.binarySearch(p, list));
    BubbleSort.sort(list);
    System.out.println(Arrays.toString(list));
  }
}
