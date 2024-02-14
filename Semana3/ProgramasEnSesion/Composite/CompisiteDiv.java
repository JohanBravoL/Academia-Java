package Semana3.ProgramasEnSesion.Composite;

public class CompisiteDiv implements Component{

    Component componentLeft;
	Component componentRight;
                //Constructor
	public CompisiteDiv(Component componentLeft, Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double getValor() {
		return componentLeft.getValor()/componentRight.getValor();
	}
}
