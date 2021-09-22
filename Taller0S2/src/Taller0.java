import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Taller0 {
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		int [][] sala = new int[10][30];
		crear_matriz(sala);
		Carga_C();
	}
	public static void crear_matriz(int[][]matriz) {
		for(int f=0;f<10;f++) {
			for(int c=0;c<30;c++) {
				matriz[f][c]=1;
			}
		}
		for(int f=0;f<4;f++) {
			for(int c=0;c<5;c++) {
				matriz[f][c]=0;
			}
		}
		for(int f=0;f<4;f++) {
			for(int c=25;c<30;c++) {
				matriz[f][c]=0;
			}
		}
	}
	public static void print_matriz(int[][]matriz) {
		for(int f=0;f<10;f++) {
			for(int c=0;c<30;c++) {
				System.out.print(matriz[f][c]);
			}
		System.out.println(" | Fila "+(f+1));
		}
	}

	public static void Carga_C() throws NumberFormatException, IOException {
		String[] nombres = new String[10];
		String[] apellidos = new String[999];
		String[] Rut = new String[999];
		String[] Password = new String[999];
		int[] saldos = new int[999];
		File archivo = new File ("src/Clientes.txt"); 
		FileReader text = new FileReader (archivo);
		BufferedReader reader = new BufferedReader(text); 
		String linea;
		String[] partes;
		int contador=0;
		while((linea = reader.readLine())!=null){
			partes = linea.split(",");
			String nombre=partes[0];
			String apellido=partes[1];
			String rut=partes[2];
			String password=partes[3];
			int saldo=Integer.parseInt(partes[4]);
			nombres[contador]=nombre;
			apellidos[contador]=apellido;
			Rut[contador]=rut;
			Password[contador]=password;
			saldos[contador]=saldo;
		}
		contador++;
		reader.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}