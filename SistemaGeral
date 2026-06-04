import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class SistemaGeral {
    private Scanner ler;
    private ArrayList<AnuncioMaquinario> listaAnuncioMaquinario;
    private ArrayList<AnuncioRecurso> listaAnuncioRecurso;
    private ArrayList<Empresa> listaEmpresas;
    private ArrayList<Endereco> listaEnderecos;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public void limparBuffer() {
        if (ler.hasNextLine()) {
            ler.nextLine();
        }
    }
    
    public static boolean isCnpjValido(long cnpj) {						//Valida CNPJ
        String texto;
    	if (cnpj == 0) {
    		System.out.println("CNPJ inválido.");
    		return false;
    	}
        texto = String.valueOf(cnpj);
    	String apenasNumeros = texto.replaceAll("\\D", "");
        if (apenasNumeros.length() == 14) {
        	System.out.println("CNPJ válido!");
        	return true;
        }else {
        	System.out.println("CNPJ inválido.");
        	return false;
        }
    }
    
    public SistemaGeral() {											   //Construtor SistemaGeral
        listaAnuncioMaquinario = new ArrayList<>();
        listaAnuncioRecurso = new ArrayList<>();
        listaEmpresas = new ArrayList<>();
        listaEnderecos = new ArrayList<>();
        ler = new Scanner(System.in);
    }

    public int lerInt() {											   //Leitor Scanner
        while (true) {
            try {
                return Integer.parseInt(ler.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(" ");
            }
        }
    }

    public void exibirMenuInicial() {								   //Menu Inicial
        System.out.println("1 - Login de Empresa");
        System.out.println("2 - Cadastrar sua Empresa");
        System.out.println("3 - Encerrar o Programa");
        System.out.println("Com apenas números, informe uma opção:");
    }

    public void cadastrarEmpresa() {								   //Cadastro de Empresa	
    	System.out.println("Sistema de Cadastro de Empresa");
        System.out.println(" ");

        System.out.println("Informe o CNPJ (apenas números):");
        long cnpj = Long.parseLong(ler.nextLine().replaceAll("[^0-9]", "").trim());
        while (!SistemaGeral.isCnpjValido(cnpj)) {
            System.out.println("CNPJ inválido. Informe novamente:");
            cnpj = Long.parseLong(ler.nextLine().trim());
        }
        System.out.println(" ");

        System.out.println("Informe a Razão Social da Empresa:");
        String razaoSocial = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe a Senha:");
        String senha = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe o E-Mail:");
        String email = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe o Telefone da Empresa:");
        String telefone = ler.nextLine();
        System.out.println(" ");

        System.out.println("-------------------------------");
        System.out.println(" ");

        System.out.println("Informe o CEP da Empresa:");
        String cep = ler.nextLine();
        System.out.println(" ");

        System.out.println("Logradouro:");
        String logradouro = ler.nextLine();
        System.out.println(" ");

        System.out.println("Número:");
        String numero = ler.nextLine();
        System.out.println(" ");

        System.out.println("Bairro:");
        String bairro = ler.nextLine();
        System.out.println(" ");

        System.out.println("Cidade:");
        String cidade = ler.nextLine();
        System.out.println(" ");

        System.out.println("UF:");
        String uf = ler.nextLine();
        System.out.println(" ");

        Empresa empresa = new Empresa(cnpj, senha, razaoSocial, email, telefone,
                cep, logradouro, numero, bairro, cidade, uf);
        this.listaEmpresas.add(empresa);
        System.out.println("Empresa cadastrada com sucesso!");
    }

    public Empresa realizarLogin() {								 //Login de Empresa	
        System.out.println("CNPJ:");
        long cnpj = ler.nextLong();

        System.out.println("Senha:");
        String senha = ler.next();

        for (Empresa empresa : listaEmpresas) {
            if (empresa.getCnpj() == cnpj) {
                if (empresa.getSenha().equals(senha)) {
                    System.out.println("Login realizado com sucesso!");
                    System.out.println(" ");
                    return empresa;
                } else {
                    System.out.println("Senha incorreta!");
                    return null;
                }
            }
        }
        System.out.println("Empresa não encontrada. Verifique o CNPJ.");
        return null;
    }
    
    public void cadastroEmpresaTeste() {							//Cadastro de Empresa TESTE
    	System.out.println("Sistema de Cadastro Teste:");
        System.out.println(" ");

        System.out.println("Informe o CNPJ (apenas números):");
        long cnpj = Long.parseLong(ler.nextLine().replaceAll("[^0-9]", "").trim());

        String razaoSocial = "DVMAQ Usinagem";
        String senha = "123321";
        String email = "vieira.daniel@gmail.com";
        String telefone = "19 99852-7778";
        String cep = "13605-182";
        String logradouro = "Rua Francisco Fernandes";
        String numero = "182";
        String bairro = "Parque Industrial";
        String cidade = "Araras";
        String uf = "SP";

        Empresa empresa = new Empresa(cnpj, senha, razaoSocial, email, telefone,
                cep, logradouro, numero, bairro, cidade, uf);
        this.listaEmpresas.add(empresa);
        System.out.println("Empresa cadastrada com sucesso!");
    }
    
    public void cadastroAnunciosTeste() {						////Cadastro de ANUNCIOS - TESTE
        System.out.println("Cadastro de Anúncios de Teste:");
        System.out.println(" ");

        System.out.println("Informe o CNPJ da Empresa (apenas números):");
        long cnpj = Long.parseLong(ler.nextLine().replaceAll("[^0-9]", "").trim());

        AnuncioMaquinario maq1 = new AnuncioMaquinario(
            cnpj,
            "Torno CNC Romi GL 240",
            "Torno CNC de alta precisão, ideal para usinagem de peças cilíndricas.",
            85000.00,
            LocalDate.now(),
            "https://exemplo.com/torno-cnc.jpg",
            true,
            "Torno CNC",
            "Bom",
            "Romi",
            "GL 240",
            2018,
            3200.0,
            "2.5m x 1.2m x 1.8m",
            "380V",
            1
        );

        AnuncioMaquinario maq2 = new AnuncioMaquinario(
            cnpj,
            "Máquina de Solda MIG Lincoln 350A",
            "Equipamento de solda MIG/MAG profissional para uso industrial contínuo.",
            12500.00,
            LocalDate.now(),
            "https://exemplo.com/solda-mig.jpg",
            true,
            "Máquina de Solda MIG",
            "Ótimo",
            "Lincoln Electric",
            "Power MIG 350",
            2020,
            28.5,
            "0.6m x 0.4m x 0.8m",
            "220V",
            2
        );
        
        AnuncioMaquinario maq3 = new AnuncioMaquinario(
            cnpj,
            "Prensa Hidráulica Schuler 60T",
            "Prensa hidráulica de 60 toneladas para estampagem e conformação de chapas.",
            47000.00,
            LocalDate.now(),
            "https://exemplo.com/prensa-hidraulica.jpg",
            true,
            "Prensa Hidráulica",
            "Regular",
            "Schuler",
            "PH-60",
            2015,
            4800.0,
            "1.8m x 1.0m x 2.4m",
            "380V",
            3
        );

        AnuncioRecurso rec1 = new AnuncioRecurso(
            cnpj,
            "Chapa de Aço SAE 1020 - 6mm",
            "Chapas de aço carbono laminado a quente, corte 1000x2000mm.",
            3200.00,
            LocalDate.now(),
            "https://exemplo.com/chapa-aco.jpg",
            "Chapa de Aço SAE 1020",
            50.0,
            "unidades",
            470.0,
            1
        );
        
        AnuncioRecurso rec2 = new AnuncioRecurso(
            cnpj,
            "Eletrodo Revestido E6013 3,25mm - Caixa 20kg",
            "Eletrodo para solda em aço carbono, baixo hidrogênio, caixa com 20kg.",
            320.00,
            LocalDate.now(),
            "https://exemplo.com/eletrodo.jpg",
            "Eletrodo E6013",
            10.0,
            "caixas",
            20.0,
            2
        );
        
        AnuncioRecurso rec3 = new AnuncioRecurso(
            cnpj,
            "Fresa de Topo Metal Duro 12mm - Kit 5un",
            "Fresas de topo em metal duro revestido TiAlN, para aço e inox.",
            780.00,
            LocalDate.now(),
            "https://exemplo.com/fresa-topo.jpg",
            "Fresa de Topo Metal Duro",
            5.0,
            "unidades",
            0.8,
            3
        );

        listaAnuncioMaquinario.add(maq1);
        listaAnuncioMaquinario.add(maq2);
        listaAnuncioMaquinario.add(maq3);
        listaAnuncioRecurso.add(rec1);
        listaAnuncioRecurso.add(rec2);
        listaAnuncioRecurso.add(rec3);

        Empresa empresa = buscarEmpresaPorCnpj(cnpj);
        if (empresa != null) {
            empresa.adicionarAnuncio(maq1);
            empresa.adicionarAnuncio(maq2);
            empresa.adicionarAnuncio(maq3);
            empresa.adicionarAnuncio(rec1);
            empresa.adicionarAnuncio(rec2);
            empresa.adicionarAnuncio(rec3);
            System.out.println("6 anúncios de teste cadastrados e vinculados à empresa " + empresa.getRazaoSocial() + "!");
        } else {
            System.out.println("6 anúncios de teste cadastrados!");
            System.out.println("Atenção: CNPJ não encontrado, anúncios não vinculados a nenhuma empresa.");
        }
    }
    
    public void cadastrarAnuncioMaquinario() {						//Cadastro ANUNCIO Maquinario
    	System.out.println("Informe o CNPJ da Empresa:");
        long empresaCnpj = Long.parseLong(ler.nextLine().replaceAll("[^0-9]", "").trim());
        System.out.println(" ");
        
        System.out.println("Informe a Categoria do Item:");
        System.out.println("1 - Máquinas de Usinagem");
        System.out.println("2 - Equipamentos de Solda e Corte");
        System.out.println("3 - Máquinas de Conformação");
        int tipoCategoria = ler.nextInt();
        System.out.println(" ");
        
        System.out.println("Informe o Título do Anuncio:");
        String titulo = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe a Descrição do Produto:");
        String descricao = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe o Valor do Produto:");
        double valor = Double.parseDouble(ler.nextLine().replace(",", ".").trim());
        System.out.println(" ");

        System.out.println("Informe a Data de Cadastro (dd-MM-yyyy):");
        String dataInput = ler.nextLine().trim();
        LocalDate data = LocalDate.parse(dataInput, formatter);
        System.out.println(" ");

        System.out.println("Informe a URL da Imagem:");
        String urlImagem = ler.nextLine().trim();
        System.out.println(" ");
        
        String resposta = "N/A";
        boolean principal = true;
        while (resposta.equals("N/A")) {
	        System.out.println("É a Imagem Principal? (S/N):");
	        resposta = ler.next();
	        if (resposta == "S") {
		        principal = true;
		    }else if (resposta == "N") {
		        principal = false;
		    }else {
		    	resposta = "N/A";
		    	System.out.println("Resposta inválida.");
		    	System.out.println(" ");
		    }
        }    
        System.out.println(" ");

        System.out.println("Informe o Nome do Produto:");
        String nome = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe o Estado de Conservação:");
        String estadoConservacao = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe a Marca do Produto:");
        String marca = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe o Modelo do Produto:");
        String modelo = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe o Ano de Fabricação:");
        int anoFabricacao = Integer.parseInt(ler.nextLine().replaceAll("[^0-9]", "").trim());
        System.out.println(" ");

        System.out.println("Informe o Peso do Produto (kg):");
        double peso = Double.parseDouble(ler.nextLine().replace(",", ".").trim());
        System.out.println(" ");

        System.out.println("Informe a Dimensão do Produto:");
        String dimensao = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe a Voltagem do Produto:");
        String voltagem = ler.nextLine().trim();
        System.out.println(" ");

        AnuncioMaquinario anuncio = new AnuncioMaquinario(empresaCnpj, titulo, descricao, valor,
                data, urlImagem, principal, nome, estadoConservacao,
                marca, modelo, anoFabricacao, peso, dimensao, voltagem, tipoCategoria);
        this.listaAnuncioMaquinario.add(anuncio);
        System.out.println("Anúncio de maquinário cadastrado com sucesso!");
        System.out.println(" ");
        System.out.println("Deseja realizar outro Anúncio?");
        System.out.println(" ");
    }

    public void cadastrarAnuncioRecurso() {							 //Cadastro ANUNCIO Recurso

    	System.out.println("Informe o CNPJ da Empresa:");
        long empresaCnpj = Long.parseLong(ler.nextLine().replaceAll("[^0-9]", "").trim());
        System.out.println(" ");
        
        System.out.println("Informe a Categoria do Item:");
        System.out.println("1 - Matéria-Prima");
        System.out.println("(Chapas, perfis, tubos, barras metálicas, aço, alumínio)");
        System.out.println("2 - Insumos e Consumíveis");
        System.out.println("(Eletrodos, discos de corte, lubrificantes, gases industriais)");
        System.out.println("3 - Ferramentas e Acessórios");
        System.out.println("(Brocas, fresas, porta-ferramentas, dispositivos de fixação)");
        int tipoCategoria = ler.nextInt();
        System.out.println(" ");

        System.out.println("Informe o Título do Anúncio:");
        String titulo = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe a Descrição:");
        String descricao = ler.nextLine();
        System.out.println(" ");

        System.out.println("Informe o Valor:");
        double valor = Double.parseDouble(ler.nextLine().replace(",", ".").trim());
        System.out.println(" ");

        System.out.println("Informe a Data (dd-MM-yyyy):");
        String dataInput = ler.nextLine().trim();
        LocalDate data = LocalDate.parse(dataInput, formatter);
        System.out.println(" ");

        System.out.println("Informe a URL da Imagem Principal:");
        String urlImagemPrincipal = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe o Nome do Produto:");
        String nome = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe a Quantidade (apenas números):");
        double quantidade = Double.parseDouble(ler.nextLine().replace(",", ".").trim());
        System.out.println(" ");

        System.out.println("Informe a Dimensão do Produto:");
        String unidadeMedida = ler.nextLine().trim();
        System.out.println(" ");

        System.out.println("Informe o Peso do Produto (kg):");
        double peso = Double.parseDouble(ler.nextLine().replace(",", ".").trim());
        System.out.println(" ");

        AnuncioRecurso anuncio = new AnuncioRecurso(empresaCnpj, titulo, descricao, valor,
                data, urlImagemPrincipal, nome, quantidade, unidadeMedida,
                peso, tipoCategoria);
        this.listaAnuncioRecurso.add(anuncio);
        System.out.println("Anúncio de recurso cadastrado com sucesso!");
    }

    public void listarAnunciosEmpresa(Empresa empresa) {			//Listagem de Anuncios da Empresa Logada

        boolean encontrou = false;

        System.out.println("\n----- ANÚNCIOS DE MAQUINÁRIO -----");

        for (AnuncioMaquinario anuncio : listaAnuncioMaquinario) {

            if (anuncio.getEmpresaCnpj() == empresa.getCnpj()) {

                System.out.println("Título: " + anuncio.getTitulo());
                System.out.println("Descrição: " + anuncio.getDescricao());
                System.out.println("Valor: R$ " + anuncio.getValor());
                System.out.println("Produto: " + anuncio.getNome());
                System.out.println("Categoria: " + anuncio.getCategoria());
                System.out.println("--------------------------------");
                System.out.println("Informações para Contato:");
                System.out.println("Telefone: " + empresa.getTelefone());
                System.out.println("E-Mail: " + empresa.getEmail());

                encontrou = true;
            }
        }

        System.out.println("\n----- ANÚNCIOS DE RECURSO -----");

        for (AnuncioRecurso anuncio : listaAnuncioRecurso) {

            if (anuncio.getEmpresaCnpj() == empresa.getCnpj()) {

                System.out.println("Título: " + anuncio.getTitulo());
                System.out.println("Descrição: " + anuncio.getDescricao());
                System.out.println("Valor: R$ " + anuncio.getValor());
                System.out.println("Produto: " + anuncio.getNome());
                System.out.println("Categoria: " + anuncio.getCategoria());
                System.out.println("--------------------------------");

                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum anúncio encontrado.");
        }
    }
    
    public void procurarAnuncios() {
        System.out.println("\n===== PROCURAR ANÚNCIOS =====");
        System.out.println("Selecione o Tipo de Anúncio:");
        System.out.println("1 - Maquinário");
        System.out.println("2 - Recurso");
        System.out.println("3 - Todos");
        int tipo = lerInt();
        System.out.println(" ");
        String categoriaSelecionada = "TODAS";

        if (tipo == 1) {
            System.out.println("Filtrar por Categoria:");
            System.out.println("1 - " + Categoria.classificarMaquinario(1));
            System.out.println("2 - " + Categoria.classificarMaquinario(2));
            System.out.println("3 - " + Categoria.classificarMaquinario(3));
            System.out.println("4 - Todas as Categorias");
            int opcao = lerInt();
            if (opcao != 4) {
                categoriaSelecionada = Categoria.classificarMaquinario(opcao);
            }

        } else if (tipo == 2) {
            System.out.println("Filtrar por Categoria:");
            System.out.println("1 - " + Categoria.classificarRecurso(1));
            System.out.println("2 - " + Categoria.classificarRecurso(2));
            System.out.println("3 - " + Categoria.classificarRecurso(3));
            System.out.println("4 - Todas as Categorias");
            int opcao = lerInt();
            if (opcao != 4) {
                categoriaSelecionada = Categoria.classificarRecurso(opcao);
            }
        }
        
        boolean encontrou = false;

        if (tipo == 1 || tipo == 3) {
            System.out.println("\n----- ANÚNCIOS DE MAQUINÁRIO -----");
            for (AnuncioMaquinario anuncio : listaAnuncioMaquinario) {

                boolean categoriaOk = categoriaSelecionada.equals("TODAS")
                                   || anuncio.getCategoria().equals(categoriaSelecionada);

                if (categoriaOk) {
                    exibirAnuncioMaquinario(anuncio);
                    encontrou = true;
                }
            }
        }

        if (tipo == 2 || tipo == 3) {
            System.out.println("\n----- ANÚNCIOS DE RECURSO -----");
            for (AnuncioRecurso anuncio : listaAnuncioRecurso) {

                boolean categoriaOk = categoriaSelecionada.equals("TODAS")
                                   || anuncio.getCategoria().equals(categoriaSelecionada);

                if (categoriaOk) {
                    exibirAnuncioRecurso(anuncio);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("\nNenhum anúncio encontrado para os filtros selecionados.");
        }
    }

    private void exibirAnuncioMaquinario(AnuncioMaquinario anuncio) {
        Empresa empresa = buscarEmpresaPorCnpj(anuncio.getEmpresaCnpj());

        System.out.println("--------------------------------");
        System.out.println("ID:          " + anuncio.getId());
        System.out.println("Título:      " + anuncio.getTitulo());
        System.out.println("Categoria:   " + anuncio.getCategoria());
        System.out.println("Produto:     " + anuncio.getNome());
        System.out.println("Marca:       " + anuncio.getMarca());
        System.out.println("Modelo:      " + anuncio.getModelo());
        System.out.println("Ano:         " + anuncio.getAnoFabricacao());
        System.out.println("Conservação: " + anuncio.getEstadoConservacao());
        System.out.println("Peso:        " + anuncio.getPeso() + " kg");
        System.out.println("Dimensão:    " + anuncio.getDimensao());
        System.out.println("Voltagem:    " + anuncio.getVoltagem());
        System.out.println("Valor:       R$ " + anuncio.getValor());
        System.out.println("Publicado:   " + anuncio.getDataPublicacao());
        System.out.println("Descrição:   " + anuncio.getDescricao());
        if (empresa != null) {
            System.out.println("Empresa:     " + empresa.getRazaoSocial());
            System.out.println("Telefone:    " + empresa.getTelefone());
            System.out.println("E-Mail:      " + empresa.getEmail());
        }
        System.out.println("--------------------------------");
    }

    private void exibirAnuncioRecurso(AnuncioRecurso anuncio) {
        Empresa empresa = buscarEmpresaPorCnpj(anuncio.getEmpresaCnpj());

        System.out.println("--------------------------------");
        System.out.println("ID:          " + anuncio.getId());
        System.out.println("Título:      " + anuncio.getTitulo());
        System.out.println("Categoria:   " + anuncio.getCategoria());
        System.out.println("Produto:     " + anuncio.getNome());
        System.out.println("Quantidade:  " + anuncio.getQuantidade() + " " + anuncio.getUnidadeMedida());
        System.out.println("Peso:        " + anuncio.getPeso() + " kg");
        System.out.println("Valor:       R$ " + anuncio.getValor());
        System.out.println("Publicado:   " + anuncio.getDataPublicacao());
        System.out.println("Descrição:   " + anuncio.getDescricao());
        if (empresa != null) {
            System.out.println("Empresa:     " + empresa.getRazaoSocial());
            System.out.println("Telefone:    " + empresa.getTelefone());
            System.out.println("E-Mail:      " + empresa.getEmail());
        }
        System.out.println("--------------------------------");
    }

    private Empresa buscarEmpresaPorCnpj(long cnpj) {
        for (Empresa e : listaEmpresas) {
            if (e.getCnpj() == cnpj) return e;
        }
        return null;
    }
}
