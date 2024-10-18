package bai9;

import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private String maSV;
    private double diemTB;
    
    public SinhVien(){
        
    }
    
    public SinhVien(String hoTen, String maSV, double diemTB) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemTB = diemTB;
    }
    
    public void Nhap(){
        System.out.print("Nhap ho ten: ");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.print("Nhap ma so sinh vien: ");
        maSV = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTB = sc.nextDouble();
    }
    
    public void Xuat(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma so sinh vien: " + maSV);
        System.out.println("Diem trung binh: " + diemTB);
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(this.diemTB, o.diemTB);
    }
}
