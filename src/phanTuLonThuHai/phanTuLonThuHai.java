package phanTuLonThuHai;

public class phanTuLonThuHai {
    public static void main(String[] args) {
        int[] arr = {81, 56, 8, 999, 100, 101, 8};
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int block;
            if (max2 < arr[i]) {
                max2 = arr[i];
                if (max2 > max) {
                    block = max;
                    max = max2;
                    max2 = block;
                }
            }
        }
        System.out.println("gia tri lon t2 la: " + max2);
    }
}
