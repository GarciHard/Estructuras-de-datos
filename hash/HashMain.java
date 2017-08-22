
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class HashMain {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Hash hash = new Hash();
		Datos infoPersona;
		int opcion;
		do 
		{
			System.out.printf("\n------ Datos Usuario ------"
					+ "\n1. Ingresar datos"
					+ "\n2. Mostrar todos los datos"
					+ "\n3. Mostrar datos por clave"
					+ "\n0. Salir"
					+ "\n----------------------------"
					+ "\nSeleccione una opcion: ");
			opcion = Integer.parseInt(br.readLine());
			switch (opcion) 
			{
				case 1:
					infoPersona = new Datos();
					String clave = "";
					System.out.printf("\n--- Creacion de Usuario ---\n"
							+ "Ingresa tu nombre: ");
					infoPersona.setNombre(br.readLine().toUpperCase());
					do {
						System.out.print("Ingresa una clave con un MIN y MAX de 6 digitos\n"
								+ "Puede incluir numeros y letras\n"
								+ "--> ");
						clave = br.readLine();
					} while (clave.length() < 6 || clave.length() > 6);
					infoPersona.setClave(clave.toUpperCase());
					if (hash.insertar(infoPersona))
						hash.insertar(infoPersona);
					else
						System.out.println("Usuario no creado, ingresa una clave diferente"
								       + "\n----------------------------------------------");
				break;
				case 2:
					System.out.println("\n------ Datos Usuario ------");
					hash.desplegar(hash.getInfo());
					System.out.println("---------------------------");
				break;
				case 3:
					System.out.println("\n------ Datos Usuario ------");
					System.out.print("Ingrese su clave: ");
					Datos persona = hash.mostrar(br.readLine().toUpperCase());
					if (persona != null) {
						System.out.println("Nombre: "+persona.getNombre());
						System.out.println("---------------------------");
					} else {
						System.out.println("Clave erronea o inexistente");
						System.out.println("---------------------------");
					}
				break;
				case 5:
					System.out.println(hash.plegamiento("JAGH13"));
				break; 
			}
		} while (opcion != 0);
	}
}
