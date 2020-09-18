package trabalho;

public class Paciente extends Pessoa {
	private String nomeMedico;
	private String especialidade;
	private int plano;
	private String nivelPrioridade;
	private String tratamento;
	private String diag;
	

	public Paciente(String nome, String CPF, String hora, int idade, String nomeMedico, String especialidade, int plano, String nivelPrioridade, String tratamento, String diag)
	{
		super(nome, CPF, hora, idade);
		this.nomeMedico = nomeMedico;
		this.especialidade = especialidade;
		this.plano = plano;
		this.nivelPrioridade=nivelPrioridade;
		this.tratamento=tratamento;
		this.diag=diag;
	}
	
	public String getNivelPrioridade() {
		return nivelPrioridade;
	}

	public void setNivelPrioridade(String nivelPrioridade) {
		this.nivelPrioridade = nivelPrioridade;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public String getDiag() {
		return diag;
	}

	public void setDiag(String diag) {
		this.diag = diag;
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


	public void infoConsulta() {
		String tipo = tipoPlano(plano); 
		System.out.printf("Informações da consulta:\n\tPaciente: %s\n\tMedico: %s"
				+ "\n\tHorário: %s\n\tEspecialidade: %s\n\tPlano: %s\n\t", super.getNome(),
				nomeMedico, super.getHora(), especialidade, tipo);
		acompanhamento();
	}
	
	public void acompanhamento() {
		if (super.getIdade() < 18) {
			System.out.print("Necessita da presença de uma responsável\n");
		}else {
			System.out.print("Pode comparecer individualmente\n");
		}
	}
	
	public void listaPlano() {
		System.out.print("Tipos de Plano:\n\t1)Individual\n\t2)Familiar\n\t3)Coletivo por Adesão"
				+ "\n\t4)Coletivo empresarial\n\t5)SUS\nPlano do paciente: ");
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
		case 5:
			tipo = "SUS";
			break;
		default:
			tipo = "\tNão encontrado";
		}
		return tipo;
	}
	
	public String gravidade(String nivelPrioridade)
	{
		System.out.println("Classificação de risco de atendimento:");
		if(nivelPrioridade== "vermelho")
		{
			System.out.println("Vermelho: Emergência! O doente deverá ser atendido pelo médico imediatamente");
		}
		else if(nivelPrioridade== "laranja")
		{
			System.out.println("Laranja: Muito urgente! O paciente deverá ser atendido pelo médico em até 10 minutos");
		}
		else if(nivelPrioridade == "amarelo")
		{
			System.out.println("Amarelo: Urgente!! O paciente deverá ser atendido pelo médico em até 60 minutos.");
		}
		else if(nivelPrioridade=="verde")
		{
			System.out.println("Verde: Pouco Urgente. O paciente deverá ser atendido pelo médico em até 120 minutos.");
		}
		else
		{
			System.out.println("Azul: Não urgente. O paciente deverá ser atendido pelo médico em até 240 minutos.");
		}
		return nivelPrioridade;
	}
}
