package aula05;

import java.util.Scanner;

public class ContaBanco {

	public int numConta;
	protected String tipo;// poupança ou corrente cp ou cc
	private String nome;// dono
	private double saldo;
	private boolean status;// verdadeiro para aberta
	public double qtdValor;

	Scanner scan = new Scanner(System.in);

//abriu cp 150 cc 50 
	// fechar conta esta 0
	//
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ContaBanco() {// se declarar entre parenteses precisa acrescentar o valor quando stanciar o
							// objeto.

		this.saldo = 0;
		this.status = false;
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);

		if (this.getTipo().equalsIgnoreCase("cc")) {
			this.setSaldo(50);
		} else if (this.getTipo().equalsIgnoreCase("cp")) {
			this.setSaldo(150);
		}

	}

	public void fecharConta() {

		if (saldo == 0) {
			status = false;
			System.out.println("Conta encerrada.");
		} else {
			System.out.println("Favor zerar saldo para encerrar.");
		}

	}

	public double depositar(double qtdValor) {

		if (status == true) {
			this.setSaldo(this.getSaldo() + qtdValor);
			System.out.println("Deposito realizado: " + qtdValor + " : " + this.getNome());
		}
		return getSaldo();
	}

	public double sacar(double qtdValor) {

		if (this.getStatus() == true) {

			if (qtdValor <= this.getSaldo()) {
				this.setSaldo(this.getSaldo() - qtdValor);
				System.out.println("Saque realizado: " + qtdValor + " : " + this.getNome());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Conta fechada.");
		}
		return getSaldo();
	}

	// cc 12 cp 20
	public void pagarMensalidade() {

		if (this.getStatus() == true) {

			if (this.getTipo().equalsIgnoreCase("cc")) {
				this.setSaldo(this.getSaldo() - 12);
				System.out.println("Mensalidade debitada: ");
			} else if (this.getTipo().equalsIgnoreCase("cp")) {
				this.setSaldo(this.getSaldo() - 20);
				System.out.println("Mensalidade debitada: ");
			}
		}
	}

	public void extrato() {
		System.out.println("**************************************");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Nome Cliente: " + this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}

}
