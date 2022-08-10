package p1;
import java.util.*;

public class DemoSet1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
			try {
				Set<Integer> st=null;
				System.out.println("===choice ===");
				System.out.println("1.Hashset \n 2.LinkedHash\n 3.TreeSet");
				System.out.println("Enter the choice");
				int choice=s.nextInt();
				switch(choice) {
				case 1:
					st=new HashSet <Integer>();//organized element without any order
					break;
				case 2:
					st=new LinkedHashSet<Integer>();//organized element in insertion order
					break;
				case 3:
					st=new TreeSet<Integer>();//organized element automatically in Assending order
					break;
				default:
					System.out.println("invalied choice");
			    }
				System.out.println("Enter the number of element to be added to set<E>");
				int n=s.nextInt();
				System.out.println("Enter the Element");
				for(int i=1;i<n;i++) {
					st.add(new Integer(s.nextInt()));
				}
				System.out.println("==Display using toString()=====");
				System.out.println(st.toString());
				
			}
			catch(Exception e) {e. printStackTrace();}
		 

	}

}
