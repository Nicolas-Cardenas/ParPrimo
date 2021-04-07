import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		System.out.println("Escoja una de las siguientes opciones");
		System.out.println("1: Ver si un numero es primo o no");
		System.out.println("2: Ver si un numero es par o no");

		Scanner myInput = new Scanner( System.in );
		int o = Integer.parseInt(myInput.nextLine());



		if(o ==1)
		{
			System.out.println("¿Qué numero desea saber si es primo o no?");
			int pri = Integer.parseInt(myInput.nextLine());
			int contador = 2;
			boolean primo=true;
			while ((primo) && (contador!=pri)){
				if (pri % contador == 0)
					primo = false;
				contador++;
			}
			
			if(primo == true)
			{
				System.out.println("El numero "+pri +" es primo");
			}
			else
			{
				System.out.println("El numero "+pri +" no es primo");
			}
			myInput.close();
			
		}
		else if(o==2)
		{
			System.out.println("¿Qué numero desea saber si es par o no?");
			int par = Integer.parseInt(myInput.nextLine());
			if(par%2==0)
			{
				System.out.println("El numero "+par +"  es par");
			}
			else if(par%2==1)
			{
				System.out.println("El numero "+par +"  no es par");
			}
			myInput.close();
			

			
		}
		else
		{
			myInput.close();
			return;
		}


	}
}