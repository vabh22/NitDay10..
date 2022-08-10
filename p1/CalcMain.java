package p1;
import p1.Addition.*;
import p1.Substraction.*;
import p1.Multuplication.*;
import p1.Division.*;
import p1.Division.*;
import p1.ModDivision.*;
import java.util.*;

public class CalcMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter Second number");
		int b=s.nextInt();
		System.out.println("Enter your choice:----");
		System.out.println("1.Add\n2.Sub\n3.Mult\n4.Div\n5.ModDiv");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			Addition ad=new Addition();
			ad.process(a,b);
			System.out.println("Sum:"+ad);
			break;
		case 2:
			Substraction sub=new Substraction();
			 sub.process(a,b);
			System.out.println("Sub:"+sub);
			break;
		case 3:
			Multuplication mul=new Multuplication();
			mul.process(a, b);
			System.out.println("Multiplication:"+mul);
			break;
		case 4:
			Division div=new Division();
			div.process(a, b);
			System.out.println("Division:"+div);
			break;
		case 5:
			ModDivision mod=new ModDivision();
			mod.process(a, b);
			System.out.println("ModDivison:"+mod);
			break;
		default:
			System.out.println("Invalied choice");
		
			
			}
	}

}
