package bai6;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        
        Vector <SinhVien> dsSinhVien = new Vector<>();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap thong tin sinh vien thu " + (i+1) +": ");
            SinhVien sv = new SinhVien();
            sv.Nhap();
            dsSinhVien.add(sv);
        }
                   
        Collections.sort(dsSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2){
                if (sv1.getDiemTrungBinh() == sv2.getDiemTrungBinh())
                    return Double.compare(sv2.getDiemRenLuyen(), sv1.getDiemRenLuyen());
                else
                    return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
            }
        });
        
        System.out.println("Danh sach sinh vien theo diem trung binh giam dan: ");
        for (SinhVien sv : dsSinhVien)
            sv.Xuat();
        
        System.out.println("Danh sach sinh vien sau khi loai bo cac sinh vien loai yeu: ");
        dsSinhVien.removeIf(s -> s.getDiemTrungBinh() < 5 || s.getDiemRenLuyen() < 50);
        for (SinhVien sv : dsSinhVien)
            sv.Xuat();
        
        int m;
        System.out.print("Nhap so luong sinh vien muon nhap vao danh sach 2: ");
        m = sc.nextInt();
        
        int k;
        System.out.print("Nhap vi tri muon chen danh sach 2 vao danh sach 1: ");
        k = sc.nextInt();
        
        for (int i = 0; i < m; i++){
            System.out.println("Nhap sinh vien thu " + (i+1) + ": ");
            SinhVien sv = new SinhVien();
            sv.Nhap();
            dsSinhVien.add(k + i, sv);
        }
        
        int dem = 0;
        System.out.println("Danh sach moi: ");
        for (SinhVien sv : dsSinhVien){
            sv.Xuat();
            if (sv.getDiemTrungBinh() >= 8.0 && sv.getDiemRenLuyen() >= 80)
                dem++;
        }
        
        System.out.print("So luong sinh vien dat loai Gioi la: " + dem);
    }

}
