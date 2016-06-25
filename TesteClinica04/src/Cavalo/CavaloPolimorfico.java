package Cavalo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CavaloPolimorfico {
	
	@Test
	public void TesteQuatro() {
		Paciente ralph = new Paciente("Mensagem Polimorfica", "98764");
		ArrayList<Paciente> pacientes = new ArrayList<>();
		pacientes.add(ralph);
		Paciente MensagemPolimorfica = new Paciente("Mensagem Polimorfica", "Cavalo", pacientes);

		double taxa = 100.0;
		Exame exame = new Exame("Pulou uma cerca, ocasionando lacerações graves", MensagemPolimorfica, taxa);
		List<Exame> exames = new ArrayList<>();
		exames.add(exame);

		ordemExame ordemExame = new ordemExame(exames, ralph, Calendario.getInstance());
		Calendario dtVencimento = Calendario.getInstance();
		Conta conta = ordemExame.geraFatura(dtVencimento);

		Recibo cupomFiscal = fatura.pagar();

		System.out.println("Nome: " + ((Recibo) cupomFiscal).getPaciente().getNome() + "\n" + "Valor: " + cupomFiscal.getValor()
				+ "\nTaxa de emergencia: " + taxa);
	
	}
	
	

}
