public class BinarySearching {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */

    }
    public static int binarySearch(int[] list, int key){
        int  low = 0;
        int high = list.length-1;
        int mid;
        while (high>=low){
            mid = (high+low)/2;
            if (list[mid]==key){
                return mid;
            } else if (list[mid]<key){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
