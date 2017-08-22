
public class Hash {
	private Datos[] info;
	
	public Hash() {
		info = new Datos[999];
	}
	
	public boolean insertar(Datos persona)
	{
		int clave = plegamiento(persona.getClave());
		if (info[clave] == null) {
			info[clave] = persona;
			return true;
		} else
			return false;
	}
	
	public Datos mostrar(String clave) {
		int posicion = plegamiento(clave);
		Datos per = null;
		if (info[posicion] == null) {
			return per;
		} else 
			per = info[posicion];
		return per;
	}
	
	public void desplegar(Datos[] info)
	{
		for (int x = 0; x < info.length; x++) {
			if (info[x] != null) {
				System.out.println("Nombre: "+info[x].getNombre());
				System.out.println("Clave: "+info[x].getClave());
			}
		}
	}
	/*plegamiento retorna int*/
	public int plegamiento(String clave)
	{
		String aux = "";
		for (int x = 0; x < clave.length(); x++) {
			char c = clave.charAt(x);
			if(Character.isDigit(c)){
				aux += c; 
			} else {

			int a = (int) c;
			aux += a;
			}
		} 
		/*Convierto cada caracter del string a su valor ascii*/
		String part1 = "0";
		String part2 = "0";
		String part3 = "0";
		String part4 = "0";
		for (int x = 0; x <= aux.length()-1; x++) {
			if (x < 3) {
				part1 += aux.charAt(x); 
			} else {
				if (3 <= x && x < 6) {
					part2 += aux.charAt(x);
				} else {
					if (6 <= x && x < 9) {
						part3 += aux.charAt(x);
					} else {
						if (9 <= x && x < aux.length()) {
							part4 += aux.charAt(x);
						}
					}
				}
			}
		}
		/*Realizo las particiones para crear la subcadena con los valores ascii*/
		int numero = 0;
		for (int x = 1; x <=4; x++) {
			switch (x) {
			case 1:
				numero += Integer.parseInt(part1);
			break;
			case 2:
				numero += Integer.parseInt(part2);
			break;
			case 3:
				numero += Integer.parseInt(part3);
			break;
			case 4:
				numero += Integer.parseInt(part4);
			break;
			}
		}
		/*Sumo las particiones y convierto a entero*/
		while (numero >= 1000) {
			numero -= 1000;
		}
		/*Evaluo y trunco el resultado a 3 numeros*/
		return numero;
	}

	public Datos[] getInfo() {
		return info;
	}
}

