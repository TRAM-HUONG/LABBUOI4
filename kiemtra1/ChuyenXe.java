package kiemtra1;

import java.util.Scanner;

class Xe {
    private String soXe;
    private String loai;
    private String ngayDangKiem;
    private boolean trangThai;

    public Xe() {
        this.soXe = "";
        this.loai = "";
        this.ngayDangKiem = "";
        this.trangThai = true;
    }

    public Xe(Xe x) {
        this.soXe = x.soXe;
        this.loai = x.loai;
        this.ngayDangKiem = x.ngayDangKiem;
        this.trangThai = x.trangThai;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số xe: ");
        soXe = scanner.nextLine();
        System.out.print("Nhập loại xe: ");
        loai = scanner.nextLine();
        System.out.print("Nhập ngày đăng kiểm: ");
        ngayDangKiem = scanner.nextLine();
        System.out.print("Nhập trạng thái xe (true = được phép, false = không được phép): ");
        trangThai = scanner.nextBoolean();
        scanner.nextLine();
    }

    public void in() {
        System.out.println("Số xe: " + soXe + ", Loại: " + loai + ", Ngày đăng kiểm: " + ngayDangKiem + ", Trạng thái: " );
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public static void main(String[] args) {
        Xe x1 = new Xe();
        x1.nhap();
        System.out.println("Thông tin xe x1:");
        x1.in();

        Xe x2 = new Xe(x1);
        System.out.println("Thông tin xe x2 (sao chép từ x1):");
        x2.in();
    }
}

public class ChuyenXe extends Xe {
    private int maSoChuyen;
    private String tenLaiXe;
    private String noiDen;
    private double doanhThu;

    public ChuyenXe() {
        super();
    }

    public void nhapChuyenXe() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập mã số chuyến xe: ");
        maSoChuyen = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên người lái: ");
        tenLaiXe = scanner.nextLine();
        System.out.print("Nhập nơi đến: ");
        noiDen = scanner.nextLine();
        System.out.print("Nhập doanh thu: ");
        doanhThu = scanner.nextDouble();
        scanner.nextLine();
    }

    public void inChuyenXe() {
        super.in();
        System.out.println("Mã số chuyến xe: " + maSoChuyen + ", Tên người lái: " + tenLaiXe + ", Nơi đến: " + noiDen + ", Doanh thu: " + doanhThu);
    }

    public boolean chuyenXeBiHuy() {
        return (!getTrangThai() || doanhThu < 100000);
    }

    public double tinhLoiNhuan() {
        return doanhThu * 0.3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng chuyến xe: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        ChuyenXe[] danhSachChuyenXe = new ChuyenXe[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            danhSachChuyenXe[i] = new ChuyenXe();
            danhSachChuyenXe[i].nhapChuyenXe();
        }

        System.out.println("Danh sách các chuyến xe:");
        for (int i = 0; i < m; i++) {
            danhSachChuyenXe[i].inChuyenXe();
        }

        System.out.println("Các chuyến xe bị huỷ:");
        for (int i = 0; i < m; i++) {
            if (danhSachChuyenXe[i].chuyenXeBiHuy()) {
                System.out.println("Mã số chuyến xe: " + danhSachChuyenXe[i].maSoChuyen);
            }
        }

        double tongLoiNhuan = 0;
        for (int i = 0; i < m; i++) {
            tongLoiNhuan += danhSachChuyenXe[i].tinhLoiNhuan();
        }
        System.out.println("Tổng lợi nhuận của các chuyến xe: " + tongLoiNhuan);
    }
}
