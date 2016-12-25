package search.binary;

/**
 * Created by willo on 12/21/16.
 */
public class BinarySearch {

  public static int binarySearch(int p, int[] list) {
    int low = 0;
    int high = list.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (list[mid] == p) {
        return mid;
      } else if (list[mid] > p) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}
