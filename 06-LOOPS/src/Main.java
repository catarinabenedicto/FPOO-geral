
public class Main {

	public static void main(String[] args) {
		
		LoopWhile objWhile = new LoopWhile();
		LoopWhileSentinela objWhileSentinela = new LoopWhileSentinela();
		LoopFor objLoopFor = new LoopFor();
		LoopDoWhile objDoWhile = new LoopDoWhile();
		
		//objWhile.LoopWhileContador();
		//objWhile.LoopWhileContador2(11);
		objWhileSentinela.loopWhile();
		//objLoopFor.loopFor1();
		//objLoopFor.loopFor2(50);
		//objDoWhile.loopDo();
		objDoWhile.loopDoSentinela();

	}

}
