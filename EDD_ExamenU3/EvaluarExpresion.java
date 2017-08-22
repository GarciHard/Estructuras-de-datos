

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvaluarExpresion {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pila pila = new Pila();
		int opcion;
		do {
			System.out.printf("\n--- Evaluador de Expresiones Algebraicas ---"
							+ "\n1. Ingresar y evaluar expresion"
							+ "\n0. Salir"
							+ "\nSeleccione una opcion: ");
			opcion = Integer.parseInt(br.readLine());
			switch (opcion) {
				case 1:
					System.out.printf("\n\nIngrese la expresion a evaluar: ");
					String expresion = br.readLine();
					for (int x = 0; x <= expresion.length()-1; x++) {
						if (!pila.full()) {
							if (expresion.charAt(x) == '{' ||expresion.charAt(x) == '['||expresion.charAt(x) == '(') {
								pila.push(expresion.charAt(x));
							}  else if (expresion.charAt(x) == ')' && pila.stacktop() == '(') {
								pila.pop();
							} else if (expresion.charAt(x) == ']' && pila.stacktop() == '[') {
								pila.pop();
							} else if (expresion.charAt(x) == '}' && pila.stacktop() == '{') {
								pila.pop();
							} else if (expresion.charAt(x) == ')' && pila.stacktop() != '(') {
								pila.push(expresion.charAt(x));
							} else if (expresion.charAt(x) == ']' && pila.stacktop() != '[') {
								pila.push(expresion.charAt(x));
							} else if (expresion.charAt(x) == '}' && pila.stacktop() != '{') {
								pila.push(expresion.charAt(x));
							}
						}
					}
					if (pila.empty()) {
						System.out.println("Expresion valida");
					} else {
						System.out.println("Expresion no valida");
					}
				break;
			}
		} while (opcion != 0);
	}
}