package search.binary;

/**
 * Created by willo on 12/21/16.
 */
public class Main {
  public static void main(String[] args){
    int[] list = {1,3,5,8,9,12,55,67,89,123,456,789};
    int p = 55;
    System.out.println(BinarySearch.binarySearch(p, list));
  }
}
