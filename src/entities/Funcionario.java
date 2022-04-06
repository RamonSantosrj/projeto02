package entities;

public class Funcionario extends Pessoa {
	private String cpf;
	private String matricula;
	private Double salario;

	public Funcionario(Integer id, String nome, String cpf, String matricula, Double salario) {
		super(id, nome);
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
