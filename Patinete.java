package br.com.generation.ExerciciosOO;

public class Patinete {

	public static void main(String[] args) {
		Exercicio05_Do_Patinete Patinete = new Exercicio05_Do_Patinete();
		
		Patinete.setMarca("Xiaomi");
		Patinete.setModelo("Essential");
		Patinete.setDobravel(true);
		Patinete.setEletrico(true);
		Patinete.setAnoLancamento(2020);
		
		System.out.println("O seu patinete Cadastro � o: "+ Patinete.getMarca()+" "+ Patinete.getModelo()+ " do ano " + Patinete.getAnoLancamento() );
		System.out.print("O seu patinete");
		
		if(Patinete.isEletrico() == true) {
			System.out.print(" � eletrico.");
		}
		else {
			System.out.print(" N�o � eletrico");
		}
		
		System.out.println();
		
		System.out.print("O seu patinete tambem");
		
		if(Patinete.isDobravel() == true) {
			System.out.println(" � dobravel.");
		}
		else {
			System.out.println(" n�o � dobravel.");
		}
		


	}

}
