package colaprioridad;

import java.util.Calendar;

public class ColaPrioridad {
	private int frente, fin;
	private DatosUsuario[] colaP = new DatosUsuario[5];
	Calendar horaSys = Calendar.getInstance();
	public ColaPrioridad(){
		frente = -1;
		fin = -1;
	}
	
	public void insert(DatosUsuario objeto) {
		int i, cont = 0;
		if (empty()) {
			frente = fin = 0;
			colaP[frente] = objeto;
		} else {
			for (i = fin; i > -1 && objeto.getPrioridad() < colaP[i].getPrioridad(); i--) {
				colaP[i + 1] = colaP[i];
				cont++;
			}
			fin++;
			colaP[fin - cont] = objeto;
		}
	}
	
	public void print() {
        int var = frente;
        while (!empty() && var <= fin) {
            System.out.printf("         "+colaP[var].getUsuario()+"                                    "
                              +colaP[var].getNombreDoc()+"\n");
            var++;
        }
    }
	
    public void remove() {
		horaSys.add(Calendar.HOUR_OF_DAY,0);
		horaSys.add(Calendar.MINUTE,0);
		horaSys.add(Calendar.SECOND,7);
        DatosUsuario borrado = colaP[frente];
        if (frente == fin) {
            frente = -1;
            fin = -1;
        } else if (frente == colaP.length - 1) {
            frente = 0;
        } else {
            frente++;
        }
        System.out.printf("      "+borrado.getUsuario()+"                "+borrado.getNombreDoc()+"              "+horaSys.get(Calendar.HOUR_OF_DAY)+" : "+horaSys.get(Calendar.MINUTE)+" : "+horaSys.get(Calendar.SECOND)+" \n");
    }
	
	public boolean empty(){
		return (frente == -1 && fin == -1);
	}
	
	public boolean full(){
		return (frente == 0 && fin == colaP.length-1);
	}
}
