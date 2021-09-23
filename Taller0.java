import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Taller0 {
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		int [][] sala = new int[10][30];
		///Archivo Clientes
		String[] Nombre = new String[999];
		String[] Apellido = new String[999];
		String[] Rut = new String[999];
		String[] Password = new String[999];
		int[] Saldo = new int[999];
		///Archivo Status
		String[] RutStatus = new String[999];
		String[] Status = new String[999];
		///Archivo Peliculas
		String[] NombrePelicula = new String[999];
		String[] Tipo = new String[999];
		int[] Recaudacion = new int[999];
		String[] Funciones = new String[999];
		crear_matriz(sala);
		Carga_C(Nombre,Apellido,Rut,Password,Saldo);
		Carga_S(RutStatus,Status);
		Carga_P(NombrePelicula,Tipo,Recaudacion,Funciones);
		print_lista(Funciones);
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

	public static void Carga_C(String[] Nombre,String[] Apellido,String[] Rut,String[] Password,int[] Saldo) throws NumberFormatException, IOException {
		File archivo = new File ("src/Clientes.txt"); 
		FileReader text = new FileReader (archivo);
		BufferedReader reader = new BufferedReader(text); 
		String linea;
		String[] partes;
		int contador=0;
		while((linea = reader.readLine())!=null){
			partes = linea.split(",");
			Nombre[contador]=partes[0];
			Apellido[contador]=partes[1];
			Rut[contador]=partes[2];
			Password[contador]=partes[3];
			Saldo[contador]=Integer.parseInt(partes[4]);
			contador++;
		}
		reader.close();
	}
	
	public static void Carga_S(String[] RutStatus,String[] Status) throws NumberFormatException, IOException {
		File archivo = new File ("src/Status.txt"); 
		FileReader text = new FileReader (archivo);
		BufferedReader reader = new BufferedReader(text); 
		String linea;
		String[] partes;
		int contador=0;
		while((linea = reader.readLine())!=null){
			partes = linea.split(",");
			RutStatus[contador]=partes[0];
			Status[contador]=partes[1];
			contador++;
		}
		reader.close();
	}
	
	public static void Carga_P(String[] NombrePelicula,String[] Tipo,int[] Recaudacion,String[] Funciones) throws NumberFormatException, IOException {
		File archivo = new File ("src/Peliculas.txt"); 
		FileReader text = new FileReader (archivo);
		BufferedReader reader = new BufferedReader(text); 
		String linea;
		String[] partes;
		int contador=0;
		int division=3;
		while((linea = reader.readLine())!=null){
			partes = linea.split(",");
			NombrePelicula[contador]=partes[0];
			Tipo[contador]=partes[1];
			Recaudacion[contador]=Integer.parseInt(partes[2]);
			if(!partes[division].equals(null)) {
				Funciones[contador]=partes[division];
				if 
			}
			contador++;
		}
		reader.close();
	}
	
	public static void print_lista(String[] lista) {
		for(int f=0;f<2;f++) {
			System.out.println(lista[f]);
		}
	}
	
	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}