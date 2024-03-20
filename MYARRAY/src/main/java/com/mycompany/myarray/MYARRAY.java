

package com.mycompany.myarray;
import java.util.ArrayList;


public class MYARRAY {
    

    public static void main(String[] args) {
        
        
        ArrayList<String> listas = new ArrayList<>();
        
        System.out.println(listas.size());
        System.out.println(listas.isEmpty());
        
        listas.add("hola");
         listas.add("mundo");
          listas.add("cuel");
        
          ArrayList<String> total = new ArrayList<>();
          total.add("nuevo");
          total.add("viejo");
          
          total.addAll(listas);
          System.out.println(total);
          
          
          
          listas.set(2, " puteria");
          listas.remove(0);
          System.out.println(listas);
          
          System.out.println(listas.get(0));
          
          
        
    }
}
