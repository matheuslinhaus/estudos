
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico stepan");
		nico.setCpf("222.333.444-55");
		nico.setSalario(2597.12);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
