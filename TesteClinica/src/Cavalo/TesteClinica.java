package Cavalo;

import java.util.ArrayList;
import java.util.List;

import Cavalo.Paciente;
import org.junit.Test;

public class TesteClinica {

	@Test
	public void TesteQuatro() {
		Paciente ralph = new Paciente("Ralph", "1234");
		ArrayList<Paciente> pacientes = new ArrayList<>();
		pacientes.add(ralph);
		Paciente MensagemPolimorfica = new Paciente("Mensagem Polimorfica", "Cavalo", pacientes);
		Paciente Coletora = new Paciente("Coletora", "Iguana", pacientes);

		double taxa = 50.0;
		Exame exame = new Exame("analise clinica", MensagemPolimorfica, taxa + 300);
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
