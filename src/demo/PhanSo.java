package demo;

import java.util.Scanner;

public class PhanSo {
    private int tu, mau;
    private int ucln;

    public PhanSo(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {

    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUSCLN(int a, int b) {
        for (int i = 2; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
        return ucln;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so ");
        tu = sc.nextInt();
        System.out.println("Nhap mau so");
        mau = sc.nextInt();
    }

    public void output() {
        System.out.println("Phan so vua nhap la "+getTu() + "/" + getMau());
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tong hai phan so la  " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hieu hai phan so la " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tich hai phan so la " + phanSoTich.tu + "/" + phanSoTich.mau);
    }

    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thuong hai phan so la " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
}

