package adapterPattern.Adapter;

import adapterPattern.Target.Target;
import adapterPattern.adaptee.M4DataLine;

/***
 * 这种是类适配器实现
 * 
 * 适配器就是修饰非血缘关系类的，把一个非本家族的对象伪装成本家族对象
 * 在本例子中M4DataLine就是那个被伪装的类 伪装成M5DataLine  这两个类不属于同一个接口下的兄弟类
 * @author hyy
 *
 */
public class M5DataLineAdapter extends M4DataLine implements Target {
	
	@Override
	public void connection(){
		System.out.println("插入 type - c 转接头 ");
		super.connection();
	}
}
