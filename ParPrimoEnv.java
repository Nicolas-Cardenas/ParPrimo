public class ParPrimoEnv {


	public static void main(String[] args) {

		String n1 = System.getenv("numuno");
		String n2 = System.getenv("numdos");
		
		int o = Integer.parseInt(n1);
		int j = Integer.parseInt(n2);
		
		System.out.println("Escoja una de las siguientes opciones");
		System.out.println("1: Ver si un numero es primo o no");
		System.out.println("2: Ver si un numero es par o no");

		



		if(o ==1)
		{
			System.out.println("¿Qué numero desea saber si es primo o no?");
			int contador = 2;
			boolean primo=true;
			while ((primo) && (contador!=j)){
				if (j % contador == 0)
					primo = false;
				contador++;
			}

			if(primo == true)
			{
				System.out.println("El numero "+j +" es primo");
			}
			else
			{
				System.out.println("El numero "+j +" no es primo");
			}
			
		}
		else if(o==2)
		{
			System.out.println("¿Qué numero desea saber si es par o no?");
			if(j%2==0)
			{
				System.out.println("El numero "+j +"  es par");
			}
			else if(j%2==1)
			{
				System.out.println("El numero "+j +"  no es par");
			}
			

		}
		else
		{
			
			return;
		}


	}
}