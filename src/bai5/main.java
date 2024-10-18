package bai5;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String username;
        String email;
        String password;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap user name: ");
        username = sc.nextLine();
        
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        
        System.out.print("Nhap password: ");
        password = sc.nextLine();
        
        int check = 1;
        if (username.isEmpty() || email.isEmpty() || password.isEmpty())
            check = 0;
        else{
            if (username.matches("^(?=.{15,30}$)([A-Z][a-z]*\\\\s)*[A-Z][a-z]*$"))
                return;
            else
                check = 0;
            
            if (email.matches(("^[a-z][a-z0-9]*@[a-z]+\\.[a-z]+$")))
                return;           
            else
                check = 0;
        }
        
        if (check == 0)
            System.out.print(0 > 1);
        else {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        }
    }
}
