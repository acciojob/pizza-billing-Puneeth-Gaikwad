package com.driver;
public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill="";
    private boolean isChesseAdded=false;
    private boolean isToppingsAdded=false;
    private int vegPrice=300;
    private int nonVegPrice=400;
    private int cheese=80;
    private int vegToppings=70;
    private int nonVegToppings=120;
    private int paperbag=20;
    private boolean isTakeAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true) {
        	price+=vegPrice;
        	bill=bill+"Base Price of The Pizza: "+ vegPrice+"\n";
        }
        else {
        	price+=nonVegPrice;
        	bill=bill+"Base Price of The Pizza: " +nonVegPrice+ "\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
     
    	if(isChesseAdded==false) {
    		price+=cheese;
    		isChesseAdded=true;
    	}
    }

    public void addExtraToppings(){

    	
    	if(isToppingsAdded==false) {
    		if(isVeg==true) {
    		price+=vegToppings;
    		isToppingsAdded=true;
    	}
    		else {
        		price+=nonVegToppings;
        		isToppingsAdded=true;
    		}
    	}
    }

    public void addTakeaway(){     
    	if(isTakeAway==false) {
    	price=price+paperbag;
    	isTakeAway=true;
    	}
    	
    }

    public String getBill(){
    	if(isChesseAdded==true) {
    		bill=bill+"Extra Cheese Added: " + cheese+"\n";
    	}
    	if(isToppingsAdded==true && isVeg==true) {
    		bill=bill+"Extra Toppings Added: " + vegToppings+"\n";
    	}
    	if(isToppingsAdded==true && isVeg==false) {
    		bill=bill+"Extra Toppings Added: " + nonVegToppings +"\n";
    	}
    	if(isTakeAway==true) {
    		bill=bill+"paperbag Added: " + paperbag +"\n";
    	}
        return this.bill+"Total Price: "+(price)+"\n";
    }

}
