package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        List<SinhVien> dsSinhVien = new ArrayList<>();
        List<NhanVien> dsNhanVien = new ArrayList<>();
        
        int n, m;
        System.out.print("Nhap so luong nhan vien: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        System.out.print("Nhap so luong sinh vien: ");
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            System.out.println("Nhap nhan vien thu " + (i+1) + ": ");
            NhanVien nv = new NhanVien();
            nv.Nhap();
            dsNhanVien.add(nv);
        }
        
        for (int i = 0; i < m; i++){
            System.out.println("Nhap sinh vien thu " + (i+1) + ": ");
            SinhVien sv = new SinhVien();
            sv.Nhap();
            dsSinhVien.add(sv);
        }
        
        System.out.println("\nDanh sach nhan vien: ");
        for (NhanVien nv : dsNhanVien)
            nv.Xuat();
        
        System.out.println("\nDanh sach sinh vien: ");
        for (SinhVien sv : dsSinhVien)
            sv.Xuat();
        
        System.out.println("\nThong tin sinh vien co diem trung binh cao nhat: ");
        SinhVien maxSinhVien = new SinhVien();
        for (SinhVien sv : dsSinhVien)
            maxSinhVien = max(sv, maxSinhVien);
        maxSinhVien.Xuat();
     
        System.out.println("\nThong tin nhan vien co luong cao nhat: ");
        NhanVien maxNhanVien = new NhanVien();
        for (NhanVien nv : dsNhanVien)
            maxNhanVien = max(nv, maxNhanVien);
        maxNhanVien.Xuat();
    }
    
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
