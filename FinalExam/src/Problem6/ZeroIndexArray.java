package Problem6;

import java.util.Arrays;

public class ZeroIndexArray {
    int[] items;

    public ZeroIndexArray(int[] items) {
        this.items = items;
    }

    public int[] preIndex(int index) {
        int[] result = Arrays.copyOf(this.items, index+1);
        return result;
    }

    public int[] postIndex(int index) {
        int[] result = Arrays.copyOfRange(this.items, index,this.items.length);
        return result;
    }

    public int maximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
