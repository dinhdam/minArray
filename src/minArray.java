public class minArray {
    public static int minArray(int[]arr){
        int min = arr[0];
        int index =0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]< min){
                min= arr[i];
                index=i;
            }
        }
  return index;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minArray(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

}
