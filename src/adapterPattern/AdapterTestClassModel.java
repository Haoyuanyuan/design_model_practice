package adapterPattern;

import adapterPattern.Adapter.M5DataLineAdapter;
import adapterPattern.Target.Target;

public class AdapterTestClassModel {
	
	
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		
		Target target1 = new M5DataLineAdapter();
		target1.connection();
	}
}
