package aula04;

public class Mario {
	
	private String nome ;
	private int idade;
	private int estamina;
	private double altura;
	
	public Mario() {
		this.nome = "Mario Bros";
		this.altura = 1.50;
		this.idade = 40;
		this.estamina = 100;
	}
	
	public Mario (String nome, int idade, double altura ) {//construtor
		this.nome = nome;
		this.idade = idade;
		this.estamina = 100;
		this.altura = altura;
		
	}
	public void imprimePoderes() {
		System.out.println("Super força, Super salto, super velocidade e outros.");
	}
	
	public void imprimeCaracteristicas() {
		System.out.println("Mario{" + "nome='" + nome + '\''+", altura=" + altura +",idade=" + idade + ",estamina=" + estamina +'}');
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
