package edu.ucsb.cs56.pconrad.menuitem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Menu {
	
    private ArrayList<MenuItem> menuitems;

    public Menu() {
        menuitems = new ArrayList<MenuItem>();
    }

    public void add(MenuItem mi) {
	   menuitems.add(mi);
    }

    public String csv() {
        String result = "";

    	for(int i = 0; i < menuitems.size(); i++){
    	    result = result + (menuitems.get(i)).toString() + "\n";
    	}
	    
        return result;
    }


    public String csvSortedByPriceThenName() {
       return "stub";
    }

    public String csvSortedByName() {
        Collections.sort(menuitems, (o1,o2) -> (o1.getName()).compareTo(o2.getName()) );
        
        String result = "";

        for(int i = 0; i < menuitems.size(); i++){
            result = result + (menuitems.get(i)).toString() + "\n";
        }
        
        return result;
    }

    public String csvSortedByCategoryThenName() {
        return "stub";

    }

    public String csvSortedByCategoryThenPriceDescendingThenByName() {
        return "stub";
    }
}
