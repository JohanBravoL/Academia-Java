package Semana3.ProgramasEnSesion.Composite;
                    //IS-A
public class CompositeSuma implements Component{
    Component componentLeft;
	Component componentRight;
	
            //Constructor
	public CompositeSuma(Component componentLeft, Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}
	@Override
	public double getValor() {
		return componentLeft.getValor() + componentRight.getValor();
	}

}