public class main {

	public static void main(String[] args) {

		System.out.println("IndusTrade");
		System.out.println("--------------------------");

		SistemaGeral sistema = new SistemaGeral();
		sistema.exibirMenuInicial(); 							//Menu Inicial
		int opcao = sistema.lerInt();

		while (true) {

			if (opcao == 1) { 									//Escolha de Logar no Sistema
				Empresa empresa = sistema.realizarLogin();
				if (empresa != null) {
					int opcaoSistema = 0;
					
					while (opcaoSistema != 4) {					//Enquanto a opção for diferente de 4, irá rodar o menu "logado"
						System.out.println("1 - Anunciar Produto");
						System.out.println("2 - Listar meus Anúncios");
						System.out.println("3 - Procurar Anúncios do Site");
						System.out.println("4 - Voltar");
						opcaoSistema = sistema.lerInt();

						if (opcaoSistema == 1) {
							int opcaoAnuncio = 0;
							System.out.println("Qual o tipo de Anuncio?");
							while (opcaoAnuncio != 3) {
								System.out.println("1 - Maquinário");
								System.out.println("2 - Recurso");
								System.out.println("3 - Cancelar");
								opcaoAnuncio = sistema.lerInt();

								if (opcaoAnuncio == 1) {
									sistema.cadastrarAnuncioMaquinario();
								} else if (opcaoAnuncio == 2) {
									sistema.cadastrarAnuncioRecurso();
								} else if (opcaoAnuncio == 3) {
									System.out.println("Operação cancelada.");
								} else {
									System.out.println("Opção inválida!");
								}
							}
						} else if (opcaoSistema == 2) {
							sistema.listarAnunciosEmpresa(empresa);
							System.out.println(" ");
						} else if (opcaoSistema == 3) {
							sistema.procurarAnuncios();
						} else {
							System.out.println("Opção inválida!");
						}					
					}
				sistema.exibirMenuInicial();
				opcao = sistema.lerInt();
				}
			} else if (opcao == 2) {
				sistema.cadastrarEmpresa();
				sistema.exibirMenuInicial();
				opcao = sistema.lerInt();
			} else if (opcao == 3) {
				System.out.println(" ");
				System.out.println("Encerrando...");
				break;
			} else if (opcao == 4) {
				sistema.cadastroEmpresaTeste();
				sistema.exibirMenuInicial();
				opcao = sistema.lerInt();
			} else if (opcao == 5) {
				sistema.cadastroAnunciosTeste();
				sistema.exibirMenuInicial();
				opcao = sistema.lerInt();
			} else {
				System.out.println("Opção inválida!");
				sistema.exibirMenuInicial();
			}
		}
	}
}	
