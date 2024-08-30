package Ventana;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
//		for(int i=1; i<=100;i++) {
//			System.out.println(i);
//		}
		int i=0;
		int ubi=0;
		int nummayor=0;
		int a[]= {20000,577,689,8779};
		
		for ( i = 0; i <a.length; i++) {
			if (a[i]>nummayor) {
			
				nummayor=a[i];
				ubi=i;
			
			}
			
			System.out.println(i);	
			
		}
		
		System.out.println(nummayor+" "+ubi);
		
		
		ArrayList<Integer> lista=new ArrayList<>();
		for (int j = 0; j < a.length; j++) {
			lista.add(a[j]);
			
		}
		lista.add(150000);
		System.out.println(lista);
		int mayor=0;
		
		for (int j = 0; j < lista.size(); j++) {
			if (lista.get(j)>mayor) {
				
				mayor=lista.get(j);
				ubi=i;
			}
			
		}
		int k=0;
		for (Integer integer : lista) {
			k++;
			System.out.println(integer*2+" "+k);
			
		}
		System.out.println(mayor);
		//		int a=0;
//		boolean x = a<100;
//		while (a<100) {
//			
//			a+=1;
//			System.out.println(a);
//		}
//		if (a%2==0) {
//			
//		}
//		switch(a) {
//		case 0:
//			System.out.println(0);
//			break;
//			
//		}
//		if (a==0) {
//			System.out.println(0);
//		}
//		
//		for (int i = 0; i <=1000; i+=2) {
//			
//			System.out.println(i);
//		}
//		
//		
//		System.out.println();
//	}
//	
//
//}
}}