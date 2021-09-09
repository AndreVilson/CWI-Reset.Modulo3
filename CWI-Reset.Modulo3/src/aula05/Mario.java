package aula05;

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

	public void imprimePoderes() {
		System.out.println("Super força, Super salto, super velocidade e outros.");
	}
	
	public void imprimeCaracteristicas() {
		System.out.println("nome: " + nome);
		System.out.println("altura: " + altura);
		System.out.println("Idade: " + idade);
		System.out.println("Estamina: " + estamina);
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
	
	
	public void perderEstamina() {	
	
		this.setEstamina(this.getEstamina() - 10);
		if (this.getEstamina() < 0) {
			this.setEstamina(0);
		}
	}
	
	public void ganharEstamina() {
		
		this.setEstamina(this.getEstamina() + 5);
		if(this.getEstamina()> 100) {
			this.setEstamina(100);
		}
	}
	
	public void crescer() {
		this.setAltura(this.getAltura() * 2);
		
	}
	
	
	
	
	
	
	

}