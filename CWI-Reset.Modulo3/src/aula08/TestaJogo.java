package aula08;

import aula07.Personagem;

public class TestaJogo {
	public static void main(String[] args) {

		Personagem mario = new Personagem("Mario", 40, 1.60);
		Personagem luigi = new Personagem("Luigi", 40, 1.80);

		Jogo jogo = new Jogo(mario, luigi);

		jogo.Jogar();

	}

}
