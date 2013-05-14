import jade.core.Agent;


public class MeuAgente extends Agent{
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
	    System.out.println("Olá! Sou o agente terá um comportamento estranho. Meu nome é: "+getLocalName());
	    int tempos[]={20,30,50,60,80,90,100,110,115,120};
	    int tempos2[]={16,31,42,50,51,52,63,111,117,122};
		addBehaviour(new MeuComportamento(this,tempos));
		addBehaviour(new MeuComportamento(this,tempos2));
	}
}
