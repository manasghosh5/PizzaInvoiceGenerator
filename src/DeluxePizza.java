public class DeluxePizza extends Pizza{
    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}

    public DeluxePizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}