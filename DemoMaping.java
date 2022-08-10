package p1;
import java.util.*;

public class DemoMaping {

	public static void main(String args[])
	{
		Map<String,String> student =new HashMap<>();
		student.put("InstName", "UEM");
		student.put("InstAdd", "NewTown");
		student.put("InsMob", "+913440404");
		System.out.println(student);
		student.remove("InstName");
		System.out.println(student);		
	}
}
