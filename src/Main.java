import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0, n = arr.length; i < n; i++) {
            arr[i] = new Random().nextInt(49) + 1;
        }

        vyvod(arr);

        mergeSort(arr);

        vyvod(arr);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = arr[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = arr[i];

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0, j = 0, idx = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[idx++] = l[i++];
            } else {
                arr[idx++] = r[j++];
            }
        }

        while (i < left) {
            arr[idx++] = l[i++];
        }
        while (j < right) {
            arr[idx++] = r[j++];
        }
    }

    private static void vyvod(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.print("\n");
    }
}