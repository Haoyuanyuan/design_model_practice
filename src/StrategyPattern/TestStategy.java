package StrategyPattern;

import StrategyPattern.implement.AttackImplement;
import StrategyPattern.implement.DefenderImplement;
import StrategyPattern.implement.DisplayImplement;
import StrategyPattern.implement.RunImplement;
/**
 * 策略模式属于11中行为型模式的一种
 * 策略模式的使用方式：
 * 在类中定义这些功能接口类型的变量，并实现这些接口
 * 在使用的时候通过setter方法，组装这些已经被实现的功能到对象属性上
 * @author hyy
 *
 */
public class TestStategy {
	public static void main(String[] args) {
		Role a = new RoleEntityA("张三");
		a.setAttack(new AttackImplement())
			.setDisplay(new DisplayImplement())
			.setDefender(new DefenderImplement())
			.setRun(new RunImplement());
		a.run();
		a.attack();
		a.defender();
		a.display();
		
	}
}
