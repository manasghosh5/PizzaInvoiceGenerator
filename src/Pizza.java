public class Pizza {
    private int Price;
    private boolean veg;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int take = 20;
    private int basePizzaPrice;
    private boolean isExtraCheese = false;
    private boolean isExtraToppings = false;
    private boolean isTakeaway = false;
    private static boolean isVegPizza = false;
    public Pizza(boolean veg) {
        this.veg = veg;

        if(this.veg){
            isVegPizza = true;
            Price = 300;
        }
        else{
            Price = 400;
        }
        basePizzaPrice = this.Price;
    }

    public void addExtraCheese(){
        isExtraCheese = true;
        this.Price += extraCheese;
    }

    public void addExtraToppings(){
        isExtraToppings = true;
        this.Price += extraToppings;
    }

    public void takeAway(){
        isTakeaway = true;
        this.Price += take;
    }

    public void getBill(){
        String bill = "";
        //System.out.println("Your total will be: " +this.Price);
        if (isVegPizza){
        System.out.println("Veg Pizza Base: " +basePizzaPrice);
        }
        else{
            System.out.println("Non-Veg Pizza Base: " +basePizzaPrice);
        }
        if(isExtraCheese) bill += "Extra Cheese Price: " + extraCheese + "\n";
        if(isExtraToppings) bill += "Extra Toppings Price: " + extraToppings + "\n";
        if(isTakeaway) bill += "Take Away: " + take + "\n";
        bill += "Bill: " +this.Price + "\n";
        System.out.println(bill);
    }
}