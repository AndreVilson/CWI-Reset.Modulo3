package aula04;

public class TestaMario {
	public static void main(String[] args) {

		Mario mario = new Mario();

		mario.imprimeCaracteristicas();
		mario.imprimePoderes();
		System.out.println();

		Mario mario2 = new Mario("Super Mario", 32, 1.25);
		mario2.imprimeCaracteristicas();
		mario2.imprimePoderes();
		System.out.println("");

		Mario mario3 = new Mario();
		mario3.imprimeCaracteristicas();
		mario3.setNome("Mariozin");
		mario3.setIdade(53);
		mario3.imprimeCaracteristicas();
		mario3.imprimePoderes();

	}

}
