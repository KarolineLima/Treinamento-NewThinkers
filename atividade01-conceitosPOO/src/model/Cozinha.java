package model;
import java.time.LocalTime;
import java.util.List;

public class Cozinha {
	
	private String tipo;
	private int numeroPratos;
	private int numeroCozinheiros;
	private int tempoPreparo;
	private LocalTime horaAbertura;
	private LocalTime horaFechamento;
	private String pratoPrincipal;
	private List<Ingrediente> listaIngredientes;
	private List<Funcionario> listaFuncionario;
	
	public Cozinha() {}
	
	public Cozinha( String tipo,int numeroPratos, int numeroCozinheiros, int tempoPreparo, LocalTime horaAbertura,
			LocalTime horaFechamento, String pratoPrincipal,List<Ingrediente> listaIngredientes, List<Funcionario> listaFuncionario) {

		this.tipo = tipo;
		this.numeroPratos = numeroPratos;
		this.numeroCozinheiros = numeroCozinheiros;
		this.tempoPreparo = tempoPreparo;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.pratoPrincipal = pratoPrincipal;
		this.listaIngredientes = listaIngredientes;
		this.listaFuncionario = listaFuncionario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumeroPratos() {
		return numeroPratos;
	}

	public void setNumeroPratos(int numeroPratos) {
		this.numeroPratos = numeroPratos;
	}

	public int getNumeroCozinheiros() {
		return numeroCozinheiros;
	}

	public void setNumeroCozinheiros(int numeroCozinheiros) {
		this.numeroCozinheiros = numeroCozinheiros;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public LocalTime getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(LocalTime horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public LocalTime getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(LocalTime horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public String getPratoPrincipal() {
		return pratoPrincipal;
	}

	public void setPratoPrincipal(String pratoPrincipal) {
		this.pratoPrincipal = pratoPrincipal;
	}


	public List<Ingrediente> getListaIngredientes() {
		return listaIngredientes;
	}


	public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}

	public List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}

	public void setListaFuncionario(List<Funcionario> listaFuncionario) {
		this.listaFuncionario = listaFuncionario;
	}


	public void prepararPratos(){
		System.out.println("O prato está sendo preparado...");
		System.out.println( pratoPrincipal + " está pronto!");
		
	}
	public void lavarLouca(){
		System.out.println("A louça está sendo lavada!");
		System.out.println("Louça lavada!");
	}


	@Override
	public String toString() {
		return "\n ///// Cozinha "+ tipo
				+ " ///// \n "
				+ "\n -> Funcionamento: " + horaAbertura + "h às " + horaFechamento + "h" 
				+ "\n -> Possui " + numeroPratos + " pratos."
				+ "\n Seu prato principal é " + pratoPrincipal
				+ "\n -> O tempo de preparo é "+ tempoPreparo + "m"
				+ "\n "
				+ "\n -> Os pratos preparados por essa cozinha possuem os seguintes ingredientes: "
				+ "\n "+ listaIngredientes
				+ "\n "
				+ "\n -> Possui " + numeroCozinheiros + " funcionário que são cozinheiro e auxiliares, sendo eles: "
				+ "\n " + listaFuncionario
				+ "\n";
	}


}
