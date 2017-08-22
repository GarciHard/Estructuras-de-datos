
//{[3+2(4-3)-2(6-8)-5]}
/*					while(!pila.empty()) {
						System.out.println(pila.pop());
					}*/
public class Pila {
	private int tope;
	private char[] pila;
	
	public Pila() {
		tope = -1;
		pila = new char[20];
	}
	
	public void push(char caracter) {
		pila[++tope] = caracter;
	}
	
	public char pop() {
		return pila[tope--];
	}
	
	public char stacktop() {
		return pila[tope];
	}
	
	public boolean full() {
		boolean valor = (tope == pila.length -1) ? true : false;
    	return valor;
	}
	
	public boolean empty() {
		return tope == -1;
	}
	
	public void cleanStack() {
		tope = -1;
	}
}
