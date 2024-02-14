package Semana3.ProgramasEnSesion.Composite;
                    //IS-A
public class CompositeResta implements Component{
    
            //HAS-HA
    Component componentLeft;
	Component componentRight;
	
            //Constructor
	public CompositeResta(Component componentLeft, Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double getValor() {
		return componentLeft.getValor() - componentRight.getValor();
	}
}
