package preparacao;

import intarface.Painel;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
	private Painel panel;
	private Cofre chest;
	private List<Ingredientes> ingredients = new ArrayList<Ingredientes>();
	
	public Maquina(Painel panel, Cofre chest, List<Ingredientes> ingredients) {
		this.ingredients = ingredients;
		this.panel = panel;
		this.chest = chest;

	}
	public Cofre getChest() {
		return chest;
	}

	public void setChest(Cofre chest) {
		this.chest = chest;
	}
	public Painel getPanel() {
		return panel;
	}
	public void setPanel(Painel panel) {
		this.panel = panel;
	}
	public void combineIngredients(Ingredientes ingredient) {
		this.ingredients.add(ingredient);
	}
	public String coffeIsReady() {
		panel.getDisplay().setMessage("Pronto");
		return panel.getDisplay().getMessage();
	}
}
