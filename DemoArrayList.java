package p1;
import java.util.*;

public class DemoArrayList {

	public static void main(String[] args) {
		List <String> l1=new ArrayList<String>();
		l1.add("Sindhu");
		l1.add("Bihar");
		l1.add("+918488884");
		System.out.println(l1);
		l1.set(2, "+913848483");
		System.out.println(l1);
		l1.remove(1);
		for(int i=0;i<l1.size();i++)
		{
			continue;
		}
		System.out.println(l1);
	}

}
