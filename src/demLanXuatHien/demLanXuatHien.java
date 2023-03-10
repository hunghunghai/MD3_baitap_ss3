package demLanXuatHien;

import java.util.Scanner;

public class demLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo và nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        // Bước 2: Khai báo và nhập ký tự cần đếm
        System.out.print("Nhập ký tự cần đếm: ");
        char c = scanner.nextLine().charAt(0);
        // Bước 3: Khai báo biến đếm
        int count = 0;
        // Bước 4: Sử dụng vòng lặp để duyệt từng ký tự trong chuỗi và đếm số ký tự cần đếm
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        // Bước 5: In ra kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + c + "' trong chuỗi là " + count);
    }
}
