package adapterPattern;

import adapterPattern.Adapter.M5DataLineAdapterInstanceModel;
import adapterPattern.Target.Target;
import adapterPattern.adaptee.M4DataLine;

public class AdapterTestInstanceModel {
	
	public static void main(String[] args) {
		Target adapter = new M5DataLineAdapterInstanceModel(new M4DataLine());
		adapter.connection();
	}
}
