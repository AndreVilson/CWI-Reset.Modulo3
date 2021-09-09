package aula05;

import java.util.Scanner;

public class TestaConta {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaBanco conta1 = new ContaBanco();
		conta1.setNumConta(123);
		conta1.setNome("Jubileu");
		conta1.abrirConta("cc");
		
		
		ContaBanco  conta2 = new ContaBanco();
		conta2.setNumConta(124);
		conta2.setNome("Creuza");
		conta2.abrirConta("cp");
		
		conta1.depositar(100);
		conta2.depositar(500);
		conta2.sacar(100);
		
		conta1.extrato();
		conta2.extrato();
		
	

	}

}
