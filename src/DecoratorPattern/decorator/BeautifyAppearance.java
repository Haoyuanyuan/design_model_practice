package DecoratorPattern.decorator;

import DecoratorPattern.iterface.Swan;

/**
 * <p>Title: BeautifyAppearance.java</p>  
 * <p>Description: </p>  
 * @author HaoYuanyuan
 * @date 2018年11月27日
 * @version 1.0
 *
 */
public class BeautifyAppearance extends Decorator {

	public BeautifyAppearance(Swan swan) {
		super(swan);
	}
	
	@Override
	public void desAppearance(){
		System.out.println("外表是纯白色的");
	}

}
