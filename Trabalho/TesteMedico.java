package trabalho;

public class TesteMedico {
	public static void main(String args[]) {
		Paciente paciente1= new Paciente ("Henrique", "123456", "07:50", 20, "Joaquim", "Clinico Geral", 5, "amarelo", "medicação oral", "amidalite");
		Medico medico1= new Medico ("Joaquim", "789456", "06:00", 50, 12348, "Manhã", "Clinico Geral");
		
		paciente1.listaPlano();
		System.out.println(paciente1.tipoPlano(paciente1.getPlano()));
		System.out.println();
		
		paciente1.infoConsulta();
		paciente1.gravidade(paciente1.getNivelPrioridade());
		
		System.out.println();
		System.out.println(medico1.getInfoMedico());
		System.out.println();
		System.out.println("O médico "+medico1.getNome()+ " irá atender o paciente " +paciente1.getNome()+ " no horário agendado: " +paciente1.getHora());
		System.out.println();
		System.out.println(medico1.getAtestado(paciente1.getNivelPrioridade()));
	}
}