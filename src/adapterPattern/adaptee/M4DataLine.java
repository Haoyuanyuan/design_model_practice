package adapterPattern.adaptee;

/**
* <p>Title: M4DataLine.java</p>  
* <p>Description: 被适配的类，将要将其包装为M5DataLine类但是两者本质还是属于不同的接口</p>  
* @author HaoYuanyuan
* @date 2018年11月27日
* @version 1.0
*
*/
public class M4DataLine {
	public void connection(){
		System.out.println("使用小米4数据线连接...");
	}
}
