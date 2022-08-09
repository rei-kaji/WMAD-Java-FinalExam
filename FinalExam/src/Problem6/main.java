package Problem6;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] =i;
        }
        ZeroIndexArray zeroIndexArray = new ZeroIndexArray(arr);

        System.out.println(Arrays.toString(zeroIndexArray.preIndex(2)));
        System.out.println(zeroIndexArray.maximum(arr));
    }
}
