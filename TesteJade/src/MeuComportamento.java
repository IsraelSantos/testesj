import jade.core.Agent;
import jade.core.behaviours.Behaviour;


public class MeuComportamento extends Behaviour{
	int i=0;
	
	public MeuComportamento(Agent ent) {
		super(ent);
	}
	
	public void action() {
		System.out.println("Olá! Meu nome é: "+ myAgent.getLocalName());
		i++;
	}
	
	public boolean done() {
		return i>4;
	}
}
