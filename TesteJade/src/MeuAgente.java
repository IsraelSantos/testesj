import jade.core.Agent;


public class MeuAgente extends Agent{
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
	    System.out.println("Ol�! Sou o agente ter� um comportamento estranho. Meu nome �: "+getLocalName());
		addBehaviour(new MeuComportamento(this));
	}
}
