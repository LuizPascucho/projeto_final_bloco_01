package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                FATALITY GAMES                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Jogos                      ");
			System.out.println("            2 - Listar todos os Jogos                ");
			System.out.println("            3 - Atualizar Jogos                      ");
			System.out.println("            4 - Apagar Jogos                         ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nFatality Games - Aqui você arrebenta nos Games!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar Jogos\n\n");

					break;
				case 2:
					System.out.println("Listar todos os Jogos\n\n");

					break;
				case 3:
					System.out.println("Atualizar Jogos\n\n");

					break;
				case 4:
					System.out.println("Apagar Jogos\n\n");
					
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
		
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Luiz Fernando Pascucho Dos Santos");
		System.out.println("*********************************************************");
		
	}

}
