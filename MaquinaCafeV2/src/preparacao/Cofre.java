package preparacao;

import preparacao.Moeda;

import java.util.ArrayList;
import java.util.List;

public class Cofre {
	private List<Moeda> coins = new ArrayList<>();

	public void depositCoin(Moeda coin) {
		coins.add(coin);
	}
	public Boolean chestIsEmpty() {
		return coins.isEmpty();
	}
}
