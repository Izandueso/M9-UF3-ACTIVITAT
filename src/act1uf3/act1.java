package act1uf3;

import java.net.*;
import java.util.Scanner;

public class act1 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Guarda la IP que li proporcionem
		InetAddress dir = null;
		System.out.println("=====================================================");
		System.out.println("SORTIDA PER A LOCALHOST");
		
		System.out.println("Introdueix una direccio IP");
		String ipUsuari = teclado.nextLine();
		
		System.out.println();
		
		try {
			//LOCALHOST
			dir = InetAddress.getByName("localhost");
			//Es llen�a el metode per anar a la IP
			provaTots(dir);
			
			//Sortida IP
			dir = InetAddress.getByName(ipUsuari);
			provaTots(dir);
			
			//URL www.google.com
			System.out.println("=====================================================");
			System.out.println("SORTIDA PER A URL");
			dir = InetAddress.getByName("www.google.com");
			provaTots(dir);
			
			//Array tipus InetAddress amb totes les adreces IP de google.com
			System.out.println("\tAdreces IP per a: "+dir.getHostName());
			
			//Es un array al que guardem les diferents adre�es
			InetAddress[] adreces = InetAddress.getAllByName(dir.getHostName());
			for (int i=0; i<adreces.length; i++) 
				System.out.println("\t\t"+adreces[i].toString());
			System.out.println("=====================================================");
			
		} catch (UnknownHostException e1) {e1.printStackTrace();}
		
	}
	
	private static void provaTots(InetAddress dir) {
		
		//Aqui probarem les adre�es
		InetAddress dir2;
		
		System.out.println("\tM�tode getByName(): "+dir);
		
		try {
			dir2 = InetAddress.getLocalHost();
			System.out.println("\tM�tode getLocalHost(): "+dir2);
		} catch (UnknownHostException e) {e.printStackTrace();}
		
		//FEM SERVIR M�TODES DE LA CLASSE
		System.out.println("\tM�tode getHostName(): "+dir.getHostName());
		System.out.println("\tM�tode getHostAddress(): "+dir.getHostAddress());
		System.out.println("\tM�tode toString(): "+dir.toString());
		System.out.println("\tM�tode getCanonicalHostName(): "+dir.getCanonicalHostName());
		
	}

}