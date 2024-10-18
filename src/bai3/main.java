package bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException{
        GregorianCalendar lich = new GregorianCalendar();
        int nam = lich.get(Calendar.YEAR);
        int thuDangTim = lich.get(Calendar.DAY_OF_WEEK);
        
        if (laNamNhuan(nam))
            System.out.println("Nam " + nam + " la nam nhuan");
        else
            System.out.println("Nam " + nam + " khong la nam nhuan");
        
        int thuNgayDauTien = lich.get(Calendar.DAY_OF_WEEK);
        System.out.println("Ngay dau tien cua nam la thu " + thuNgayDauTien);
        
        Date ngay = new Date();
        SimpleDateFormat kieu1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat kieu2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat kieu3 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        
        System.out.println("\nHom nay la ngay: " + kieu1.format(ngay));
        System.out.println("Hom nay la ngay: " + kieu2.format(ngay));
        System.out.println("Hom nay la ngay: " + kieu3.format(ngay));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ngay (dd/MM//yyyy): ");
        String tempDate = sc.nextLine();
        Date thoiGian = kieu1.parse(tempDate);
        lich.setTime(thoiGian);
        nam = lich.get(Calendar.DAY_OF_WEEK);
        System.out.println("Ngay " + tempDate + " la thu " + getThu(nam));
        
        System.out.print("\nNhap ngay: ");
        String viDuD = sc.nextLine();
        thoiGian = kieu1.parse(viDuD);
        lich.setTime(thoiGian);
        
        int thang = lich.get((Calendar.MONTH));
        int nam1 = lich.get(Calendar.YEAR);
        lich.set(Calendar.DAY_OF_MONTH, 1);
        Date ngayDauTien = lich.getTime();
        lich.set(Calendar.MONTH, thang + 1);
        lich.set(Calendar.DAY_OF_MONTH, 0);
        Date ngayCuoiCung = lich.getTime();
        
        System.out.println("Ngay dau tien cua thang: " + (thang + 1) + "/" + nam1 + ": " + kieu1.format(ngayDauTien));
        System.out.println("Ngay cuoi cung cua thang: " + (thang + 1) + "/" + nam1 + ": " + kieu1.format(ngayCuoiCung));
    }
    
    public static boolean laNamNhuan(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
    
    public static String getThu(int ngay) {
        switch (ngay) {
            case 1:
                return "Chu Nhat";
            case 2:
                return "Thu hai";
            case 3:
                return "Thu ba";
            case 4:
                return "Thu tu";
            case 5:
                return "Thu nam";
            case 6:
                return "Thu sau";
            case 7:
                return "Thu bay";
            default:
                return "";
        }
    }
}