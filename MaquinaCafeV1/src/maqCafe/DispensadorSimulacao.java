package maqCafe;

public class DispensadorSimulacao implements Dispensador {

    private boolean pediuCafe;
    private boolean pediuCafeCreme;
    private boolean pediuCafeAcucar;
    private boolean pediuCafeCremeAcucar;
    private boolean moeda1Real;
    private boolean moeda5Centavos;
    private boolean moeda10Centavos;
    private boolean moeda25Centavos;
    private boolean moeda50Centavos;
    
	
	@Override
	public void cafePuro() {
		// TODO Auto-generated method stub
		pediuCafe = true;
	}

	@Override
	public void cafeComAcucar() {
		// TODO Auto-generated method stub
		pediuCafeAcucar = true;
	}

	@Override
	public void cafeComCreme() {
		// TODO Auto-generated method stub
		pediuCafeCreme = true;
	}

	@Override
	public void cafeComCremeAcucar() {
		// TODO Auto-generated method stub
		pediuCafeCremeAcucar = true;
	}

	@Override
	public void moeda5Centavos() {
		// TODO Auto-generated method stub
		moeda5Centavos = true;
	}

	@Override
	public void moeda10Centavos() {
		// TODO Auto-generated method stub
		moeda10Centavos = true;
	}

	@Override
	public void moeda50Centavos() {
		// TODO Auto-generated method stub
		moeda50Centavos = true;
	}

	@Override
	public void moeda1Real() {
		// TODO Auto-generated method stub
		moeda1Real = true;
	}

	@Override
	public void moeda25Centavos() {
		// TODO Auto-generated method stub
		moeda25Centavos = true;
	}

}
