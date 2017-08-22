package colaprioridad;
/*Importación de paquetes en orden alfabetico*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ImpresionMain{
	public static void main(String[] args)throws IOException{
		/*Creación de objetos y variables en orden alfabetico*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ColaPrioridad cola = new ColaPrioridad();
		DatosUsuario datUs;
		int opcion = -1;
		String[][] prioridad= {{"JF","1"},{"AN","2"},{"OP","3"},{"PG","2"}};
		/*Cuerpo del programa*/
		
			do {/*Mostrar menú mientras la opción seleccionada sea diferente de "0"*/
				System.out.printf("\n----------------------- Menu Impresion -----------------------\n"
						        + "\t\t 1. Enviar a cola de impresión\n"
						        + "\t\t 2. Mostrar cola de impresión\n"
						        + "\t\t 3. Imprimir archivo\n"
						        + "\t\t 0. Salir\n"
						        + "--------------------------------------------------------------\n"
						        + "Seleccione una opción númerica para comenzar: ");
				try{
				opcion = Integer.parseInt(br.readLine());/*Ingresamos el numero de la funcion requerida*/
				}catch(NumberFormatException ex){
					System.out.printf("\nIngrese un dato valido!\n");
				}
				switch(opcion){/*Evalua la opción ingresada para realizar la funcion especifica*/
					case 1:/*Enviar a cola de impresión*/
						if(!cola.full()){/*Siempre y cuando la cola no esté llena va a entrar al ciclo*/
							datUs = new DatosUsuario();/*Crea un nuevo objeto de tipo DatoUsuario para asignar valores*/
							System.out.printf("\n\n----------------------- Datos Impresion ----------------------\n\n"
									            + "---------------------- Formato de Usuario --------------------"
									            + "\n                   Jefe(JF), Analista(AN)                   "
									            + "\n               Programador(PG), Operador(OP)                "
									            + "\n--------------------------------------------------------------\n"
									            + "\nIngrese su usuario de forma abreviada: ");
							
							datUs.setUsuario(br.readLine().toUpperCase());/*Ingresamos a la clase datUs el nombre de usuario*/
							for(int x = 0; x < prioridad.length; x++){//Recorrido de la matriz
								if(datUs.getUsuario().compareTo(prioridad[x][0]) == 0){
									/*Busca que el usuario dado coincida con el de la matriz para asignar la prioridad*/
									datUs.setPrioridad(Integer.parseInt(prioridad[x][1]));
								}
							}
							System.out.printf("\nIngrese el nombre del archivo a imprimir: ");
							datUs.setNombreDoc(br.readLine());
							cola.insert(datUs);
						}else{
							System.out.printf("\n¡Cola de Impresión Llena!\n");
						}
					break;
					case 2:/*Mostrar cola de impresión*/
                        if(!cola.empty()){
                        	System.out.println("\n\n---------------------- Cola de Impresion ---------------------"
                        	                    +"\n   --- Usuario ---                      --- Nombre Archivo ---\n");
                        	cola.print();
                        	System.out.printf("\n--------------------------------------------------------------\n\n");
                        }else{
                        	System.out.printf("\n¡Cola de impresion vacia!\n");
                        }
					break;
					case 3:/*Elimina el frente, pero simula que ya imprimio el 1er archivo*/
                        System.out.printf("\n\n-------------------- Impresion de Archivo --------------------\n" +
                                            "\n--- Usuario ---  --- Nombre Archivo ---  --- Hora Impresion ---\n\n");
                        cola.remove();
                        System.out.printf("\n--------------------------------------------------------------\n");
					break;
				}
			} while (opcion != 0);/*Termina la ejecución del programa al ingresar 0*/
	}
}