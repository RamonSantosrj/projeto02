package repository;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	// m�todo para gravar os dados do funcion�rio
	// em um arquivo de extens�o .TXT
	public void exportar(Funcionario funcionario) throws Exception {

		PrintWriter print = new PrintWriter(new FileWriter("C:\\Users\\ramon\\Desktop\\backup\\Aula Coti Informatica - java web\\aula2.txt", true));

		print.write("\nID...........: " + funcionario.getId());
		print.write("\nNOME.........: " + funcionario.getNome());
		print.write("\nCPF..........: " + funcionario.getCpf());
		print.write("\nMATRICULA....: " + funcionario.getMatricula());
		print.write("\nSALARIO......: " + funcionario.getSalario());
		print.write("...");

		print.flush(); // salvar
		print.close();

	}

}
