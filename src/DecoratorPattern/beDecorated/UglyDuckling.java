package DecoratorPattern.beDecorated;

import DecoratorPattern.iterface.Swan;

/**
 * <p>Title: UglyDuckling.java</p>  
 * <p>Description: 被装饰类，就是丑小鸭类 将来会将其包装为天鹅类，</p>  
 * @author HaoYuanyuan
 * @date 2018年11月27日
 * @version 1.0
 *
 */
public class UglyDuckling implements Swan{

	@Override
	public void fly() {
		System.out.println("不能飞行");
		
	}

	@Override
	public void cry() {
		System.out.println("叫声是克噜——克噜——克噜");
	}

	@Override
	public void desAppearance() {
		System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
	}
	
}
