/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twolistcompare;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author SteveWang
 */
public class TwoListCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> big = new ArrayList<String>();
        big.add("blue");
        big.add("blue");
        big.add("blue");
        big.add("red");
        big.add("green");
        big.add("yellow");
        big.add("red");
        big.add("blue");
        big.add("blue");
        big.add("blue");
        ArrayList<String> small = new ArrayList<String>(big);
        small.remove("green");
        // TODO code application logic here
        System.out.println(big);
        System.out.println(small);
        
        System.out.println(nonDuplicateTwoList(big,small));
        
    }
    
    public static Set<String> nonDuplicateTwoList(List<String> list1, List<String> list2 ) {
        //return a set of non duplicates
        Set<String> set1 = new HashSet<String>(list1);
        Set<String> set2 = new HashSet<String>(list2);
        Set<String> set3 = new HashSet<String>();
        for (String i:set1){
            if (!set2.contains(i)){
                set3.add(i);
                
            }
            
        }
        
    return set3;
    }
    
}
