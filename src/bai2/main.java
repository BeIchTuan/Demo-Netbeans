package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    enum Color {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
    enum Size {S, M, L, XL, XXL}
    
    public static void main(String[] args){
        Random ran = new Random();
        int n = ran.nextInt(11) + 5;
        List<Shirt> shirt = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            int randomColor = 1 + ran.nextInt(7);
            int randomSize = 1 + ran.nextInt(5);
            
            Size sizeTemp = Size.L;
            Color colorTemp = Color.BLUE;
            
            switch(randomColor){
                case 1: 
                    colorTemp = Color.BLUE;
                    break;
                case 2:
                    colorTemp = Color.GREEN;
                    break;
                case 3:
                    colorTemp = Color.INDIGO;
                    break;
                case 4:
                    colorTemp = Color.ORANGE;
                    break;
                case 5:
                    colorTemp = Color.RED;
                    break;
                case 6:
                    colorTemp = Color.VIOLET;
                    break;
                case 7:
                    colorTemp = Color.YELLOW;
                    break;
            }
            
            switch(randomSize){
                case 1:
                    sizeTemp = Size.L;
                    break;
                case 2:
                    sizeTemp = Size.M;
                    break;
                case 3:
                    sizeTemp = Size.S;
                    break;  
                case 4:
                    sizeTemp = Size.XL;
                    break;
                case 5:
                    sizeTemp = Size.XXL;
                    break;
            }
            
            Shirt temp = new Shirt(sizeTemp, colorTemp);
            shirt.add(temp);
        }
        
        System.out.println("Co " + n + " ao: ");
        for (Shirt temp : shirt)
            temp.Xuat();
    }
}
