import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		int idade;
		double media = 0;
		int qtDeAlunos = 0;
		int totalAlunos = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o total de Alunos: ");
		totalAlunos = leitor.nextInt();
		
		while(qtDeAlunos < totalAlunos) {
			System.out.println("Informe a idade do Primeiro aluno");
			idade = leitor.nextInt();
			media = media + idade;
			qtDeAlunos += 1;
		}
		
		media = media / (double) totalAlunos;
		System.out.println("A m�dia dos alunos �: " + media);
		leitor.close();		
	}

}
