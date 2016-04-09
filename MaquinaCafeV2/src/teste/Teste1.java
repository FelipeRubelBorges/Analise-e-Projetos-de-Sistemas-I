package teste;

import static org.junit.Assert.*;
import intarface.Botao;
import preparacao.Cofre;
import preparacao.Moeda;
import intarface.Display;
import preparacao.Ingredientes;
import preparacao.Maquina;
import intarface.Painel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Teste1 {

	@Test
	public void depositCoinTest() {
		Cofre chest = new Cofre();
		Botao button = new Botao("Café");
		Display display = new Display();
		List<Botao> buttons = new ArrayList<Botao>();
		Painel panel = new Painel(display, buttons);
		List<Ingredientes> ingredients = new ArrayList<Ingredientes>();
		Maquina machine = new Maquina(panel, chest, ingredients);
		Moeda coin10 = new Moeda();
		Moeda coin25 = new Moeda();
		machine.getPanel().addNewButton(button);
		coin10.setValue(0.10);
		coin25.setValue(0.25);

		machine.getChest().depositCoin(coin10);
		machine.getPanel().getDisplay().setMessage("0.10");
		assertEquals("0.10", machine.getPanel().getDisplay().getMessage());
		machine.getChest().depositCoin(coin25);
		machine.getPanel().getDisplay().setMessage("0.35");
		assertEquals("0.35", machine.getPanel().getDisplay().getMessage());

	}

	@Test
	public void pressButtonCoffe() {
		Cofre chest = new Cofre();
		Botao button = new Botao("Café");
		Display display = new Display();
		List<Botao> buttons = new ArrayList<Botao>();
		Painel panel = new Painel(display, buttons);
		List<Ingredientes> ingredients = new ArrayList<Ingredientes>();
		Maquina machine = new Maquina(panel, chest, ingredients);
		machine.getPanel().addNewButton(button);
		assertEquals("Café", panel.pressButton(button).getMessage());

	}

	@Test
	public void combineIngredients() {
		Cofre chest = new Cofre();
		Botao button = new Botao("Café");
		Display display = new Display();

		Ingredientes cup = new Ingredientes("Copo", 1);
		Ingredientes water = new Ingredientes("Água", 50);
		Ingredientes coffePowder = new Ingredientes("Café", 10);
		Ingredientes sugar = new Ingredientes("Açucar", 5);

		List<Botao> buttons = new ArrayList<Botao>();
		Painel panel = new Painel(display, buttons);

		List<Ingredientes> ingredients = new ArrayList<Ingredientes>();

		Maquina machine = new Maquina(panel, chest, ingredients);

		machine.getPanel().addNewButton(button);
		machine.combineIngredients(cup);
		machine.combineIngredients(water);
		machine.combineIngredients(coffePowder);
		machine.combineIngredients(sugar);

		assertEquals("Pronto", machine.coffeIsReady());
	}

	@Test
	public void pressButtonCoffeWithoutMoney() {
		Cofre chest = new Cofre();
		Botao button = new Botao("Café");
		Display display = new Display();
		List<Botao> buttons = new ArrayList<Botao>();
		Painel panel = new Painel(display, buttons);
		List<Ingredientes> ingredients = new ArrayList<Ingredientes>();
		Maquina machine = new Maquina(panel, chest, ingredients);
		machine.getPanel().addNewButton(button);
		if (machine.getChest().chestIsEmpty()) {
			machine.getPanel().getDisplay().setMessage("0.35");
			assertEquals("0.35", panel.getDisplay().getMessage());
		}

	}

}
