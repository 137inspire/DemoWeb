package PointOne;

import java.io.IOException;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * 
 * 
 * @author ksain
 *
 */

public class taxCal {

	private static int a=0;

	public static void main(String[] args) throws IOException{
		Scanner scc=new Scanner(System.in);
		System.out.println("welcome to my tax calculator");
		System.out.println("----------------------------");
		InputStreamReader sc =new InputStreamReader(System.in);
		System.out.print("please enter your hourly wages\n");
//		a = sc.read();
		a=scc.nextInt();
		System.out.println(a);
	}

}
