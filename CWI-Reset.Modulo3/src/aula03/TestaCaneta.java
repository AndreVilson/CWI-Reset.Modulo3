package aula03;

public class TestaCaneta {
	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta();
		
		caneta1.modelo = "Bic20";
		caneta1.cor = "Azul";
		//caneta1.ponta = 0.5;
		caneta1.carga = 80;
		//caneta1.tampada = true;
		
		
		caneta1.tampar();
		caneta1.destampar();
		caneta1.status();
		caneta1.escrever();
		
		
	}

}
