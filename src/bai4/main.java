package bai4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            String filePath = "D:\\test.txt";

            FileReader reader = new FileReader(filePath);
            BufferedReader bufferReader = new BufferedReader(reader);

            int n = Integer.parseInt(bufferReader.readLine());
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++){
                String numbers = bufferReader.readLine();
                arr[i] = Integer.parseInt(numbers);
            }
          
            Arrays.sort(arr);
            System.out.println("Day sau khi sap xep: ");
            for (int i : arr)
                System.out.print(i + " "); 
            
        } catch (Exception e){
            System.out.println("Loi khi doc file: " + e.getMessage());
        }
    }
}
