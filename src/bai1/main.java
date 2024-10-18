package bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String strA;
        String strB;
        
        System.out.print("Nhap chuoi A: ");
        Scanner sc = new Scanner(System.in);
        strA = sc.nextLine();
        
        System.out.print("Nhap chuoi B: ");
        strB = sc.nextLine();
        
        int dem = demSoLanXuatHien(strA, strB);
        System.out.println("So lan xuat hien cua chuoi B trong chuoi A la: " + dem);
        
        String strC = strA.replace(" ", "");
        System.out.println("Chuoi A sau khi bo het ki tu khoang cach: " + strC);
        
        String chuoiDoiXung = new String();
        for (int i = strA.length() / 2; i >= 0; i--){
            chuoiDoiXung += strA.charAt(i);
        }
        
        if (strA.contains(chuoiDoiXung))
            System.out.println("Chuoi " + strA + " khong doi xung");
        else
            System.out.println("Chuoi " + strA + " co doi xung");
        
        //StringBuilder strD = new StringBuilder(strA);
        String strD;
        strD = daoChuoi(strA);
        System.out.print("Chuoi A sau khi dao nguoc: " + strD);
    }
    
    public static int demSoLanXuatHien(String str, String subString){
        int dem = 0;
        
        int viTri = str.indexOf(subString);
        while (viTri != -1) {       
            dem++;       
            viTri = str.indexOf(subString, viTri + subString.length());
        }
        return dem;
    }
    
    public static String daoChuoi(String str){
        String chuoiDaoNguoc = new String();
        String[] temp = str.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String tu : temp){
            StringBuilder tuDaoNguoc = new StringBuilder(tu);
            tuDaoNguoc.reverse();
            sb.append(tuDaoNguoc);
            sb.append(" ");
        }
        
        return sb.toString();
    }
}
