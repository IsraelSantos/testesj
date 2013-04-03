import jade.core.Agent;


public class HelloAgent extends Agent{
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
		System.out.println("Hello World!");
		System.out.println("Meu nome é: "+getAID());
		
	}
}
