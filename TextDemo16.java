package text;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName:TextDemo16
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/26 16:02
 */
public class TextDemo16 {
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0 ; j--) {
                if(arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    public static void hellSort(int[] arr) {
        for (int i = 5; i >= 0; i-=2) {
            hell(i,arr);
        }
    }
    public static void hell(int gap,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - gap; j >= 0; j -= gap) {
                if(arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + gap] = tmp;
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void heapSort(int[] arr) {
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            upHeap(i,arr);
        }
    }
    public static void upHeap(int p,int[] arr) {
        int c = p * 2 + 1;
        while (c < arr.length) {
            if(c + 1 < arr.length && arr[c] < arr[c + 1]) c++;
            if(arr[c] > arr[p]) {
                int tmp = arr[c];
                arr[c] = arr[p];
                arr[p] = tmp;
                p = c;
                c = p * 2 + 1;
            } else {
                break;
            }
        }
    }

    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length - 1);
    }
    public static void quick(int[] arr,int left,int right) {
        if(left < right) {
            int piv = pivot(arr,left,right);
            quick(arr,left,piv - 1);
            quick(arr,piv + 1,right);
        }
    }
    public static int pivot(int[] arr,int left,int right) {
        int tmp = arr[left];
        while(left < right) {
            while(left < right && arr[right] > tmp) right--;
            arr[left] = arr[right];
            while(left < right && arr[left] < tmp) left++;
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    public static void mergeSort(int[] arr) {
        merSort(arr,0,arr.length - 1);
    }
    public static void merSort(int[] arr,int left,int right) {
        if(left >= right) return;
        int mid = (left + right) / 2;
        merSort(arr,left,mid);
        merSort(arr,mid + 1,right);

        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr,int left,int mid,int right) {
        int s1 = left;
        int s2 = mid + 1;
        int[] newArr = new int[right - left + 1];
        int k  =0;
        while(s1 <= mid && s2 <= right) {
            if(arr[s1] <= arr[s2]) {
                newArr[k++] = arr[s1++];
            } else {
                newArr[k++] = arr[s2++];
            }
        }
        while(s1 <= mid) {
            newArr[k++] = arr[s1++];
        }
        while(s2 <= right) {
            newArr[k++] = arr[s2++];
        }
        for (int i = 0; i < newArr.length; i++) {
            arr[i + left] = newArr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,5,9,25,14,3,20,31,36,45,1,7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
