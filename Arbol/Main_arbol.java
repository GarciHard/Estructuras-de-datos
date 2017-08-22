/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MarcoR
 */
import java.io.*;
public class Main_arbol {
    public static void main(String[] args) throws IOException {
        BufferedReader leer=new BufferedReader (new InputStreamReader (System.in));
        String Mat[][]={ {"Pizarron", "Mobiliario", "5", "1200"}, 
                         {"Borrador", "Papeleria", "10", "30"},
                         {"Proyector", "Electronico", "3", "45000" },
                         {"Escritorio", "Mobiliario", "6", "950"},   
                         {"Radio-Comunicador","Electronico","7","2600"},
                         {"Plumones", "Papeleria","15","55"},
                         {"Pantalla", "Electronico", "2", "16000"},
                         {"Impresora", "Electronico", "8", "8500"},
                         {"Silla", "Mobiliario", "50", "250"},
                         {"Lapiceros", "Papeleria", "15", "20"},
                         {"Pizarron", "Mobiliario", "5", "1200"} 
                
        };
        
        int op;
        Nodo aux;
        Nodo obj = null;
        Nodo obj2;
        String nombre;
        String descripcion;
        double cantidad;
        double costo;
        Arbol obj1 = new Arbol();
       
        do {
        System.out.printf("Elija opción;\n"
                            + "1. Agregar articulo\n"
                            + "2. Desplegar tipo de artículo (por nodo)\n"
                            + "3. Desplegar por categoría\n"
                            + "4. Eliminar tipo de articulo\n"
                            + "5. Eliminar articulo (Decremento)\n"
                            + "6. Suma por costos de articulo\n"
                            + "0. Salir\n");

    op = Integer.parseInt(leer.readLine());
    switch (op){
        case 1:
            for (int i=0;i<10;i++){
                
                descripcion = Mat [i][0];
                nombre = Mat [i][1];
                cantidad = Double.parseDouble (Mat [i][2]);
                costo = Double.parseDouble (Mat [i][3]);
                obj2 = new Nodo (descripcion, nombre, cantidad, costo);
                obj1.insert(obj2);

            System.out.println("La descripcion es: "+ obj2.getDescripcion()+ ". La categoría es: "+ obj2.getCategoria()+". La cantidad es: "+obj2.getCantidad()+ " y el costo es: "+obj2.getCosto());
            } 
            break;  
                case 2:
                    int op2 = 0;
                    do{
                         System.out.printf("Elija opción;\n"
                            + "1. Inorden\n"
                            + "2. Preorden\n"
                            + "3. Postorden\n"
                            + "4. Salir\n"
                            + "---------------------------------------"     );
                        op2 = Integer.parseInt(leer.readLine());
                         switch (op2){
                             case 1:
                                 if (! obj1.empty()){
                                     obj1.inorden(obj1.getRaiz());
                                 }
                                 else
                                     System.out.println("no hay datos");
                                 break;
                             case 2:
                                 if (! obj1.empty()){
                                     obj1.preorden(obj1.getRaiz());
                                 }
                                 else
                                     System.out.println("no hay datos");
                                 break;
                             case 3:
                                 if (! obj1.empty()){
                                     obj1.postorden(obj1.getRaiz());
                                 }
                                 else
                                     System.out.println("no hay datos");
                                 break;
                         }
                    }while(op2 != 4);
                    break;
                case 3:
                    System.out.println("¿Qué categoría deseas ver?");
                    String articulo = leer.readLine();
                    for (int i=0;i<10;i++){
                        
                        
                    }
                    
                    break;
                case 4:
                    break;   
                case 5:
                    break; 
                case 6:
                    break;     
            }
        }while(op != 0);
    }
}
