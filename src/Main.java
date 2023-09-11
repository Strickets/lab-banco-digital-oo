package sources;


import sources.ContaCorrente;
import sources.ContaPoupanca;
import sources.Cliente;
import sources.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente marcos = new Cliente();
		marcos.setNome("marcos");
		
		Conta cc = new ContaCorrente(marcos);
		Conta poupanca = new ContaPoupanca(marcos);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
