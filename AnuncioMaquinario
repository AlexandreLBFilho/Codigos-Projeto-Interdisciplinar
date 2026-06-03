import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnuncioMaquinario extends Anuncio {
    private String nome;
    private String estadoConservacao;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double peso;
    private String dimensao;
    private String voltagem;
    private String categoria;
    

    private List<Imagem> imagensAdicionais = new ArrayList<>();


    public AnuncioMaquinario(long empresaCnpj, String titulo, String descricao, double valor, LocalDate data, String urlImagem, 
    		boolean principal, String nome, String estadoConservacao, String marca, String modelo, int anoFabricacao, 
    		double peso, String dimensao, String voltagem, int tipoCategoria) {
        super(titulo, descricao, valor, data, urlImagem, principal);
        this.setEmpresaCnpj(empresaCnpj); 
        this.nome = nome;
        this.estadoConservacao = estadoConservacao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.peso = peso;
        this.dimensao = dimensao;
        this.voltagem = voltagem;
        this.categoria = Categoria.classificarMaquinario(tipoCategoria);
    }
    
    public void mostrarAnuncio () {
    	System.out.println("");
    }
    
    public void adicionarImagem(String url) {
        Imagem novaImagem = new Imagem(url, false);
        this.imagensAdicionais.add(novaImagem);
    }

	public String getNome() {
		return this.nome;
	}

	public String getEstadoConservacao() {
		return estadoConservacao;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public double getPeso() {
		return peso;
	}

	public String getDimensao() {
		return dimensao;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public String getCategoria() {
		return categoria;
	}

	public List<Imagem> getImagensAdicionais() {
		return imagensAdicionais;
	}

	public void setImagensAdicionais(List<Imagem> imagensAdicionais) {
		this.imagensAdicionais = imagensAdicionais;
	}

}
