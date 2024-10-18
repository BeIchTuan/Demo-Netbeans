package bai8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class main {
    public static void main(String[] args){
        List<CauThu> dsCauThu = new ArrayList<>();
        int n;
        System.out.print("Nhap so luong cau thu: ");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            CauThu ct = new CauThu();
            ct.Nhap();
            dsCauThu.add(ct);
        }
        
        System.out.println("\nDanh sach cac cau thu la: ");
        for (CauThu ct : dsCauThu)
            ct.Xuat();
        
        System.out.println("Danh sach cac cau thu sau khi sap xep tang dan theo so ao: ");
        SortedSet<CauThu> sapXepSoAo = new TreeSet<>(
                Comparator.comparingInt(cauThu -> cauThu.getSoAo())
        );
        sapXepSoAo.addAll(dsCauThu);
        for (CauThu ct : sapXepSoAo)
            ct.Xuat();       
        
        HashSet<CauThu> locCauThu = new HashSet<>();
        String ten;
        String viTriDa;
        sc.nextLine();
        System.out.print("Nhap ten cau thu muon tim: ");
        ten = sc.nextLine();
        System.out.print("Nhap vi tri da muon tim: ");
        viTriDa = sc.nextLine();
         
        for (CauThu ct : dsCauThu)
            if (ct.getHoTen().equals(ten) || ct.getViTri(viTriDa) == 1)
                locCauThu.add(ct);
        
        System.out.println("\nDanh sach cau thu theo yeu cau: ");
        for (CauThu ct : locCauThu)
            ct.Xuat();
    }
}
