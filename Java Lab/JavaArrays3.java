//3  WAP that add 10 to each element of array and print numbers that are smaller than 50.

class JavaArrays3{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,50,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]+10;
            if (arr[i]>50) {
                System.out.println(arr[i]);
            }
        }
    }
}