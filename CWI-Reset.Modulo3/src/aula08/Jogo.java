package aula08;

import java.util.Random;

import aula07.Personagem;

public class Jogo {
	
	private Personagem jogador1;
	private Personagem jogador2;
	
	
	public Jogo (Personagem jogador1, Personagem jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	public void Jogar () {
		Random aleatorio = new Random();
		
		int qtdColetaJogador1 = aleatorio.nextInt(30);
		for (int i = 0; i < qtdColetaJogador1; i++) {
			jogador1.coletarMoeda();
		}
		
		int qtdColetaJogador2 = aleatorio.nextInt(30);
		for (int i = 0; i < qtdColetaJogador2; i++) {
			jogador2.coletarMoeda();
		}
		
		
		System.out.println("Quantidade de vezes em que o jogador 1 coletou moedas: " + qtdColetaJogador1);
		System.out.println("Resultado final do jogador 1: ");
		jogador1.imprimeCaracteristicas();
		
		System.out.println("Quantidade de vezes em que o jogador 2 coletou moedas: " + qtdColetaJogador2);
		System.out.println("Resultado final do jogador 2: ");
		jogador2.imprimeCaracteristicas();
	}

	

}
