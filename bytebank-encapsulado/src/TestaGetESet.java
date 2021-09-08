
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2446);
		//conta.numero = 1337;

		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		//conta.titular = paulo;
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		// em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(paulo);
	}

}
