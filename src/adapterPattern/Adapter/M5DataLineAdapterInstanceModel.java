package adapterPattern.Adapter;

import adapterPattern.Target.Target;
import adapterPattern.adaptee.M4DataLine;


/**
* <p>Title: M5DataLineAdapterInstanceModel.java</p>  
* <p>Description: 用来适配的类，通过对象适配器实现M4DataLine可以完成M5DataLine的功能</p>  
* @author HaoYuanyuan
* @date 2018年11月27日
* @version 1.0
*
*/
public class M5DataLineAdapterInstanceModel implements Target{
	
	//被适配的类型
	private M4DataLine target;
	
	public  M5DataLineAdapterInstanceModel(M4DataLine target) {
		this.target = target;
	}

	@Override
	public void connection() {
		System.out.println("插入 type-c 转接头");
		target.connection();
	}
	
	
	
}
