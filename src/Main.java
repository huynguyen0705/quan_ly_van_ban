import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("NHẬP 1 VĂN BẢN: ");
            Scanner scanner = new Scanner(System.in);
            String vb = scanner.nextLine();
            QuanLyVanBan quanLyVanBan = new QuanLyVanBan();
            quanLyVanBan.NhapVanBan(vb);
            System.out.println("QUẢN LÝ VĂN BẢN");
            System.out.println("1. đếm số ký tự (h) trong xâu chuỗi không biệt chữ hoa và chữ thường ");
            System.out.println("2. Đếm số từ trong xâu");
            System.out.println("3. Chuẩn hoá chuỗi xoá nhiều khoảng trắng thành một");
            System.out.println("4. thoát");
            int input = scanner.nextInt();
            if (input < 1 || input > 4) {
                System.out.println("nhập sai");
            }
            else if (input == 1){
                System.out.println("số ký tự h và H trong xâu chuỗi là: ");
                System.out.println(quanLyVanBan.DemKyTuTrongXauChuoi());
            }
            else if (input == 2){
                System.out.println("Số từ trong xâu chuỗi là: ");
                System.out.println(quanLyVanBan.DemTuTrongXau());
            }
            else if (input == 3){
                System.out.println("văn bản sau khi chuẩn hoá là: ");
                System.out.println(quanLyVanBan.ChuanHoaChuoi(vb));
            }
            else if (input == 4){
                isRunning = false;
            }
        }
    }
}