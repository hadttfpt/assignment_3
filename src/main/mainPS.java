package main;
import demo.PhanSo;

public class mainPS {

    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo();
        PhanSo phanSo2=new PhanSo();
        phanSo1.input();
        phanSo2.input();
        phanSo1.output();
        phanSo2.output();
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }

}
