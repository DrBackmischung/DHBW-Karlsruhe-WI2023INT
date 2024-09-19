package decorator.coffee;

public class MilkDecorator extends CoffeeDecorator {
	
	public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; 
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

}
