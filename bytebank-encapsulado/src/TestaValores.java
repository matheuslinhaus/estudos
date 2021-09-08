
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(337, 2266);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(337, 24556);
		
		Conta conta3 = new Conta(337, 9999);
		
		System.out.println(Conta.getTotal());
	}

}
