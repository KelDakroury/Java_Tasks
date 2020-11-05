import java.util.*;

public class T1Quicksort {

    public static void main(String args[]) {
    	Scanner Q = new Scanner(System.in);
    	System.out.println("enter the size of the array");
        int n = Q.nextInt();
        int[] unsorted = new int[n];
        System.out.println("Enter numbers");
        for(int i = 0; i < n; i++)
        	unsorted[i] = Q.nextInt();
        System.out.println("Unsorted array : " + Arrays.toString(unsorted));
        iterativeQsort(unsorted);
        System.out.print("Sorted array: [ ");  
        for(int i = unsorted.length-1; i >= 1; i--) 
        	System.out.print(unsorted[i] + " , ");
        System.out.println(unsorted[0] + " ]");
    }
    
    public static void iterativeQsort(int[] numbers) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(numbers.length);

        while (!stack.isEmpty()) {
            int end = (int) stack.pop();
            int start = (int) stack.pop();
            if (end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = partition(numbers, p, start, end);

            stack.push(p + 1);
            stack.push(end);

            stack.push(start);
            stack.push(p);

        }
    }

    
    private static int partition(int[] input, int position, int start, int end) {
        int l = start;
        int h = end - 2;
        int piv = input[position];
        swap(input, position, end - 1);

        while (l < h) {
            if (input[l] < piv) {
                l++;
            } else if (input[h] >= piv) {
                h--;
            } else {
                swap(input, l, h);
            }
        }
        int idx = h;
        if (input[h] < piv) {
            idx++;
        }
        swap(input, end - 1, idx);
        return idx;
    }

    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}