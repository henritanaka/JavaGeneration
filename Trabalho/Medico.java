package trabalho;

public class Medico extends Pessoa{
	private int crm;
	private String turno;
	private String especialidade;
	
	public Medico(String nome, String CPF, String hora, int idade, int crm, String turno, String especialidade) {
		super(nome, CPF, hora, idade);
		this.crm= crm;
		this.turno= turno;
		this.especialidade= especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void infoAtestado() {
		System.out.println("Para atestado, no método getAtestado use as opções\n1- Necessita atestado\t2- Não necessita atestado");
	}
	
	public String getAtestado(String atestado) {
		if(atestado != "verde" || atestado != "azul") {
			return "O paciente está incapacitado de trabalhar, necessita atestado."; 
		}
		else {
			return "O paciente está OK, não precisa de atestado.";
		}
	}
	
	public String getInfoMedico() {
		return "O médico " +super.getNome()+ " com CRM " +this.getCrm()+ " da especialidade " +this.getEspecialidade()+ " irá trabalhar no turno da " +this.getTurno()+ " hoje.";
	}
}
