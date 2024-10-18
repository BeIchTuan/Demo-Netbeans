package bai7;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args){
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        
        hashTable.put(3, "OOP");
        hashTable.put(55, "JAVA");
        hashTable.put(23, "HashMap");
        
        HashMap <Integer, String> hashMap = new HashMap<>(hashTable);
        TreeMap <Integer, String> sort = new TreeMap<>(hashMap);
        
        for (Map.Entry<Integer, String> entry : sort.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
