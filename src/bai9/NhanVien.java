package bai9;

import java.util.Scanner;

public class NhanVien implements Comparable <NhanVien>{
    private String hoTen;
    private String maNV;
    private long luong;
    
    public NhanVien(){
        
    }
    
    public NhanVien(String hoTen, String maNV, long luong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.luong = luong;
    }
    
    public void Nhap(){
        System.out.print("Nhap ho ten: ");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.print("Nhap ma so nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap muc luong: ");
        luong = sc.nextLong();
    }
    
    public void Xuat(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma so nhan vien: " + maNV);
        System.out.println("Muc luong: " + luong);
    }

    @Override
    public int compareTo(NhanVien o) {
        return Double.compare(this.luong, o.luong);
    }
}
