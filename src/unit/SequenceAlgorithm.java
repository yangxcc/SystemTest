package unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceAlgorithm {

    // 数组转化成字符串，便于输出
    String ArrayTransferString(int[] arr){
        String sb = new String();
        for (int i=0; i<arr.length;i++){
            sb = sb + arr[i] + ",";
        }
        return sb.substring(0,sb.length()-1);
    }

    // 冒泡排序
    int[] BubbleSort(int[] arr){
        int len = arr.length;
        for (int i=0; i<len; i++){
            for (int j=0; j<len-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // 选择排序
    int[] SelectSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index == i)
                continue;
            else {
                int temp;
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    // 插入排序
    int[] InsertSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j;
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    // 希尔排序
    int[] ShellSort(int arr[]){
        int increasement = arr.length;
        int i, j, k;
        do
        {
            // 确定分组的增量
            increasement = increasement / 3 + 1;
            for (i = 0; i < increasement; i++)
            {
                for (j = i + increasement; j < arr.length; j += increasement)
                {
                    if (arr[j] < arr[j - increasement])
                    {
                        int temp = arr[j];
                        for (k = j - increasement; k >= 0 && temp < arr[k]; k -= increasement)
                        {
                            arr[k + increasement] = arr[k];
                        }
                        arr[k + increasement] = temp;
                    }
                }
            }
        } while (increasement > 1);
        return arr;
    }
}
