package edu.ucsb.cs56.pconrad.menuitem;
import java.util.ArrayList;

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

	for(MenuItem i in menuitems){
	    result = i.toString() + "/n";
	}

	return result;
    }


    public String csvSortedByPriceThenName() {
       return "stub";
    }

    public String csvSortedByName() {
        return "stub";
    }

    public String csvSortedByCategoryThenName() {
        return "stub";

    }

    public String csvSortedByCategoryThenPriceDescendingThenByName() {
        return "stub";
    }
}
