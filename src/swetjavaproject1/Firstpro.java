package swetjavaproject1;
import java.util.Scanner;
public class Firstpro {
	public static int method1(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=obj.nextLine();
		System.out.println("Name : "+ name);
		int res=method1(5,6);
		System.out.println(res);
	}
}

