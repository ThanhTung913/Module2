package OOP;

import java.util.Scanner;

public class NhapXuatSinhVien {
    private int msv;
    private String name;
    private float diemLT;
    private float diemTH;

    public NhapXuatSinhVien(){

    }
    public NhapXuatSinhVien(int msv, String name, float diemLT, float diemTH) {
        this.msv = msv;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTB(){
        return ((this.diemLT + this.diemTH)/2);
    }

    @Override
    public String toString() {
        return "NhapXuatSinhVien{" +
                "msv=" + msv +
                ", name='" + name + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
    public void inSV(){
        System.out.println(this.msv +" " +  this.name + "  " +  this.diemLT + " " + this.diemTH + " " +  diemTB());
    }

    public static void main(String[] args) {
        NhapXuatSinhVien nhap = new NhapXuatSinhVien(2,"Dung",2,2);
        nhap.inSV();
    }

}
