package DecoratorPattern.decorator;

import DecoratorPattern.iterface.Swan;

/**
 * <p>Title: Decorator.java</p>  
 * <p>Description: </p>  
 * @author HaoYuanyuan
 * @date 2018年11月27日
 * @version 1.0
 *
 */
public class Decorator implements Swan {

	private Swan swan;
	
	public Decorator(Swan swan) {
		this.swan = swan;
	}
	
	@Override
	public void fly() {
		swan.fly();

	}

	@Override
	public void cry() {
		swan.cry();
	}

	@Override
	public void desAppearance() {
		swan.desAppearance();
	}

}
