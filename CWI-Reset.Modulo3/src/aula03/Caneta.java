package aula03;

public class Caneta {
	
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;
	
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void escrever() {
		if (tampada == false && carga > 0) {
			System.out.println("escrevendo");
		}else if(tampada == true) {
			System.out.println("Caneta tampada");
		}else if(carga == 0) {
			System.out.println("Sem carga");
		}
	}
	
	
	
	
	
	
	
	
	
	public void rabiscar() {
		
	}
	
	public void pintar() {
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}

}
