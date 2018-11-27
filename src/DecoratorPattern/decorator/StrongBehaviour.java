package DecoratorPattern.decorator;

import DecoratorPattern.iterface.Swan;

/**
 * <p>Title: StrongBehaciour.java</p>  
 * <p>Description: </p>  
 * @author HaoYuanyuan
 * @date 2018年11月27日
 * @version 1.0
 *
 */
public class StrongBehaviour extends Decorator{

	public StrongBehaviour(Swan swan) {
		super(swan);
	}

	@Override
	public void fly() {
		System.out.println("会飞行了");
	}
	
	

}
