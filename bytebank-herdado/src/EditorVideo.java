
//gerente � um funcionario, Gerente est� herdando da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}
	
}
