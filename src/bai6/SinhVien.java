package bai6;

import java.util.Scanner;

public class SinhVien {
    private String mssv;
    private String hoTen;
    private double diemTrungBinh;
    private int diemRenLuyen;
    
    public SinhVien(){
        
    }
       
    public SinhVien(String mssv, String hoTen, double diemTrungBinh, int diemRenLuyen) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
        this.diemRenLuyen = diemRenLuyen;
    }
    
    public double getDiemTrungBinh(){
        return diemTrungBinh;
    }
    
    public int getDiemRenLuyen(){
        return diemRenLuyen;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        mssv = sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTrungBinh = sc.nextDouble();
        System.out.print("Nhap diem ren luyen: ");
        diemRenLuyen = sc.nextInt();
    }
    
    public void Xuat(){
        System.out.println("Ho va ten: " + hoTen + ", MSSV: " + mssv);
        System.out.println("Diem trung binh: " + diemTrungBinh + " - Diem ren luyen: " + diemRenLuyen);
    }
}
