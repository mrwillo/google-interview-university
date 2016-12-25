package sort;

import java.util.Arrays;

/**
 * Created by willo on 12/25/16.
 */
public class BubbleSort {
  public static void sort(int[] arr) {
    for (int j=0; j<arr.length; j++) {
      for (int i=0; i<arr.length-1;i++) {
        if (arr[j] < arr[i]) {
          int tmp = arr[j];
          arr[j] = arr[i];
          arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
      }
    }

  }
}
