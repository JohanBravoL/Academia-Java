package Semana3.ProgramasEnSesion.Composite;

public class LeafConstante implements Component {
	
	private double constante;
	
	public LeafConstante(double constante) {
		this.constante = constante;
	}

	@Override
	public double getValor() {
		return constante;
	}

}