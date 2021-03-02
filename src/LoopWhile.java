import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
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
		System.out.println("A média dos alunos é: " + media);
		leitor.close();		
	}

}
