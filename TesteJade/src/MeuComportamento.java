import jade.core.Agent;
import jade.core.behaviours.Behaviour;


public class MeuComportamento extends Behaviour{
	int i=0;
	
	int tempos[];
	
	public MeuComportamento(Agent ent,int tempos[]) {
		super(ent);
		this.tempos=tempos;
	}
	
	boolean existe(int j){
		for (int i=0;i<tempos.length;i++){
			if (tempos[i]==j) 
				return true;
		}
		return false;
	}
	
	public void action() {
		if (!existe(i)){
			System.out.println("Tempo: "+i);
			System.out.println("Olá! Meu nome é: "+ myAgent.getLocalName());
		}
		i++;
	}
	
	public boolean done() {
		return i>200;
	}
}
