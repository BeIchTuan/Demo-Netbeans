package bai2;

import bai2.main.Color;
import bai2.main.Size;

public class Shirt {
    private Size size;
    private Color color;
    
    Shirt(){
        size = Size.L;
        color = Color.BLUE;
    }
    
    Shirt(Size s, Color c){
        size = s;
        color = c;
    }
    
    Shirt(Shirt s){
        size = s.size;
        color = s.color;
    }
    
    public void Xuat(){
        System.out.println("Ao co size: " + size + " - mau " + color);
    }
}