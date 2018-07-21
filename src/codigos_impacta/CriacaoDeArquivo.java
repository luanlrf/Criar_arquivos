package codigos_impacta;

import java.io.*;
public class CriacaoDeArquivo {

	
	
static String texto = new String("JAVA");

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream arquivo = new FileOutputStream("GerarArquivo.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			System.out.println("arquivo gerado com susesso");
			dados.writeChars(texto);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		

	}
   

	


	}



	
	


