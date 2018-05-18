package examenEntornos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCCuenta {
	private static float ingresar;

	public static void main(String[] args) {
		BufferedReader dato = new BufferedReader(new InputStreamReader(
				System.in));
		CCuenta rafa;

		int opcion = 0;
		rafa = new CCuenta("Rigoberta Piedra", "0000-6523-85-678912345",
				2500, 0);
		do {
			try {
				System.out.println("MENU DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Salir");
				opcion = Integer.parseInt(dato.readLine());

				switch (opcion) {
				case 1:
					System.out.println("Indica cantidad a ingresar: ");
					ingresar = Integer.parseInt(dato.readLine());
					try {
						System.out.println("Ingreso en cuenta");
						rafa.ingresando(ingresar);
					} catch (Exception e) {
						System.out.print("Fallo al ingresar");
					}
					break;
				case 2:
					System.out.println("Indica cantidad a retirar: ");
					float retirar = Integer.parseInt(dato.readLine());
					try {
						rafa.retirar(retirar);
					} catch (Exception e) {
						System.out.print("Fallo al retirar");
					}
					break;
				case 3:
					System.out.println("Aaaaaaaaaadios");
				}
			} catch (IOException ex) {
				Logger.getLogger(TestCCuenta.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		} while (opcion != 3);
		double saldoActual = rafa.estado();
		System.out.println("Saldo actual: " + saldoActual);
	}
}
