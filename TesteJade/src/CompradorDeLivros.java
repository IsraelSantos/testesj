import jade.core.Agent;


public class CompradorDeLivros extends Agent{
	
	protected String nomeLivro;
	
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
		
		System.out.println("Eu sou o agente comprador "
							+ getLocalName()
				            +" e estou proto para comprar!");
		Object []args = getArguments();
		
		if (args!=null && args.length > 0){
			nomeLivro=(String) args[0];
			System.out.println("Quero comprar o livro "+ nomeLivro);
		}else{
			System.out.println("Não tenho livros para comprar!");
			doDelete();
		}
	}
	
	@Override
	protected void takeDown() {
		// TODO Auto-generated method stub
		super.takeDown();
		System.out.println("O agente comprador "+ getAID().getName() + " está finalizado!");
	}

}
