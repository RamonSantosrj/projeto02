package principal;

import entities.Funcionario;
import repository.FuncionarioRepository;


public class program {

	public static void main(String[] args) {


		Funcionario funcionario = new Funcionario(1, "Ana", "123.456.789-00", "2022-001", 4000.0);

		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		
		try {
			funcionarioRepository.exportar(funcionario);
		} catch (Exception e) {
			
		System.out.println("\nErro: " + e.getMessage());
		}
		// imprimindo
		System.out.println("DADOS DE FUNCIONÁRIO:");
		System.out.println("ID...........: " + funcionario.getId());
		System.out.println("NOME.........: " + funcionario.getNome());
		System.out.println("CPF..........: " + funcionario.getCpf());
		System.out.println("MATRICULA....: " + funcionario.getMatricula());
		System.out.println("SALARIO......: " + funcionario.getSalario());


		
	}

}
