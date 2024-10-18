package bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CauThu {
    private String hoTen;
    private int soAo;
    private List<String> viTri = new ArrayList<>();
    
    public CauThu(){
        
    }
    
    public CauThu(String hoTen, int soAo, List<String> viTri) {
        this.hoTen = hoTen;
        this.soAo = soAo;
        this.viTri = viTri;
    }
    
    public void Nhap(){
        System.out.print("Nhap ten cau thu: ");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.print("Nhap so ao: ");
        soAo = sc.nextInt();
        System.out.println("Nhap cac vi tri da: ");
        int n;
        System.out.print("Nhap so luong vi tri: ");
        n = sc.nextInt();
        sc.nextLine();
        String s;
        for (int i = 0; i < n; i++){
            System.out.print("Nhap vi tri " + (i+1) + ": ");  
            s = sc.nextLine();
            viTri.add(s);
        }
    }
    
    public void Xuat(){
        System.out.println("Ho ten: " + hoTen + " - So ao: " + soAo);
        System.out.print("Vi tri da: ");
        for (String s : viTri)
            System.out.print(s + ", ");
        System.out.print("\n");
    }
    
    public int getSoAo(){
        return soAo;
    }
    
    public String getHoTen(){
        return hoTen;
    }
    
    public int getViTri(String vt){
        for (String s : viTri){
            if (s.equals(vt))
                return 1;
        }
        return 0;
    }
}
