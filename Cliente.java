package br.com.generation.ExerciciosOO;
public class Cliente {

	public static void main(String[] args) {
		Exercicio1_Do_Cliente Usuario = new Exercicio1_Do_Cliente();
		
		Usuario.setNome("Leonardo");
		Usuario.setSobrenome("Sato");
		Usuario.setIdade(19);
		Usuario.setSexo("Masculino");
		Usuario.setEndereco("José De Alcantara");
		Usuario.setNumeroCasa(100);

		
		System.out.println("Ola Usuario irei imprimir seus dados");
		System.out.println("______________________");
		System.out.println("|====================|");
		System.out.println("|======"+Usuario.getNome()+"======|");
		System.out.println("|========"+Usuario.getSobrenome()+"========|");
		System.out.println("|====================|");
		System.out.println("|====================|");
		System.out.println("|"+Usuario.getSexo()+"===========|");
		System.out.println("|====================|");
		System.out.println("|======="+Usuario.getIdade()+"Anos=======|");
		System.out.println("|====================|");
		System.out.println("|====================|");
		System.out.println("|"+Usuario.getEndereco()+"===|");
		System.out.println("|==Numero="+Usuario.getNumeroCasa()+"========|");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
	}

}
