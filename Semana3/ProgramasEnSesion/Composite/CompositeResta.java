package Semana3.ProgramasEnSesion.Composite;

public class CompositeResta implements Component{
    
    Component componentLeft;
	Component componentRight;
	
	public CompositeResta(Component componentLeft, Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double getValor() {
		return componentLeft.getValor() - componentRight.getValor();
	}
}
