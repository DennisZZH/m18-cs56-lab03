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
       
       Comparator<MenuItem> byPriceThenName = new Comparator<MenuItem>(){
       		public int compare(MenuItem m1, MenuItem m2){
       			if (m1.getPriceInCents() == m2.getPriceInCents()){
       				return m1.getName().compareTo(m2.getName());
       			}else{
       				return m1.getPriceInCents() - m2.getPriceInCents();
       			}
       		}
       };

       Collections.sort(menuitems, byPriceThenName);

       String result = "";

        for(int i = 0; i < menuitems.size(); i++){
            result = result + (menuitems.get(i)).toString() + "\n";
        }
        
        return result;
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
         Comparator<MenuItem> byCategoryThenName = new Comparator<MenuItem>(){
       		public int compare(MenuItem m1, MenuItem m2){
       			if (m1.getCategory() == m2.getCategory()){
       				return m1.getName().compareTo(m2.getName());
       			}else{
       				return m1.getCategory().compareTo(m2.getCategory());
       			}
       		}
       };

       Collections.sort(menuitems, byCategoryThenName);

       String result = "";

        for(int i = 0; i < menuitems.size(); i++){
            result = result + (menuitems.get(i)).toString() + "\n";
        }
        
        return result;
     }

    

    public String csvSortedByCategoryThenPriceDescendingThenByName() {
		
		Comparator<MenuItem> byCategoryThenPriceDescendingThenName = new Comparator<MenuItem>(){
		       		public int compare(MenuItem m1, MenuItem m2){
		       			if (m1.getCategory() == m2.getCategory()){
		       				if(m1.getPriceInCents() == m2.getPriceInCents()){
		       					return m1.getName().compareTo(m2.getName());
		       				}else{
		       					return m2.getPriceInCents() - m1.getPriceInCents();
		       				}
		       			}else{
		       				return m1.getCategory().compareTo(m2.getCategory());		       			}	
		       		}
		       };

		       Collections.sort(menuitems, byCategoryThenPriceDescendingThenName);

		       String result = "";

		        for(int i = 0; i < menuitems.size(); i++){
		            result = result + (menuitems.get(i)).toString() + "\n";
		        }
		        
		        return result;
    }

}
