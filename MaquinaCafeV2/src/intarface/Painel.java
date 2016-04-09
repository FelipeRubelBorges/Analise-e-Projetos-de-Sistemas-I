package intarface;
import java.util.ArrayList;
import java.util.List;

public class Painel {
	private List<Botao> buttons = new ArrayList<Botao>();
	private Display display;

	public Painel(Display display, List<Botao> buttons) {
		this.display = display;
		this.buttons = buttons;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Display pressButton(Botao button) {
		Display display = new Display();
		display.setMessage(button.getOption());
		return display;
	}
	
	public void addNewButton(Botao button) {
		this.buttons.add(button);
	}
}
