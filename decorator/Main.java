package decorator;

import decorator.coffee.ChocoSirupDecorator;
import decorator.coffee.Coffee;
import decorator.coffee.MilkDecorator;
import decorator.coffee.SimpleCoffee;
import decorator.coffee.VanillaSirupDecorator;

public class Main {
	
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new MilkDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new VanillaSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new ChocoSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
	}

}
