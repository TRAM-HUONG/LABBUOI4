package labtuan4;

import java.util.Scanner;

class hanghoa {
    private String mahang;
    private String tenhang;
    private long dongia;

    public hanghoa() {
        this.mahang = "";
        this.tenhang = "";
        this.dongia = 0;
    }

    public hanghoa(String mahang, String tenhang, long dongia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
    }

    public String getmahang() {
        return mahang;
    }

    public String gettenhang() {
        return tenhang;
    }

    public long getdongia() {
        return dongia;
    }
}

class hangdienmay extends hanghoa {
    private int thoigianbaohanh;
    private int dienap;
    private int congsuat;

    public hangdienmay() {
        super();
    }

    public hangdienmay(String mahang, String tenhang, long dongia, int thoigianbaohanh, int dienap, int congsuat) {
        super(mahang, tenhang, dongia);
        this.thoigianbaohanh = thoigianbaohanh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }

    public int getthoigianbaohanh() {
        return thoigianbaohanh;
    }

    public int getdienap() {
        return dienap;
    }

    public int getcongsuat() {
        return congsuat;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap thoi gian bao hanh: ");
        thoigianbaohanh = scanner.nextInt();
        System.out.print("nhap dien ap: ");
        dienap = scanner.nextInt();
        System.out.print("nhap cong suat: ");
        congsuat = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("ma hang: " + getmahang()
                + ", ten hang: " + gettenhang()
                + ", don gia: " + getdongia()
                + ", thoi gian bao hanh: " + thoigianbaohanh
                + ", dien ap: " + dienap
                + ", cong suat: " + congsuat);
    }
}

class hangthucpham extends hanghoa {
    private String ngaysanxuat;
    private String ngayhethan;

    public hangthucpham() {
        super();
    }

    public hangthucpham(String mahang, String tenhang, long dongia, String ngaysanxuat, String ngayhethan) {
        super(mahang, tenhang, dongia);
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethan = ngayhethan;
    }

    public String getngaysanxuat() {
        return ngaysanxuat;
    }

    public String getngayhethan() {
        return ngayhethan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay san xuat: ");
        ngaysanxuat = scanner.nextLine();
        System.out.print("nhap ngay het han: ");
        ngayhethan = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("ma hang: " + getmahang()
                + ", ten hang: " + gettenhang()
                + ", don gia: " + getdongia()
                + ", ngay san xuat: " + ngaysanxuat
                + ", ngay het han: " + ngayhethan);
    }
}

public class bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        hangdienmay dienmay = new hangdienmay("dm001", "tivi", 5000000, 12, 220, 100);
        System.out.println(" thong tin hang dien may");
        dienmay.nhap();
        System.out.println("thong tin hang dien may:");
        dienmay.xuat();

        hangthucpham thucpham = new hangthucpham("tp001", "gao", 20000, "01/03/2025", "01/09/2025");
        System.out.println("thong tin hang thuc pham");
        thucpham.nhap();
        System.out.println("thong tin hang thuc pham:");
        thucpham.xuat();
    }
}
