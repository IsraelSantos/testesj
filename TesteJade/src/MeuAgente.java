import jade.core.Agent;


public class MeuAgente extends Agent{
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
	    System.out.println("Olá! Sou o agente terá um comportamento estranho. Meu nome é: "+getLocalName());
		addBehaviour(new MeuComportamento(this));
	}
}
