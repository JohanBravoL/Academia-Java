package Semana3.ProgramasEnSesion.Composite;

public class CompositeMultiplicacion implements Component{
    
    Component componentLeft;
	Component componentRight;
	
	public CompositeMultiplicacion(Component componentLeft, Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double getValor() {
		return componentLeft.getValor() * componentRight.getValor();
	}
}
