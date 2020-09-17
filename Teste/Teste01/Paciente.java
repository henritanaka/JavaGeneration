package trabalho;

public class Paciente {
	private String nomePaciente;
	private String nomeMedico;
	private String especialidade;
	private int plano;
	private int idade;
	private String hora;
	
	public Paciente(String nomePaciente,int idade, String nomeMedico, String especialidade, 
			int plano, String hora)
	{
		this.nomePaciente = nomePaciente;
		this.nomeMedico = nomeMedico;
		this.especialidade = especialidade;
		this.plano = plano;
		this.hora = hora;
	}
	public void infoConsulta() {
		String tipo = tipoPlano(plano); 
		System.out.printf("Informações da consulta:\n\tPaciente: %s\n\tMedico: %s"
				+ "\n\tHorário: %s\n\tEspecialidade: %s\n\tPlano: %s\n)", nomePaciente,
				nomeMedico, hora, especialidade, tipo);
		acompanhamento();
	}
	public void acompanhamento() {
		if (idade < 18) {
			System.out.print("Necessita da presença de uma responsável\n");
		}else {
			System.out.print("Pode comparecer individualmente\n");
		}
		
	}
	public void listaPlano() {
		System.out.print("Tipos de Plano:\n\t1)Individual\n\t2)Familiar\n\t3)Coletivo por Adesão"
				+ "\n\t4)Coletivo empresarial\n");
		
	}
	public String tipoPlano(int plano) {
		String tipo = "";
		switch (plano) {
		case 1:
			tipo = "Individual";
			break;
		case 2:
			tipo = "Familiar";
			break;
		case 3:
			tipo = "Coletivo por adesão";
			break;
		case 4:
			tipo = "Coletivo Empresarial";
			break;
		default:
			tipo = "Não encontrado";
		}
		return tipo;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getPlano() {
		return plano;
	}

	public void setPlano(int plano) {
		this.plano = plano;
	}
	
	
	
	

}
